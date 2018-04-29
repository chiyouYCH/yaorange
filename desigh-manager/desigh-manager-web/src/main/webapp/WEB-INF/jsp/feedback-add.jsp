<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">面试者</label>
			<div class="layui-input-inline">
				<input type="text" name="name" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">面试时间</label>
			<div class="layui-input-inline">
				<input type="text" name="interviewDate" lay-verify=""
					placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input"
					onclick="layui.laydate({elem: this})">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">面试公司</label>
			<div class="layui-input-inline">
				<input type="text" name="company" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">面试心得</label>
			<div class="layui-input-inline">
				<textarea name="interviewDesc" required lay-verify=""
					placeholder="请输入" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label"></label> <input type="file"
				name="uploadimage" lay-type="images"
				class="layui-upload-file uploadimage"> <input type="hidden"
				name="image" id="upImage" />
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label"></label> <input type="file"
				lay-type="audio" name="uploadrecord"
				class="layui-upload-file uploadrecord"> <input type="hidden"
				name="record" id="upFile" />
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>

</div>