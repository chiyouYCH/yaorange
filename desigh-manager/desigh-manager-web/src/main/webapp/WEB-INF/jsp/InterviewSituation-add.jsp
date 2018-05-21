<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">面试企业</label>
			<div class="layui-input-inline">
				<input type="text" name="interviewcompany" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">笔试情况</label>
			<div class="layui-input-inline">
				<input type="text" name="writtenexamination"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">面试情况</label>
			<div class="layui-input-inline">
				<input type="text" name="interviewexamination" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">面试反馈</label>
			<div class="layui-input-inline">
				<input type="text" name="interviewfeedback" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">附件1</label> <input type="file"
				lay-type="file" name="uploadrecord"
				class="layui-upload-file uploadrecord"> <input type="hidden"
				name="enclosure1" id="upFile" />
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">附件2</label> <input type="file"
				lay-type="file" name="uploadrecord2"
				class="layui-upload-file uploadrecord"> <input type="hidden"
				name="enclosure2"  />
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">录音</label> <input type="file"
				lay-type="file" name="uploadrecord3"
				class="layui-upload-file uploadrecord"> <input type="hidden"
				name="soundrecording"  />
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>

</div>