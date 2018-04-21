<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">学号</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="id" required lay-verify="required"
					autocomplete="off" class="layui-input" value="${stu.id }">
			</div>
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="username" required lay-verify="required"
					autocomplete="off" class="layui-input" value="${stu.username}">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">性别</label>
			<div class="layui-input-inline" style="width:100px;">
				<select name="arrangement">
					<option value="">请选择</option>
					<option value="男" <c:if test="${stu.sex=='男' }">selected</c:if>>男</option>
					<option value="女" <c:if test="${stu.sex=='女' }">selected</c:if>>女 </option>
				</select>
				
			</div>
			<label class="layui-form-label">QQ</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="qq" required lay-verify=""
					autocomplete="off" class="layui-input" value="${stu.qq }">
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>

	
</div>