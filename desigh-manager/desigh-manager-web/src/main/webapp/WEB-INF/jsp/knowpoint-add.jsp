<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>  
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">课程</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="courseId" lay-verify="required" id="course"  lay-filter="myselect">
				      <option value="">请选择课程</option>
				      
				</select>
			</div>

			<label class="layui-form-label">知识点</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="knowpointName" required lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>

<script type="text/javascript">
$(function(){  
	$.ajax({
	    url: "getCourseList",
	    type: "post",
	    dataType: "json",
	    success: function (ret) {
	        var data = ret;
	        console.log(data);
	        for(var i=0; i<data.length; i++){
	        	$('#course').append("<option value="+data[i].courseId+">"+data[i].courseName+"</option>")
	        }
	        layui.form().render('select');
	    }
	}); 
});  
</script>
</div>