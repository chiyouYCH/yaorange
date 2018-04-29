<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<input type="hidden" name="id" value="${emp.id }">
		<div class="layui-form-item">
			<label class="layui-form-label">学号</label>
			<div class="layui-input-inline">
				<select name="stuId">
					<c:forEach items="${studentList }" var="item">
						<option value="${item.id }"
							<c:if test="${emp.stuId==item.id }">selected</c:if>>${item.id }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">就业单位</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="employment" required lay-verify="required"
					autocomplete="off" class="layui-input" value="${emp.employment }">
			</div>
			<label class="layui-form-label">地点</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="local" value="${emp.local }"
					lay-verify="required" autocomplete="off" class="layui-input">
			</div>

		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">HR联系人</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="hrname" lay-verify=""
					value="${emp.hrname }" autocomplete="off" placeholder=""
					class="layui-input">
			</div>
			<label class="layui-form-label">HR联系方式</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="tel" name="hrtelphone" value="${emp.hrtelphone }"
					lay-verify="required|phone" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">就职时间</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="inaugurationTime" lay-verify=""
					autocomplete="off" class="layui-input"
					onclick="layui.laydate({elem: this})"
					value="<fmt:formatDate value="${emp.inaugurationTime }" pattern="yyyy-MM-dd" />">
			</div>
			<label class="layui-form-label">试用工资</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="salaryPro" required lay-verify=""
					autocomplete="off" class="layui-input" value="${emp.salaryPro }">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">转正工资</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="salaryFormal" required lay-verify=""
					autocomplete="off" class="layui-input" value="${emp.salaryFormal }">
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>

</div>