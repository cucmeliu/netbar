<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	String name = "guest";
	pageContext.setAttribute("name", name);
%>

 <c:if test="${sessionScope.user == null }">
  欢迎光临${ name }，请先<a href="login.jsp">登录</a>
</c:if>

<c:if test="${sessionScope.user != null }">
  欢迎你，${session.user.username }，<a href="LogoutServlet">注销</a>
</c:if>

