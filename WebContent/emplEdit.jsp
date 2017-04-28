<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<h1>员工信息修改</h1>

<form action="EmpUpdateServlet" method="POST">

	<fieldset>
		<legend>信息修改</legend>
		<div class="control-group ">
			<label class="control-label inline" for="id">工号</label>
			<div class="controls">
				<input type="text" name="id" id="id"
					value="${requestScope.employee.id }" /> <label id="id_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="name">姓名</label>
			<div class="controls">
				<input type="text" name="name" id="name"
					value="${requestScope.employee.id }" /><label id="name_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="password">密码</label>
			<div class="controls">
				<input type="text" id="password" name="password" value="${requestScope.employee.password }" /> <label
					id="password_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="gender">性别</label>
			<div class="controls">
				<select id="gender" name="gender">
					<option>男</option>
					<option>女</option>
				</select><label id="gender_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="nickname">昵称</label>
			<div class="controls">
				<input type="text" id="nickname" name="nickname" value="${requestScope.employee.nickname }" /><label
					id="nickname_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="cellphone">手机号</label>
			<div class="controls">
				<input type="text" id="cellphone" name="cellphone" value="${requestScope.employee.id }"/><label
					id="cellphone_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="email">Email</label>
			<div class="controls">
				<input type="text" id="email" name="email" value="${requestScope.employee.id }"  /><label id="emailmsg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="idcard">身份证</label>
			<div class="controls">
				<input type="text" id="idcard" name="idcard" /><label
					id="idcard_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="birthday">生日</label>
			<div class="controls">

				<input type="text" id="birthday" name="birthday" /><label
					id="birthday_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="role">权限</label>
			<div class="controls">
				<select id="role" name="role">
					<option>普通</option>
					<option>管理员</option>
				</select><label id="role_msg"></label>
			</div>
		</div>

		<div class="control-group ">
			<label class="control-label inline" for="state">状态</label>
			<div class="controls">
				<select id="state" name="select">
					<option>正常</option>
					<option>停止</option>
				</select><label id="state_msg"></label>
			</div>
		</div>

		<div class="form-action">
			<button type="submit" class="btn btn-primary">确定修改</button>
		</div>

	</fieldset>


</form>

