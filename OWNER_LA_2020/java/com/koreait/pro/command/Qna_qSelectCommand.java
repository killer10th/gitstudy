package com.koreait.pro.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.pro.dao.Qna_qDAO;
import com.koreait.pro.dto.Qna_QDTO;

public class Qna_qSelectCommand implements ProCommand {

	@Override
	   public void execute(SqlSession sqlSession, Model model) {
	
	      Map<String, Object> map = model.asMap();
	      HttpServletRequest request = (HttpServletRequest) map.get("request");
	      
	      String column = request.getParameter("column");
	      String query = request.getParameter("query");
	      
	      Map<String, String> map2 = new HashMap<String, String>();
	      map2.put("column", column);
	      map2.put("query", query);
	      
	      Qna_qDAO qDAO = sqlSession.getMapper(Qna_qDAO.class);
	      
	      ArrayList<Qna_QDTO> list = qDAO.selectQna_q(map2);
	      model.addAttribute("list",list);
	   }

}