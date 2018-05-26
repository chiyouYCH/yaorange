<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
	<input type="hidden" name="id" value=${ir.id} />
		<div class="layui-form-item">
			<label class="layui-form-label">学号</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="studentno" required lay-verify="required"
					autocomplete="off" class="layui-input" value=${ir.studentno }>
			</div>
			
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="studentname" required lay-verify="required"
					autocomplete="off" class="layui-input"  value=${ir.studentname }>
			</div>

			<label class="layui-form-label">班级</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="classname" required lay-verify="required"
					autocomplete="off" class="layui-input"  value=${ir.classname }>
			</div>
			
			
			
			<label class="layui-form-label">面试企业</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="interviewcompany" required lay-verify="required"
					autocomplete="off" class="layui-input"  value=${ir.interviewcompany } >
			</div>
			
		
			<label class="layui-form-label">企业地点</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="interviewplace" lay-verify="" autocomplete="off" placeholder="" class="layui-input"  value=${ir.interviewplace }>
			</div>
			
			<label class="layui-form-label">联系人</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="contacts" lay-verify="" autocomplete="off" placeholder="" class="layui-input"  value=${ir.contacts }>
			</div>
			<label class="layui-form-label">企业联系电话</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="contactsphone" lay-verify="" autocomplete="off" placeholder="" class="layui-input"  value=${ir.contactsphone }>
			</div>
			
			<label class="layui-form-label">面试时间</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="text" name="interviewtime2" lay-verify="" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})"  value=${ir.interviewtime }>
			</div> 
			
			
		</div> 
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>


</div>