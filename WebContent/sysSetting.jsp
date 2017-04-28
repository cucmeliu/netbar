<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<body>

	<h1>系统设置</h1>

<div>
		<label>本店信息</label>
		<form action="TestConnection" method="post" onsubmit="return checkForm()">
			<fieldset>
			<label class="control-label" for="serverip">本店店名</label>
				<div class="controls">
					<input type="text" name="serverip"  />
					<label id="serverip_msg" ></label>
				</div>
				<label class="control-label" for="username">负责人</label>
				<div class="controls">
					<input type="text" name="username" />
					<label id="username_msg" ></label>
				</div>
				<label class="control-label" for="username">地址</label>
				<div class="controls">
					<input type="password" name="password" />
					<label id="password_msg" ></label>
				</div>

				<div class="form-action">
				<a href="TestConnection">测试连接</a>
					<button type="submit" class="btn btn-primary">保存</button>
				</div>
			</fieldset>
		</form>
	</div>

	<div>
		<label>配置总店</label>
		<form action="TestConnection" method="post" onsubmit="return checkForm()">
			<fieldset>
			<label class="control-label" for="serverip">总店服务器地址</label>
				<div class="controls">
					<input type="text" name="serverip"  />
					<label id="serverip_msg" ></label>
				</div>
				<label class="control-label" for="username">用户名</label>
				<div class="controls">
					<input type="text" name="username" />
					<label id="username_msg" ></label>
				</div>
				<label class="control-label" for="username">密码</label>
				<div class="controls">
					<input type="password" name="password" />
					<label id="password_msg" ></label>
				</div>

				<div class="form-action">
				<a href="TestConnection">测试连接</a>
					<button type="submit" class="btn btn-primary">保存</button>
				</div>
			</fieldset>
		</form>
	</div>
	
	<div>
		<label>配置Pubwin</label>
		<form action="TestConnection" method="post" onsubmit="return checkForm()">
			<fieldset>
			<label class="control-label" for="serverip">pubwin服务器地址</label>
				<div class="controls">
					<input type="text" name="serverip"  />
					<label id="serverip_msg" ></label>
				</div>
				<label class="control-label" for="username">用户名</label>
				<div class="controls">
					<input type="text" name="username" />
					<label id="username_msg" ></label>
				</div>
				<label class="control-label" for="username">密码</label>
				<div class="controls">
					<input type="password" name="password" />
					<label id="password_msg" ></label>
				</div>

				<div class="form-action">
					<a href="TestConnection">测试连接</a>
					<button type="submit" class="btn btn-primary">保存</button>
				</div>
			</fieldset>
		</form>
	</div>

</body>
</html>