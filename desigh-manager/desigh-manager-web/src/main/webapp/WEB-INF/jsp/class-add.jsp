<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">班级名</label>
			<div class="layui-input-inline">
				<input type="text" name="className" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">方向</label>
			<div class="layui-input-inline">
				<input type="text" name="direct" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>
</div>