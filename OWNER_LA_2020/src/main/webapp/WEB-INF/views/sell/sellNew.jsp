<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- 동적인 페이지 포함 -->

<jsp:include page="../template/header.jsp" />
<style type="text/css">
 .main-aside{width:500px; border:1px solid olive;}
    
 input[type=radio]{display:none;}
.tab-contents1{display:none;}
.a:checked ~ div:nth-of-type(1){display:block;}
.tab-contents2{display:none;}
.b:checked ~ div:nth-of-type(2){display:block;}
	
li.content{overflow: hidden; padding:10px; }
li.content div.title{float:left; padding:10px;  }
li.content div.title > div.description{float:left; margin-left:10px;  }
</style>

<script type ="text/javascript">
function fn_Selling(f){
	f.action ='adminuploadProduct';
	f.submit();
}
function fn_Buying(f){
	f.action ='';
	f.submit();
}

</script>

<form  method ="post">

<div class="main-aside">
	
			<input class="a" id ="판매" type ="radio"  name ="tab" checked />
			<input class="b" id ="구매" type ="radio"  name ="tab"  />
	
			<section class='tab-button'>
				<label for ="판매">판매</label>
				<label for ="구매">구매</label>
			</section>
			<div class ="tab-contents1">
				<ul>
				<li class ="content">
							<div class ="title">
								작성자
							</div>
							<div class ="description">
								${mDTO.m_Name}
							</div>
					</li>
					<li class ="content">
							<div class ="title">
								판매가격
							</div>
							<div class ="description">
								<input type ="text" name ="s_Price"/>
							</div>
					</li>
					<li class ="content">
							<div class ="title">
								즉시판매가
							</div>
							<div class ="description">
								<input type ="text" name ="s_Immediateprice"/>
							</div>
					</li>
					<li class ="content">
							<div class ="title">
								만료일
							</div>
							<div class ="description">
								<input type ="date" name ="s_Expiredate"/>
							</div>
					</li>
					<li class ="content">
							<div class ="title">상품명
							</div>
							<div class ="description">
								<input type="text" name ="p_Name"/> 
							</div>
						</li>	
						<li class ="content">
							<div class ="title">카테고리
							</div>
							<div class ="description">
								<select name ='p_Category'>
									<option value ="의류">의류</option>
									<option value ="신발">신발</option>
									<option value ="잡화">잡화</option>
									<option value ="서적">서적</option>
									<option value ="악세사리">악세사리</option>
								</select>
							</div>
						</li>	
						<li class ="content">
							<div class ="title">브랜드명
							</div>
							<div class ="description">
								<input type="text" name ="p_Brand"/> 
							</div>
						</li>	
						<li class ="content">
							<div class ="title">사진
							</div>
							<div class ="description">
								<input type="file" name ="p_IMG_PATH"/>  
							</div>
						</li>	
						<li class ="content">
							<div class ="mergin">
							<input type="hidden" name="m_No"  value="${mDTO.m_No}"/>
								<input type="button" value="판매하기" onclick="fn_Selling(this.form)"/>  
							</div>
						</li>	
				</ul>
			</div>
			<div class ="tab-contents2">
				<ul>
					<li class ="content">
							<div class ="title">
								작성자
							</div>
							<div class ="description">
								${mDTO.m_Name}
							</div>
					</li>
					<li class ="content">
							<div class ="title">
							가격
							</div>
							<div class ="description">
								<input type ="text" name ="b_Price"/>
							</div>
					</li>
						<li class ="content">
							<div class ="title">만료일
							</div>
							<div class ="description">
								<input type ="text" name ="b_Expiredate"/>
							</div>
						</li>	
						<li class ="content">
							<div class ="title">상품명
							</div>
							<div class ="description">
								<input type="text" name ="p_Name"/> 
							</div>
						</li>	
						<li class ="content">
							<div class ="title">카테고리
							</div>
							<div class ="description">
								<select name ='p_Category'>
									<option value ="의류">의류</option>
									<option value ="신발">신발</option>
									<option value ="잡화">잡화</option>
									<option value ="서적">서적</option>
									<option value ="악세사리">악세사리</option>
								</select>
							</div>
						</li>	
						<li class ="content">
							<div class ="title">브랜드명
							</div>
							<div class ="description">
								<input type="text" name ="p_Brand"/> 
							</div>
						</li>	
						<li class ="content">
							<div class ="title">사진
							</div>
							<div class ="description">
								<input type="file" name ="p_IMG_PATH"/>  
							</div>
						</li>	
						<li class ="content">
							<div class ="mergin">
								<input type="button" value="글올리기" onclick="fn_Buying(this.form)"/>  
							</div>
						</li>	
				</ul>
			</div>
		</div>
</form>

<!-- 정적인 페이지 포함 -->
<%@ include file="../template/footer.jsp" %>