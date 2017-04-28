<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<h1>会员漫游</h1>

<div>
	<form action="MembStoreServlet" method="post"
		onsubmit="return checkForm()">
		<fieldset>
		<legend>员工漫游源</legend>
		
			<label class="control-label" for="id">会员卡号</label>
			<div class="controls">
				<input type="text" name="id" value="${requestScope.membStore.id }"  /> <label id="id_msg"></label>
			</div>
			<div class="form-action">
				<button type="submit" class="btn btn-primary">查询会员所在店</button>
			</div>
			<div>
				<label id="membId"></label>
				<label id="membName">姓名</label>
				<label id="storeId"></label>
				<label id="storeName">当前所属店</label>
				<label id="storeName"></label>
				
			</div>
		</fieldset>
	</form>
</div>

<div>
	<form action="FindMemFromHQServlet" method="post"
		onsubmit="return checkForm()">
		<fieldset>
		<legend>转到本店</legend>
			<div class="form-action">
				<button type="submit" class="btn btn-primary">转入本店</button>
			</div>
		</fieldset>
	</form>


</div>

<a href="#">返回</a>
<a href="#">漫游记录</a>


