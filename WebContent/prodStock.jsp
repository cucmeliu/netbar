<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>商品盘点</h1>

<input type="button" value="库存盘点" />
<input type="button" value="畅销排名" />
<input type="button" value="缺货盘点" />
<input type="button" value="库存盘点" />

<hr />
<table class="tablelist" border="1" width="100%">
<tr>
<th width="8%">编号</th>
<th >名称</th>
<th width="10%">条码</th>
<th width="8%">类型</th>
<th width="8%">售价</th>
<th width="8%">库存</th>
<th width="10%">操作</th>
</tr>

<c:forEach items="${requestScope.list }" var="prod">
	<tr>
	<td>${prod.id }</td>
	<td>${prod.name }</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td><a href="/ProdInfoServlet?prodid=${prod.id }"></td>
	</tr>
</c:forEach>


<tr>
<td>1</td>
<td>农夫山泉</td>
<td>6212112</td>
<td>饮料</td>
<td>5.0</td>
<td>20</td>
<td><a href="/ProdInfoServlet?prodid=111">详</a> <a href="#">改</a> <a href="#"> 删</a> </td>
</tr>

<tr>
<td>2</td>
<td>阳光利群香烟</td>
<td>6212113</td>
<td>香烟</td>
<td>35.0</td>
<td>20</td>
<td><a href="/ProdInfoServlet?prodid=111">详</a> <a href="#">改</a> <a href="#"> 删</a> </td>
</tr>

<tr>
<td>3</td>
<td>芙蓉王香烟</td>
<td>6212114</td>
<td>香烟</td>
<td>23.0</td>
<td>20</td>
<td><a href="/ProdInfoServlet?prodid=111">详</a> <a href="#">改</a> <a href="#"> 删</a> </td>
</tr>

</table>
<br />
<div>
首页 上页 下页 尾页
</div>

