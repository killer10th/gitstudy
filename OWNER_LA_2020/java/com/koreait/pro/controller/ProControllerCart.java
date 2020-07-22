package com.koreait.pro.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.koreait.pro.command.ProCommand;

@Controller
public class ProControllerCart {
	
	@Autowired
	private SqlSession sqlSession;
	private ProCommand proCommand;
}
