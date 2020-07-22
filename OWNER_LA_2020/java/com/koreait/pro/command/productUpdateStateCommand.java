package com.koreait.pro.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.pro.dao.MemberDAO;
import com.koreait.pro.dao.ProductDAO;

public class productUpdateStateCommand implements ProCommand {

   @Override
   public void execute(SqlSession sqlSession, Model model) {
      
      Map<String, Object> map = model.asMap();
      HttpServletRequest request = (HttpServletRequest) map.get("request");
      
      int p_No = Integer.parseInt(request.getParameter("p_No"));
      int m_No = Integer.parseInt(request.getParameter("m_No"));

      ProductDAO pDAO = sqlSession.getMapper(ProductDAO.class);
      pDAO.ProductUpdateState(m_No, p_No);
         
      MemberDAO mDAO1 = sqlSession.getMapper(MemberDAO.class);
      mDAO1.MemberUpdatePrice1(p_No);
      
      MemberDAO mDAO2 = sqlSession.getMapper(MemberDAO.class);
      mDAO2.MemberUpdatePrice2(p_No);
      

   }

}