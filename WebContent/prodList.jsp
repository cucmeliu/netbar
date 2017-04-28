<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<link rel="stylesheet" href="css/layout.css" />
<link rel="stylesheet" href="css/bootstrap.css" />
<script src="js/bootstrap.js"></script>
<script src="js/jquery-1.11.2.js"></script>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>商品列表</h1>

<div class="search">
	<form action="ProdListServlet">
		商品条码<input type="text" /> 商品名称<input type="text" /> <input
			type="button" value="搜索" />
	</form>
</div>

<br />
<a href="ProdListServlet">显示所有商品</a>
<br />


<table class="table table-striped table-bordered">
	<thead>
		<tr>
			<th>条码</th>
			<th>名称</th>
			<th>类型</th>
			<th>售价</th>
			<th>操作</th>
		</tr>
	</thead>

	<c:forEach items="${requestScope.list }" var="prod">
		<tr>
			<td>${prod.productId }</td>
			<td>${prod.productName }</td>
			<td>${prod.categoryName }</td>
			<td>${prod.salePrice }</td>
			<td><a href="ProdDetailServlet?id=${prod.productId }">详情</a> | <a
				href="ProdEditServlet?id=${prod.productId }">编辑</a> | <a
				href="ProdDelServlet?id=${prod.productId }">删除</a></td>
		</tr>
	</c:forEach>

</table>
<br />
<div>首页 上页 下页 尾页</div>


