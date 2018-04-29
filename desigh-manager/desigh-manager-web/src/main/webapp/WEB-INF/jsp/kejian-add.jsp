<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">课件名</label>
			<div class="layui-input-inline">
				<input type="text" name="title" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">课件</label> <input type="file"
				lay-type="file" name="uploadrecord"
				class="layui-upload-file uploadrecord"> <input type="hidden"
				name="fn" id="upFile" />
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>

</div>