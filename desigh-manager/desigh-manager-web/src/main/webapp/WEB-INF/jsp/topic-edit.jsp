<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>  
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
		<input type="hidden" name="id" value="${topic.id }" />
			<label class="layui-form-label">课程</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="course" lay-verify="required" id="course"  lay-filter="courseselect">
				      <option value="">${topic.course}</option>
				</select>
			</div>
			<label class="layui-form-label">知识点</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="knowpoint" lay-verify="required" id="knowpoint"  lay-filter="knowselect">
				      <option  value="">${topic.knowpoint}</option>
				</select>
			</div>

			<label class="layui-form-label">题干</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="stemName" required lay-verify="required"
					autocomplete="off" class="layui-input" value="${topic.stemName}">
			</div>
			<label class="layui-form-label">答案</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="answer" required lay-verify="required"
					autocomplete="off" class="layui-input" value="${topic.answer}" >
			</div>
			<label class="layui-form-label">次数</label>
			<div class="layui-input-inline" style="width: 100px;">
				<input type="text" name="number" required lay-verify="required"
					autocomplete="off" class="layui-input" value="${topic.number}" >
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
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
	        	$('#course').append("<option value="+data[i].courseName+">"+data[i].courseName+"</option>")
	        }
	        layui.form().render('select');
	    }
	}),
	layui.form().on('select(courseselect)', function(data){
	    $.getJSON("getknowlist?name="+data.value, function(data){
	        var optionstring = "";
	        $.each(data, function(i,item){
	            optionstring += "<option value=\"" + item.knowpointName + "\" >" + item.knowpointName + "</option>";
	        });
	        $("#knowpoint").html('<option value="">请选择知识点</option>' + optionstring);
	        layui.form().render('select');
	    });
	});
	
});  

</script>
</div>