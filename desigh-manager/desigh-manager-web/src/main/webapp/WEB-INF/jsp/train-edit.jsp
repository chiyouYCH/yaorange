<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<input type="hidden" name="id" value="${train.id }">
		<div class="layui-form-item">
			<label class="layui-form-label">学校</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="school" value="${train.school }" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">实训时间</label>
			<div class="layui-input-inline" style="width:100px;">
			    <input type="text" name="trainTime" lay-verify="" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})" value="<fmt:formatDate value="${train.trainTime }" pattern="yyyy-MM-dd" />">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">详细地点</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="text" name="local" value="${train.local }" lay-verify="required" autocomplete="off" class="layui-input">	
			</div>
			<label class="layui-form-label">学生人数</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="text" name="trainNumber" value="${train.trainNumber }" lay-verify="required|number" placeholder="" autocomplete="off" class="layui-input">
			</div>
			
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">需要工程师人数</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="engineerNumber" value="${train.engineerNumber }" lay-verify="required|number" autocomplete="off" class="layui-input">
			</div>
			
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">实训内容</label>
			<div class="layui-input-inline" style="width:300px;">
				<textarea name="trainContent" lay-verify="" placeholder="请输入" class="layui-textarea">${train.trainContent }</textarea>
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>

	
</div>