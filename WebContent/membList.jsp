<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<meta name="viewport" content="width=device-width,initial-scale=1.0">
<link rel="stylesheet" href="css/layout.css" />
<link rel="stylesheet" href="css/bootstrap.css" />
<script src="js/bootstrap.js"></script>
<script src="js/jquery-1.11.2.js"></script>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>会员列表</h1>

<div class="search">
	<form action="">
		<label>会员号</label><input type="text" /> <label>会员姓名</label><input type="text" /> <input
			type="button" value="搜索" />
	</form>
</div>

<br />
<a href="MembListServlet">显示所有会员</a>
|
<a href="MembListServlet">从pubwin同步会员</a>
<br />

<table class="table table-striped table-bordered">
	<thead>
		<tr>
			<th>卡号</th>
			<th>姓名</th>
			<th>余额</th>
			<th>积点</th>
			<th>手机</th>
			<th>性别</th>
			<th>挂失</th>
			<th>编辑</th>
		</tr>
	</thead>

	<c:forEach items="${requestScope.list }" var="memb">
		<tr>
			<td>${memb.id }</td>
			<td>${memb.name }</td>
			<td>${memb.balance }</td>
			<td>${memb.score }</td>
			<td>${memb.cellphone }</td>
			<td>${memb.gender }</td>
			<td>${memb.lost }</td>
			<td><a href="membDetailServlet?id=${memb.id }">详情</a> 
			| <a href="membEditServlet?id=${memb.id }">编辑</a> 
			| <a href="membDelServlet?id=${memb.id }">删除</a></td>
		</tr>
	</c:forEach>

</table>
<br />
<div>首页 上页 下页 尾页</div>



