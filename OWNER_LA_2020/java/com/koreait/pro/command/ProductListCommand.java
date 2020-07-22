package com.koreait.pro.command;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.pro.dao.ProductDAO;
import com.koreait.pro.dto.ProductDTO;

public class ProductListCommand implements ProCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		ProductDAO pDAO = sqlSession.getMapper(ProductDAO.class);
		ArrayList<ProductDTO> pDTO = pDAO.selectProductList();
		model.addAttribute("pDTO", pDTO);

	}

}
