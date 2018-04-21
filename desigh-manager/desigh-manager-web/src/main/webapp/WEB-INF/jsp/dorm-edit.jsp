<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">宿舍号</label>
			<div class="layui-input-inline">
				<input type="text" name="id" lay-verify="required" autocomplete="off" readonly="readonly" class="layui-input" value="${dorm.id }">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">栋数</label>
			<div class="layui-input-inline">
				<input type="text" name="local" lay-verify="required" autocomplete="off" class="layui-input" value="${dorm.local }">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">容量</label>
			<div class="layui-input-inline">
				<input type="text" name="capacity" lay-verify="required" autocomplete="off" class="layui-input" value="${dorm.capacity }">
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>
</div>