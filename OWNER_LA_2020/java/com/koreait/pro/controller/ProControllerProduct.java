package com.koreait.pro.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.koreait.pro.command.ProCommand;
import com.koreait.pro.command.ProductDeleteCommand;
import com.koreait.pro.command.ProductInsertCommand;
import com.koreait.pro.command.ProductListCommand;
import com.koreait.pro.command.ProductViewCommand;
import com.koreait.pro.command.productUpdateCommand;
import com.koreait.pro.command.productUpdatePageCommand;
import com.koreait.pro.command.productUpdateStateCommand;

@Controller
public class ProControllerProduct {
	
	@Autowired
	private SqlSession sqlSession;
	private ProCommand proCommand;
	
	// 상품등록 페이지 - 김수범, 송원섭
	@RequestMapping("productInsertPage")
	public String productInsert() {
		return "product/productInsertPage";
	}
	
	@RequestMapping(value="productInsert", method=RequestMethod.POST)
	public String productInsert(Model model, MultipartHttpServletRequest request) {
		/*model.addAttribute("rttr", rttr);*/
		model.addAttribute("request", request);
		proCommand = new ProductInsertCommand();
		proCommand.execute(sqlSession, model);
		return "redirect:productListPage";
	}
	
	// 메인 페이지 (판매 목록 리스트) - 김수범, 송원섭
	@RequestMapping("productListPage")
	public String productMainPage(Model model) {
		proCommand = new ProductListCommand();
		proCommand.execute(sqlSession, model);
		return "product/productListPage";
	}
	
	// 본인이 올린 상품 삭제 - 김수범, 송원섭
	@RequestMapping("productDelete")
	public String productDelete(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		proCommand = new ProductDeleteCommand();
		proCommand.execute(sqlSession, model);
		return "redirect:productListPage";
	}
	   // 판매 상품 수정페이지로 이동 - 김수범, 송원섭
	   @RequestMapping("productUpdatePage")
	   public String productUpdatePage(HttpServletRequest request, Model model) {
	      model.addAttribute("request", request);
	      proCommand = new productUpdatePageCommand();
	      proCommand.execute(sqlSession, model);
	      return "product/productUpdatePage";
	   }
	   
	   // 판매 상품 수정하기 - 김수범, 송원섭
	   @RequestMapping(value="productUpdate", method=RequestMethod.POST)
	   public String productUpdate(MultipartHttpServletRequest request, Model model) {
	      model.addAttribute("request", request);
	      proCommand = new productUpdateCommand();
	      proCommand.execute(sqlSession, model);
	      return "redirect:productViewPage";
	   }
	   
	// 구매 페이지로 이동 - 김수범, 송원섭
	   @RequestMapping("productViewPage")
	   public String productViewPage(HttpServletRequest request, Model model) {
	      model.addAttribute("request", request);
	      proCommand = new ProductViewCommand();
	      proCommand.execute(sqlSession, model);
	      return "product/productViewPage";
	   }
	   
	   // 구매 클릭후 상품 상태 변경 - 김수범, 송원섭
	   @RequestMapping("productUpdateState")
	   public String productUpdateState(HttpServletRequest request, Model model) {
	      model.addAttribute("request", request);
	      proCommand = new productUpdateStateCommand();
	      proCommand.execute(sqlSession, model);
	      return "redirect:productListPage";
	   }
}
