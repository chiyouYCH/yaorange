<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">大纲名称</label>
			<div class="layui-input-inline">
				<input type="text" name="title" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">大纲内容</label>
			<div class="layui-input-inline">
				<textarea name="content" required lay-verify="" placeholder="请输入"
					class="layui-textarea"></textarea>
			</div>
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>

</div>