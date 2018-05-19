<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div style="margin: 15px;">
	<form class="layui-form">
	<input type="hidden" name="id" value=${stu.id} />
		<div class="layui-form-item">
			<label class="layui-form-label">学号</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="studentno" required lay-verify="required"
					autocomplete="off" class="layui-input" value=${stu.studentno }>
			</div>
			
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="studentname" required lay-verify="required"
					autocomplete="off" class="layui-input"  value=${stu.studentname }>
			</div>

			<label class="layui-form-label">身份证号码</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="idcardno" required lay-verify="required"
					autocomplete="off" class="layui-input"  value=${stu.idcardno }>
			</div>
			
			
			
			<label class="layui-form-label">学校</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="school" required lay-verify="required"
					autocomplete="off" class="layui-input"  value=${stu.school } >
			</div>
			
		
			<label class="layui-form-label">专业</label>
			<div class="layui-input-inline" style="width:100px;">
				<input type="text" name="major" lay-verify="" autocomplete="off" placeholder="" class="layui-input"  value=${stu.major }>
			</div>
			<label class="layui-form-label">层次</label>
			<div class="layui-input-inline" style="width:100px;">
				<select name="education">
					<option value=${stu.education}>请选择</option>
					<option value="本科">本科</option>
					<option value="专科">专科</option>
				</select>
			</div>
			<label class="layui-form-label">联系方式</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="phone" required lay-verify=""
					autocomplete="off" class="layui-input"  value=${stu.phone }>
			</div>

			<label class="layui-form-label">QQ</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="qq" required lay-verify=""
					autocomplete="off" class="layui-input"  value=${stu.qq }>
			</div>

			 
			<label class="layui-form-label">毕业时间</label>
			<div class="layui-input-inline" style="width:100px;">
				 <input type="text" name="graduationtime_a" lay-verify="" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})"  value=${stu.graduationtime }>
			</div> 
			
			
			<label class="layui-form-label">班级名</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="classname" required lay-verify=""
					autocomplete="off" class="layui-input"  value=${stu.classname }>
			</div>
			
			<label class="layui-form-label">方向</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="directionalname" required lay-verify=""
					autocomplete="off" class="layui-input"  value=${stu.directionalname }>
			</div>
			
			<label class="layui-form-label">备注</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="remark" required lay-verify=""
					autocomplete="off" class="layui-input"  value=${stu.remark }>
			</div>
			
		</div> 
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>


</div>