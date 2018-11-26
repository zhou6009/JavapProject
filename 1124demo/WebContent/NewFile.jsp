<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function getAjax(){
		var name = document.getElementById("name").value;
		var ajax;
		if(window.XMLHttpRequest){
			ajax=new XMLHttpRequest();
		}
	    ajax.onreadystatechange=function(){
			if(ajax.readyState==4){
				if(ajax.status==200){
					var result=ajax.responseText;
					eval("var p="+result);
					var table=document.getElementById("table");
					var tr=table.insertRow(1);
					var cell0=tr.insertCell(0);
					cell0.innerHTML=p.name;
					
					var cell1=tr.insertCell(1);
					cell1.innerHTML=p.description;
					
					var cell2=tr.insertCell(2);
					cell2.innerHTML=p.price;
					
					var cell3=tr.insertCell(3);
					cell3.innerHTML=p.discountprice;
					
					/*var showdiv=document.getElementById("showdiv");
					showdiv.innerHTML=result;*/
				}
			}
		}
		ajax.open("get","ps?name="+name);
		ajax.send(null);
	}
</script>
<style type="text/css">
		#showdiv{
			border: solid 2px;
			width:  200px;
			height: 100px
		}
</style>
</head>
<body>
<h3>欢迎来到本商店</h3>
<input type="text" name="name" id="name"/>
<input type="submit" name="button" value="搜索" onclick="getAjax()"/>
<div id="showdiv"></div>
<table border="2" id="table">
<tr>
			<td>商品名称</td>
			<td>商品描述</td>
			<td>商品图片</td>
			<td>商品价格</td>
			<td>折后价</td>
			<td>操作</td>
		</tr>
</table>
</body>
</html>