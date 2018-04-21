<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="username" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			
			<label class="layui-form-label">性别</label>
			<div class="layui-input-inline" style="width:100px;">
				<select  name="sex" lay-verify="required" >
			         <option value="男">男<option>
			         <option value="女">女</option>
			     </select>
			</div>
		</div>
		<!-- <div class="layui-form-item">
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
		</div> -->
		<div class="layui-form-item">
		
			<label class="layui-form-label">QQ</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="qq" required lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			
			<label class="layui-form-label">邮箱</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="email" required lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		 <!-- <div class="layui-form-item">
			<label class="layui-form-label">毕业时间</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="text" name="createtime" lay-verify="" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
			</div>
		</div> -->
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>

	
</div>