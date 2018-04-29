<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<input type="hidden" name="id" value="${cw.id }" />
		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="stuName" required lay-verify="required"
					autocomplete="off" class="layui-input" value="${cw.stuName }">
			</div>
			<label class="layui-form-label">班级</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="className">
					<option value="" selected>请选择</option>
					<c:forEach items="${classList }" var="item">
						<option value="${item.className }"
							<c:if test="${item.className==cw.className }">selected</c:if>>${item.className }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">月份</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="month" lay-verify="" value="${cw.month }"
					placeholder="yyyy-mm" autocomplete="off" class="layui-input"
					onclick="layui.laydate({elem: this,format: 'YYYY-MM'})">
			</div>
			<label class="layui-form-label">迟到次数</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="late" value="${cw.late }"
					lay-verify="number" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">缺勤次数</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="absence" value="${cw.absence }"
					lay-verify="number" autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">请假次数</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="askforleave" value="${cw.askforleave }"
					lay-verify="number" autocomplete="off" class="layui-input">
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>


</div>