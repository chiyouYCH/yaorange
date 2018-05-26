<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			
			<div class="layui-input-inline" style="width: 100px;">
			<label class="layui-form-label">学号</label>
				<input type="text" name="studentno" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			
			<div class="layui-input-inline" style="width: 100px;">
			<label class="layui-form-label">姓名</label>
				<input type="text" name="studentname" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			
			<div class="layui-input-inline" style="width: 100px;">
			<label class="layui-form-label">班级</label>
				<input type="text" name="classname" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			
			<div class="layui-input-inline" style="width: 100px;">
			<label class="layui-form-label">面试企业</label>
				<input type="text" name="interviewcompany" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			
			<div class="layui-input-inline" style="width:100px;">
			<label class="layui-form-label">企业地点</label>
				<input type="text" name="interviewplace" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			
			<div class="layui-input-inline" style="width: 100px;">
			<label class="layui-form-label">联系人</label>
				<input type="text" name="contacts" required lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			
			<div class="layui-input-inline" style="width: 100px;">
			<label class="layui-form-label">联系电话</label>
				<input type="text" name="contactsphone" required lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
			
			<div class="layui-input-inline" style="width:100px;">
			<label class="layui-form-label">面试时间</label>
				 <input type="text" name="interviewtime2" lay-verify="" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
			</div> 	
		</div> 
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>


</div>