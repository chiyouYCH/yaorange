<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<input type="hidden" name="id" value="${shiping.id }">
		<div class="layui-form-item">
			<label class="layui-form-label">视频名</label>
			<div class="layui-input-inline">
				<input type="text" name="title" lay-verify="required" autocomplete="off" class="layui-input" value="${shiping.title }">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">视频</label>
			<input type="file" lay-type="file" name="uploadrecord" class="layui-upload-file uploadrecord">
			<input type="hidden" name="fn" value="${shiping.fn}" id="upFile"/>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>
	
</div>