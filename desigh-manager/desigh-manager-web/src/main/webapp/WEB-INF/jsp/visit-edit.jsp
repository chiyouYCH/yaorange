<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<input type="hidden" name="id" value="${visit.id }">
		<div class="layui-form-item">
			<label class="layui-form-label">企业</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="company" required lay-verify="required"
					autocomplete="off" class="layui-input" value="${visit.company }">
			</div>
			<label class="layui-form-label">企业联系人</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="corporateContact" value="${visit.corporateContact }" lay-verify="" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">联系方式</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="tel" name="telephone" value="${visit.telephone }" lay-verify="phone" autocomplete="off" class="layui-input">	
			</div>
			<label class="layui-form-label">回访人</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="revisit" value="${visit.revisit }" lay-verify="" autocomplete="off" class="layui-input">
			</div>
			
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">时间</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="visitTime" lay-verify="" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})" value="<fmt:formatDate value="${visit.visitTime }" pattern="yyyy-MM-dd" />">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">回访内容</label>
			<div class="layui-input-inline" style="width:300px;">
				<textarea name="visitContent" lay-verify="" class="layui-textarea">${visit.visitContent }</textarea>
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>

	
</div>