<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<h1>添加商品</h1>

<form class="form-horizontal" action="ProdAddServlet" method="POST">
	<fieldset>
		<legend>添加商品</legend>
		<div class="control-group ">
			<label class="control-label inline" for="productId">商品ID</label>
			<div class="controls">
				<input type="text" id="productID" name="productId" />
			</div>
		
			<label class="control-label" for="productName">商品名称</label>
			<div class="controls inline">
				<input type="text" id="productName" name="productName" />
			</div>
			
			<label class="control-label" for="category">商品类型</label>
			<div class="controls">
				<select id="categoryName" name="categoryName">
					<option>请选择商品类型</option>
					<option>饮料</option>
				</select>
			</div>
			
			<label class="control-label" for="productcode">商品条码</label>
			<div class="controls">
				<input type="text" id="productcode" />
			</div>
			<label class="control-label" for="specs">进货价格</label>
			<div class="controls">
				<input type="text" id="specs" />
			</div>
			<label class="control-label" for="unit">计量单位</label>
			<div class="controls">
				<input type="text" id="unit" />
			</div>
			<label class="control-label" for="minInventory">库存警戒数量</label>
			<div class="controls">
				<input type="text" id="minInventory" />
			</div>
			<div class="controls">
				<label>是否有效</label> <label class="radio"> <input
					type="radio" name="enabled" value="true" />有效
				</label> <label class="radio"> <input type="radio" name="enabled"
					value="false" />无效
				</label>

			</div>
			<label class="control-label" for="salePrice">售价</label>
			<div class="controls">
				<input type="text" id="salePrice" />
			</div>
			<label class="control-label" for="remark">备注</label>
			<div class="controls">
				<textarea id="remark" rows="5" cols="20"></textarea>
			</div>
			<label class="control-label" for="updateTm">更新时间</label>
			<div class="controls">
				<input type="text" id="updateTm" />
			</div>
			<div class="form-action">
				<button type="submit" class="btn btn-primary">确定添加</button>
			</div>
		</div>

	</fieldset>
</form>
