<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<link rel="stylesheet" href="css/layout.css" />
<link rel="stylesheet" href="css/bootstrap.css" />
<script src="js/bootstrap.js"></script>
<script src="js/jquery-1.11.2.js"></script>
<title>网吧管理</title>
</head>

<!-- <frameset rows="80,*,20">
<frame src="header.jsp">
<frameset cols="20%,80%">
<frame src="sidebar.jsp">
<frame src="main.jsp" 已工>
</frameset>
<frame src="footer.jsp">
</frameset> -->


<body>
<div class="container-fluid">
	<div id="header"><jsp:include page="header.jsp" />
	</div>
	<div id="nav">
		<jsp:include page="nav.jsp" />
	</div>

	<div id="maincontent">
		<div id="side"><jsp:include page="sidebar.jsp" />
		</div>
		<div id="main"><jsp:include page="main.jsp" />
		</div>
		<div id="footer"><jsp:include page="footer.jsp" /></div>

	</div>
	</div>
</body>
</html>