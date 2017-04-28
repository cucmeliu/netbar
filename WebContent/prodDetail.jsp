<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>商品详情</h1>

<dl class="dl-horizontal">
	<dt>编号</dt>
	<dd>${requestScope.prod.productId }</dd>

	<dt>商品名</dt>
	<dd>${requestScope.prod.productName }</dd>
	
	<dt>类型</dt>
	<dd>${requestScope.prod.categoryName }</dd>
	
	<dt>售价</dt>
	<dd>${requestScope.prod.salePrice }</dd>


</dl>

<a href="EmpEditServlet?id=${requestScope.employee.id }">编辑</a>
<a href="" onclick="location.href='javascript:history.go(-1);'">返回</a>
    
<a href="#">交易记录详情</a>

