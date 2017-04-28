<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>统计报表</h1>


<label>报表</label>
<div>
<select name='action' size='1' >
 <option value=实际消费额>s实际消费额</option> 
 <option value=实际营业额>s实际营业额</option>      
 <option value=pubwin总额>pubwin总额</option>  
 <option value=总免费额>z总免费额</option> 
 <option value=特殊免费额>t特殊免费额</option> 
 <option value=充值免费额>c充值免费额</option> 
 <option value=优惠券免费额>y优惠券免费额</option> 
 <option value=点餐营业额>d点餐营业额</option> 
 <option value=总上机时间>z总上机时间</option> 
 <option value=平均上座率>p平均上座率</option>
 <option value=总上机人次>z总上机人次</option>
 <option value=翻桌率>f翻桌率</option>
 <option value=单机日消费>d单机日消费</option>
 <option value=单机上机时间>d单机上机时间</option>
 <option value=单机日营收>d单机日营收</option>
 <option value=人均消费金额>r人均消费金额</option>
 <option value=人均消费时间>r人均消费时间</option>
 <option value=单日均价>d单日均价</option>
 <option value=新会员数>x新会员数</option> 
 <option value=新客数>x新客数</option> 
 <option value=新增粉丝>x新增粉丝</option>
 <option value=粉丝挖宝>f粉丝挖宝</option>
 <option value=新一卡通>x新一卡通</option> 
 <option value=服务送达>f服务送达</option> 
 <option value=收银笔数>s收银笔数</option> 
 <option value=预定座位>y预定座位</option>
 <option value=漫游进金额>m漫游进金额</option>
 <option value=漫游出金额>m漫游出金额</option>
 <option value=漫游进笔数>m漫游进笔数</option>
 <option value=漫游出笔数>m漫游出笔数</option>
 <option value=漫游总额>m漫游总额</option>
 <option value=漫游差额>m漫游差额</option>
 <option value=高峰在线>g高峰在线</option> 
 <option value=高峰在线率>g高峰在线率</option> 
 <option value=最佳氛围时长>z最佳氛围时长</option> 
 <option value=电脑总量>d电脑总量</option> 
 <option value=集客效率>j集客效率</option> 
 <option value=会员活跃度>h会员活跃度</option> 
 <option value=即时休眠会员>j即时休眠会员</option> 
 <option value=即时会员余额>j即时会员余额</option> 
 <option value=即时粉丝量>j即时粉丝量</option>
 <option value=平均会员余额>p平均会员余额</option>
 <option value=即时活跃会员>j即时活跃会员</option> 
 <option value=即时会员数量>j即时会员数量</option> 
 <option value=非身份证登记>f非身份证登记</option> 
 </select>
<select>
<option>2015</option>
<option>2014</option>
</select>年
<select>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
</select>月
<select>
<option>1</option>
<option>2</option>
</select>日
<input type="button" value="查日报表"/><a href="#">本日帐单</a> <a href="#">前一天</a> <a href="#">后一天</a> 
<input type="button" value="查月报表"/>
</div>


<!-- <div>
<br>
<input type="radio"  title="到" value="到">
<select>
<option >2015</option>
<option>2014</option>
</select>年
<select>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>

</select>月
<select>
<option></option>
<option></option>
</select>日
</div>
 -->


<div>
<img src="img/static.png" />
</div>


<a href="#">返回</a>



