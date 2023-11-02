<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit - Training</title>
<%@include file="../../common/taglib.jsp" %>
</head>
<body>
	<div id="main">
		<div class="header">
			<h3 class="header-text">Training</h3>
			<div class="header-br"></div>
		</div>
		<div class = "edit-container">
			<div class = "edit-container__header">
				<span class = "edit-container__headerText edit-container__headerText">Login > Search Customer > Edit Customer Info</span>
				<div class = "edit-container__wellcom">
				<div class = "edit-container__wellcomLeft edit-container__headerText">
				Welcome
			</div>
		</div>
	<form:form action="./T003" method="POST" modelAttribute="customer">
		<div class="edit-container__content">
			<div class="edit-container__content--error">
			</div>
			<div class="edit-container__content-Id">
				<div class="edit-container__content-IdText edit-container__headerText">Customer Id</div>
			</div>
			 	 <form:input type="hidden" path="customerId"/>
			 	 <label for=dtoCustomerId class="edit-container__content-IdLable edit-container__headerText" id ="lblCustomerID"></label>
			<div class="edit-container__content-Name">
				<label class="edit-container__contentName-input edit-container__headerText">Customer Name</label>
				<form:input path="customerName"/>
			</div>		
				<div class="edit-container__content-Sex edit-container__btnContent-margin">
				<div class="edit-container__content-Sexlable edit-container__headerText">Sex</div>
		    	<select name="sex" >
			    	 <option value="" class="cbooption"></option>
			    	<option class="cbooption" value="0">Male</option>
			    	<option class="cbooption" value="1">Female</option>
		    	</select>  
			</div>
			<div class="edit-container__content-Birthday edit-container__btnContent-margin">
				<div class="edit-container__contentBirthday-input edit-container__headerText">Birthday</div>
				<form:input path="birthDay" maxlength="10"/>
			</div>
			<div class="edit-container__content-Email edit-container__btnContent-margin">
				<div class="edit-container__contentEmail-input edit-container__headerText">Email</div>
				<form:input path="email"/>
			</div>
			<div class="edit-container__content-Address edit-container__btnContent-margin">
				<div class="test-aline__editAddress">				
					<div class="edit-container__contentAddress-input edit-container__headerText">Address</div>
				</div>
				<form:textarea path="address"></form:textarea>
			</div>
			<div class="edit-container__btnContent">
				<button type="submit" class="edit-container__btnContent-Save">Save</button>
				<button type="button"  id="btnClearEdit" class="edit-container__btnContent-Clear">Clear</button>
			</div>
		</div>
	</form:form>
		</div>
		<div class="footer">
			<div class="header-br"></div>
			<div class="footer-text__copyright">Copyright (c) 2000-2008
			FUJINET, All Rights Reserved.</div>
		</div>
	</div>
	</div>
</body>
</html>