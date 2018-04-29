<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<input type="hidden" name="id" value="${feedback.id }">
		<div class="layui-form-item">
			<label class="layui-form-label">面试者</label>
			<div class="layui-input-inline">
				<input type="text" name="name" lay-verify="required"
					autocomplete="off" class="layui-input" value="${feedback.name }">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">面试时间</label>
			<div class="layui-input-inline">
				<input type="text" name="interviewDate" lay-verify=""
					autocomplete="off" class="layui-input"
					onclick="layui.laydate({elem: this})"
					value="<fmt:formatDate value="${feedback.interviewDate }" pattern="yyyy-MM-dd" />">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">面试公司</label>
			<div class="layui-input-inline">
				<input type="text" name="company" value="${feedback.company }"
					lay-verify="required" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">面试心得</label>
			<div class="layui-input-inline">
				<textarea name="interviewDesc" required lay-verify="" placeholder=""
					class="layui-textarea">${feedback.interviewDesc }</textarea>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label"></label> <input type="file"
				name="uploadimage" lay-type="images"
				class="layui-upload-file uploadimage"> <input type="hidden"
				name="image" value="${feedback.image }" id="upImage" />
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label"></label> <input type="file"
				lay-type="audio" name="uploadrecord"
				class="layui-upload-file uploadrecord"> <input type="hidden"
				name="record" value="${feedback.record }" id="upFile" />
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>

</div>