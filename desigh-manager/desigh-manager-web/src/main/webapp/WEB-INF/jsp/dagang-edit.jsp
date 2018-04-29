<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<input type="hidden" name="id" value="${dagang.id }">

		<div class="layui-form-item">
			<label class="layui-form-label">大纲名称</label>
			<div class="layui-input-inline">
				<input type="text" name="company" value="${dagang.title }"
					lay-verify="required" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">大纲内容</label>
			<div class="layui-input-inline">
				<textarea name="content" required lay-verify="" placeholder=""
					class="layui-textarea">${dagang.content }</textarea>
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>

</div>