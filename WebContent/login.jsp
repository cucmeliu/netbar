<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

function checkForm(){
	//1. 非空校验
	var cansub = checkNull("username", "用户名不能为空！") &&
		checkNull("password", "密码不能为空！");
	
	// var email = 
	// if(/^\w+w+(\.\w+)+$/.test(email)) {...}
	
	
	
	return cansub;
}

function checkNull(name, msg) {
	//1. 非空校验
	document.getElementById(name+"_msg").innerHTML = "";
	var val = document.getElementsByName(name)[0].value;
	if (val==null || val == "") {
		document.getElementById(name+"_msg").innerHTML = "<font color='red'>"+msg+"</font>";
		//alert("用户名不能为空");
		return false;
	}
	return true;
}

</script>

</head>
<body >

	<h1>系统登录</h1>

	<div>
		<label>登录</label>
		<form action="/LoginServlet" method="post" onsubmit="return checkForm()">
			<fieldset>
				<label class="control-label" for="username">用户名</label>
				<div class="controls">
					<input type="text" name="username" value="${param.username }" />
					<label id="username_msg" ></label>
				</div>
				<label class="control-label" for="username">密码</label>
				<div class="controls">
					<input type="password" name="password" />
					<label id="password_msg" ></label>
				</div>

				<div class="form-action">
					<button type="submit" class="btn btn-primary">登录</button>
				</div>
			</fieldset>
		</form>
	</div>



</body>
</html>