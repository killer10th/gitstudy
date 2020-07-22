package com.koreait.pro.command;

import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.pro.dao.MemberDAO;
import com.koreait.pro.dto.MemberDTO;

public class MemberLoginCommand implements ProCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {

		try {
			Map<String, Object> map = model.asMap();
			HttpServletRequest request = (HttpServletRequest)map.get("request");
			HttpServletResponse response = (HttpServletResponse)map.get("response");
			response.setContentType("text/html; charset=UTF-8");
			
			String m_Id = request.getParameter("m_Id");
			String m_Pw = request.getParameter("m_Pw");
			MemberDAO mDAO = sqlSession.getMapper(MemberDAO.class);

			MemberDTO loginDTO = mDAO.selectBymIdmPw(m_Id, m_Pw);

			HttpSession session = request.getSession();

			session.setAttribute("mDTO", loginDTO);
			
			
			String saveIDChk = request.getParameter("saveIDChk");
			Cookie cookie = null;
			// 1. 아이디 기억하기(saveIDChk)를 체크했다면,
			if ( saveIDChk != null ) {
				cookie = new Cookie("savedID", URLEncoder.encode(m_Id, "utf-8")); 
				// 쿠키이름(savedID), 사용자의 아이디가 쿠키값으로 저장된다. 보안+
				cookie.setMaxAge(60 * 60 * 24 * 7);  // savedID 쿠키는 일주일간 유효하다.
				response.addCookie(cookie);  // savedID 쿠키를 사용자의 웹 브라우저(쿠키저장소)에 저장한다.
			}

			// 2. 아이디 기억하기(saveIDChk)를 체크하지 않았다면,
			// 기존에 생성된 savedID 쿠키 여부를 확인해서 삭제
			else {
				Cookie[] ckList = request.getCookies();
				if ( ckList != null && ckList.length > 0 ) {
					for ( Cookie ck : ckList ) {
						if ( ck.getName().equals("savedID") ) {
							cookie = new Cookie("savedID", URLEncoder.encode("", "utf-8"));
							cookie.setMaxAge(0);
							response.addCookie(cookie);
							break;
						}
					}
				}
			}
			
			
			if (loginDTO != null) {
				session = request.getSession();
				session.setAttribute("loginDTO", loginDTO);  // 로그인에 성공하면 회원정보가 session 에 저장된다.
			} else {
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script type='text/javascript'>");
				out.println("alert('제출된 정보와 일치하는 회원이 없습니다.');");
				out.println("history.back();");
				out.println("</script>");
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}