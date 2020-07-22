package com.koreait.pro.dao;

import java.util.ArrayList;

import com.koreait.pro.dto.ProductDTO;

public interface ProductDAO {
	
	// 게시글 등록
	 public void productInsert(int s_No, String p_Name, String p_Cartegory, String p_Content, int p_Price, String p_Img_Path);
	
	// 판매 상품 리스트 메인페이지에 가져오기 
	public ArrayList<ProductDTO> selectProductList();

	// 상품 번호로 불러오기 VIEW 
	public ProductDTO selectProductByNo(int p_no);

	// 구매버튼 클릭시 상태 변경
    public void ProductUpdateState(int m_No, int p_No);

    // 본인이 올린 판매상품 삭제
    public void ProductDelete(int p_No);
    
    // 판매상품 수정
    public void ProductUpdate(int p_No, String p_Name, String p_Cartegory, String p_Content, int p_Price, String p_Img_Path);
}
