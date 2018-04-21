<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline">
				<input type="text" name="stuName" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">首付款</label>
			<div class="layui-input-inline">
				<input type="text" name="firstPay" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">1月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[0]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">2月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[1]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">3月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[2]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">4月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[3]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">5月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[4]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">6月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[5]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">7月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[6]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">8月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[7]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">9月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[8]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">10月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[9]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">11月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[10]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">12月座位费</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="pay[11]" value="0" lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>
</div>