<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!-- 동적인 페이지 포함 -->
<jsp:include page="../template/header.jsp" />
<form action ="insertItem" method ="post">
<table>
<caption>상품등록</caption>
<tbody>
<tr>
		<td>판매상태</td>
		<td>
			<select name ='category'>
				<option value ="판매완료">판매완료</option>
				<option value ="판매완료">판매중</option>
				<option value ="판매완료">판매중단</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>카테고리</td>
		<td>
			<select name ='p_Category'>
				<option value ="의류">의류</option>
				<option value ="신발">신발</option>
				<option value ="잡화">잡화</option>
				<option value ="서적">서적</option>
				<option value ="악세사리">악세사리</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>판매가격</td>
		<td>
			<input type="text" name ="s_Price"/> 
		</td>
	</tr>
	<tr>
		<td>즉시판매가</td>
		<td>
			<input type="text" name ="s_Immediateprice"/> 
		</td>
	</tr>
	<tr>
		<td>판매만료일</td>
		<td>
			<input type="text" name ="s_Expiredate"/> 
		</td>
	</tr>
	<tr>
		<td>대표사진</td>
		<td>
			<input type="file" name ="p_IMG_PATH"/> 
		</td>
	</tr>
	<tr>
		<td>상세사진</td>
		<td>
			<input type="file" value =""/> 
		</td>
	</tr>
</tbody>
<tfoot>
	<tr>
		<td colspan ="2">
		<input type="submit" value ="업로드"/> 
		<input type="reset" value ="재작성"/>
		</td>
	</tr>
</tfoot>	
</table>
</form>

<!-- 정적인 페이지 포함 -->
<%@ include file="../template/footer.jsp" %>