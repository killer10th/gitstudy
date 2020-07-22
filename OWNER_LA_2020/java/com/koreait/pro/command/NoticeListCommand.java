package com.koreait.pro.command;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.pro.dao.NoticeDAO;
import com.koreait.pro.dto.NoticeDTO;

public class NoticeListCommand implements ProCommand {

	// 공지사항 리스트
	
	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		NoticeDAO nDAO =sqlSession.getMapper(NoticeDAO.class);
		ArrayList<NoticeDTO> nDTO = nDAO.selectNoticeList();
		model.addAttribute("list", nDTO);

	}

}
