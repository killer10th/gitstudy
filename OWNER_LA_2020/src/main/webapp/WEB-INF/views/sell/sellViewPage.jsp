<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!-- 동적인 페이지 포함 -->
<jsp:include page="../template/header.jsp" />


<div class="product-wrap">
	<div class="product-left-wrap">
		이미지 
	</div>
	<div class="product-right-wrap">
		<table border="1">
			<thead>
				<tr>
					<th colspan ="3">${pDTO.p_Name}</th>
				</tr>
			</thead>	
			<tbody>	
				<tr>
					<td>판매자 </td>
					<td> 
					이름 : ${moDTO.m_Name } <br>
					아이디 :${moDTO.m_Id } 
					<td>
					번호 : ${moDTO.m_No }<br>
					회원 등급 : ${moDTO.m_Grade } </td>
				</tr>
				<tr>
					<td rowspan ="3">가격</td>
					<td>즉시 구매 가격  </td> 
					<td>${sDTO.s_Immediateprice}</td>
				</tr>
				<tr>
					<td>판매자최소판매 금액  </td> 
					<td>${sDTO.s_Price}</td>
				</tr>
				<tr>
					<td>구매하고 싶은가격  </td> 
					<td><input type ="text" name =""></td>
				</tr>
				<tr>
					<td>판매만료기간</td>
					<td colspan ="2">${sDTO.s_Expiredate}</td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan ="3">
						<input type="button" value ="삭제"/> 
						<input type="button" value ="수정"/>
						<input type="button" value ="리스트" onclick="location.href ='product'"/>  
					</td>
				</tr>
			</tfoot>
		</table>
	</div>	
</div>			
<!-- 정적인 페이지 포함 -->
<%@ include file="../template/footer.jsp" %>