<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><decorator:title default="Master-layout"/></title>
</head>
<%@include file="/WEB-INF/common/header.jsp" %>
	<decorator:body/>
	
	<decorator:getProperty property="page.script"></decorator:getProperty>

<%@include file="/WEB-INF/common/footer.jsp" %>
</html>

