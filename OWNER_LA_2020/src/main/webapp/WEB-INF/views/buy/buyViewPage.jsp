<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!-- 동적인 페이지 포함 -->
<jsp:include page="../template/header.jsp" />


<br/></br>

	구매목록
	
	<table border="1">
		<thead>
			<tr>
				<td>번호</td>
				<td>상품번호</td>
				<td>입찰가</td>
				<td>입찰기간</td>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty bDTO }">
				<tr>
					<td colspan="4">구매목록이 없습니다.</td>
				</tr>
			</c:if>
			<c:if test="${not empty bDTO }">
				<c:forEach var="bDTO" items="${bDTO }">
					<tr>
						<td>${bDTO.b_No }</td>
						<td>${bDTO.p_No }</td>
						<td>${bDTO.b_Price }</td>
						<td>${bDTO.b_Expiredate }</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
		<tfoot>

		</tfoot>





</table>
	
			
<!-- 정적인 페이지 포함 -->
<%@ include file="../template/footer.jsp" %>













