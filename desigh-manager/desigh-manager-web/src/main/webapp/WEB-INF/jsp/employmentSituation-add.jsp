<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
		<input type="hidden" name="offer" value=${url }> 
			<label class="layui-form-label">学号</label>
			<div class="layui-input-inline" >
				<input type="text" name="studentid" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline" >
				<input type="text" name="studentname" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			
			
			
			
			
			<label class="layui-form-label">班级名</label>
			<div class="layui-input-inline" >
				<input type="text" name="classname" required lay-verify=""
					autocomplete="off" class="layui-input">
			</div>

			<label class="layui-form-label">就业单位</label>
			<div class="layui-input-inline" >
				<input type="text" name="company" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		
			
			
			<label class="layui-form-label">地点</label>
			<div class="layui-input-inline" >
				<input type="text" name="place" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			
			
			
			<label class="layui-form-label">HR联系人</label>
			<div class="layui-input-inline" >
				<input type="text" name="contacts" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			
			<label class="layui-form-label">HR联系电话</label>
			<div class="layui-input-inline" >
				<input type="text" name="contactsphone" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			
			<label class="layui-form-label">入职时间</label>
			<div class="layui-input-inline" >
				 <input type="text" name="jointime_a" lay-verify="" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
			</div> 
			
			<label class="layui-form-label">试用工资</label>
			<div class="layui-input-inline" >
				<input type="text" name="applicablewages" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			
			
			
			<label class="layui-form-label">转正工资</label>
			<div class="layui-input-inline" >
				<input type="text" name="formalwages" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			
		
			
			<label class="layui-form-label">福利</label>
			<div class="layui-input-inline" >
				<input type="text" name="welfare" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			
			
			<label class="layui-form-label">备注</label>
			<div class="layui-input-inline" >
				<input type="text" name="remark" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			
			
			<label class="layui-form-label">上传附件offer</label> <input type="file"
				lay-type="file" name="uploadrecord"
				class="layui-upload-file uploadrecord"> <input type="hidden"
				name="offer" id="upFile" />
				
			
		</div> 
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>


</div>