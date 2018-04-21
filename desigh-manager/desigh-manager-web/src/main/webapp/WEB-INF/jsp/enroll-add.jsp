<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">学号</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="stuId" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="stuName" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">身份证号</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="idCard" lay-verify="identity" placeholder="" autocomplete="off" class="layui-input" value="513021199415111234">
			</div>
			<label class="layui-form-label">学校</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="school" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">专业</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="major" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			<label class="layui-form-label">层次</label>
			<div class="layui-input-inline" style="width:100px;">
				<select name="arrangement">
					<option value="">请选择</option>
					<option value="本科">本科</option>
					<option value="专科">专科</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">电话</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="tel" name="telphone" lay-verify="required|phone" autocomplete="off" class="layui-input">	
			</div>
			<label class="layui-form-label">QQ</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="qq" required lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">来源</label>
			<div class="layui-input-inline" style="width:100px;">
				<select name="source">
					<option value="">请选择</option>
					<option value="校招">校招</option>
					<option value="社招">社招</option>
				</select>
			</div>
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>

	
</div>