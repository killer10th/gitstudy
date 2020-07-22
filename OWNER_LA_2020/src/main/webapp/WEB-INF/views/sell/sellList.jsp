<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!-- 동적인 페이지 포함 -->
<jsp:include page="../template/header.jsp" />

	<table border ="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>판매자</th>
				<th>상품번호</th>
				<th>판매가격</th>
				<th>즉시구매가</th>
				<th>판매종료기간</th>
				<th>판매상태</th>
			</tr>
		</thead>
		<tbody>
		<c:if test ="${empty list }">
			<tr>
				<td colspan ="7">없음</td>
			</tr>
		</c:if>
		<c:if test ="${not empty list }">
			<c:forEach var ="sDTO" items="${list }">
			<tr>
				<td>${sDTO.s_No}</td>
				<td>${sDTO.m_No}</td>
				<td><a href ="view?s_No=${sDTO.s_No}&m_No=${sDTO.m_No}&p_No=${sDTO.p_No}">${sDTO.p_No}</a></td>
				<td>${sDTO.s_Price}</td>
				<td>${sDTO.s_Immediateprice}</td>
				<td>
				<fmt:formatDate value="${sDTO.s_Expiredate }" type="date"/>
				</td>
				<td>${sDTO.s_State}</td>
			</tr>	
			</c:forEach>
		</c:if>	
		</tbody>
		<tfoot>
			<tr>
				<td colspan ="7">
					<input type ="button" value ="New" onclick="location.href='adminNewProduct'"/>
				</td>
			</tr>
		</tfoot>
	</table>
			
<!-- 정적인 페이지 포함 -->
<%@ include file="../template/footer.jsp" %>