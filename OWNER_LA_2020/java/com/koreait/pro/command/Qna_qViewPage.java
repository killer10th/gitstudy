package com.koreait.pro.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.pro.dao.Qna_qDAO;
import com.koreait.pro.dto.Qna_QDTO;

public class Qna_qViewPage implements ProCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
			
			Map<String, Object> map = model.asMap();
			HttpServletRequest request  = (HttpServletRequest) map.get("request");
			int m_No = Integer.parseInt(request.getParameter("m_No"));
			
			Qna_qDAO qDAO = sqlSession.getMapper(Qna_qDAO.class);
			ArrayList<Qna_QDTO> qDTO = qDAO.selectQNAList(m_No);
			model.addAttribute("list", qDTO);
	}

}
