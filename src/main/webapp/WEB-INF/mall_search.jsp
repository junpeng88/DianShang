<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
			商品信息搜索页
		</title>
		<link rel="shortcut icon" type="jd/imge/icon" href="jd/img/jd.ico">
		<script type="text/javascript" src="<%=application.getContextPath() %>/js/jquery-1.4.4.js"></script>
		<script type="text/javascript">
			function product_by_value(fenlei2_id,attr_id,value_id){
				
				// dataStr拼接后台的检索分类属性值组参数
				var lvalue_id = new Array();
				var lattr_id = new Array();
				lvalue_id = $("input[name='lvalue_id']");  
				lattr_id = $("input[name='lattr_id']");
				var dataStr = "";
				dataStr = "fenlei2_id="+fenlei2_id;
				for(var i=0;i<lattr_id.length;i++){
					dataStr = dataStr+"&lav["+i+"].attr_id="+lattr_id[i].value+"&lav["+i+"].value_id="+lvalue_id[i].value;
				}
				
				// location.assign("<%=application.getContextPath()%>/search_product_by_fenlei2/"+fenlei2_id+"/1.action");
				// 提交请求传递参数，jquery无法做到传递springmvc对象集合
				$.ajax({type:"POST",
					   url:"<%=application.getContextPath()%>/search_product_by_value.action",
					   data:dataStr,
					   success:function(data){
					   		$("#product_container").html(data);
					   }
				});
			}
		
			function product_by_value_add(fenlei2_id,attr_id,value_id,value,value_name){

				// 显示检索分类属性名
				$("#search_content").append(" <div color='red' id='show_attr_"+attr_id+"'><a href='javascript:;' onclick='product_by_value_rm("+fenlei2_id+","+attr_id+","+value_id+")'>"+value+value_name+"</div> ");
				$("#attr_"+attr_id).hide();

				// 在页面保存检索分类属性值
				$("#search_content").append("<input type='hidden' id='remove_"+value_id+"' value='"+value_id+"' name='lvalue_id'/>");
				$("#search_content").append("<input type='hidden' id='remove_"+attr_id+"' value='"+attr_id+"' name='lattr_id'/>");
				
				
				//提交检索请求
				product_by_value(fenlei2_id,attr_id,value_id);
	
			}
			
			function product_by_value_rm(fenlei2_id,attr_id,value_id){
				$("#show_attr_"+attr_id).remove();
				$("#attr_"+attr_id).show();
				
				// 在页面移除隐藏的检索条件
				$("#remove_"+value_id).remove();
				$("#remove_"+attr_id).remove();
				// 提交检索请求
				product_by_value(fenlei2_id,attr_id,value_id);
			}
		</script>
	</head>
	<body>
		<div id="search_content">商品信息搜索页</div><br>
			
		<c:forEach items="${lav}" var="av" >
			<div id="attr_${av.id}">
				${av.attribute}：
				<c:forEach items="${av.lvalue}" var="value">
					<a  href="javascript:;" onclick="product_by_value_add(${av.fenlei2_id},${av.id},${value.id},'${value.value}','${value.value_name}')">${value.value}${value.value_name}</a>
					&nbsp;
				</c:forEach>
			</div>
			<br >
		</c:forEach>
		<hr>
		<div id="product_container">
			<c:forEach items="${lsku}" var="sku">
				<img src="<%=application.getContextPath() %>/upload/${sku.product.pimage}"/>${sku.sku_name}<br>
			</c:forEach>
		</div>

	</body>

</html>