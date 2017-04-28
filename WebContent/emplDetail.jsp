<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<h1>员工详情</h1>

<dl class="dl-horizontal">
	<dt>编号</dt>
	<dd>${requestScope.employee.id }</dd>

	<dt>姓名</dt>
	<dd>${requestScope.employee.name }</dd>
	
	<dt>性别</dt>
	<dd>${requestScope.employee.gender }</dd>
	
	<dt>昵称</dt>
	<dd>${requestScope.employee.nickname }</dd>

	<dt>手机</dt>
	<dd>${requestScope.employee.cellphone }</dd>

	<dt>电邮</dt>
	<dd>${requestScope.employee.email }</dd>




	<dt>微信</dt>
	<dd>${requestScope.employee.gender }</dd>


</dl>

<a href="EmpEditServlet?id=${requestScope.employee.id }">编辑</a>
<a href="" onclick="location.href='javascript:history.go(-1);'">返回</a>
