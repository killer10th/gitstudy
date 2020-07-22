package com.koreait.pro.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.pro.dao.MemberDAO;

public class MemberMoneyChargeCommand implements ProCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		int m_No = Integer.parseInt(request.getParameter("m_No"));
		int m_Money= Integer.parseInt(request.getParameter("m_Money"));
		
		MemberDAO mDAO = sqlSession.getMapper(MemberDAO.class);
		
		mDAO.moneyCharge(m_No, m_Money);

	}

}
