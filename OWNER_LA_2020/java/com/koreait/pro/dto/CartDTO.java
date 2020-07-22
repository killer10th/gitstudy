package com.koreait.pro.dto;

public class CartDTO {
	
	private int c_No, p_No;
	private String m_Id;
	
	public CartDTO() {}

	public CartDTO(int c_No, int p_No, String m_Id) {
		super();
		this.c_No = c_No;
		this.p_No = p_No;
		this.m_Id = m_Id;
	}

	public int getC_No() {
		return c_No;
	}

	public void setC_No(int c_No) {
		this.c_No = c_No;
	}

	public int getP_No() {
		return p_No;
	}

	public void setP_No(int p_No) {
		this.p_No = p_No;
	}

	public String getM_Id() {
		return m_Id;
	}

	public void setM_Id(String m_Id) {
		this.m_Id = m_Id;
	}

	
}
