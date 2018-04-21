<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">学号</label>
			<div class="layui-input-inline">
				<select name="stuId">
					<option value="" selected>请选择</option>
					<c:forEach items="${studentList }" var="item">
						<option value="${item.id }">${item.id }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">就业单位</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="employment" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">地点</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="local" lay-verify="required" autocomplete="off" class="layui-input">
			</div>
			
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">HR联系人</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="hrname" lay-verify="" autocomplete="off" placeholder="" class="layui-input">
			</div>
			<label class="layui-form-label">HR联系方式</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="tel" name="hrtelphone" lay-verify="required|phone" autocomplete="off" class="layui-input">	
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">就职时间</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="text" name="inaugurationTime" lay-verify="" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
			</div>
			<label class="layui-form-label">试用工资</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="salaryPro" required lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">转正工资</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="salaryFormal" required lay-verify=""
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>

	
</div>