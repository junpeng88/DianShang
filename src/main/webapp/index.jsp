<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@page import="myEntity.T_MALL_USER"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商城首页</title>
<script type="text/javascript" src="<%=application.getContextPath() %>/js/jquery-1.4.4.js"></script>
<script type="text/javascript">
	function show_fenlei2(fenlei1_id){
		$.getJSON("<%=application.getContextPath() %>/js/json/fenlei2_"+fenlei1_id+".js",function(json){
			$("#fenlei2").empty();
			$(json).each(function(i,data){
				var show = "<a href='search_product_by_fenlei2/"+data.id+"/"+fenlei1_id+".action' >"+data.twoname+"</a><br/>";
				$("#fenlei2").append(show);		
			});
		});
	}
	
	function show_clean(){
		$("#fenlei2").empty();
	}
</script>
</head>
<body>
	商城首页
	<c:if test="${user==null}">
		<a href="to_login.action">
			请登录
		</a>
	</c:if>
	<c:if test="${user!=null}">
			欢迎登录，${user.name}
	</c:if>
	<hr>
	<div id="fenlei1">
		<a href="javascript:;" onmouseover="show_fenlei2('6')">服装鞋帽</a><br/><br/>
		<a href="javascript:;" onmouseover="show_fenlei2('7')">家用电器</a><br/><br/>
		<a href="javascript:;" onmouseover="show_fenlei2('8')">电脑办公</a><br/><br/>
		<a href="javascript:;" onmouseover="show_fenlei2('9')">清洁用品</a><br/><br/>
	</div>
	<div id="fenlei2" style="width:100px;height:100%;border:solid 1px red;" >
	</div>

</body>
</html>