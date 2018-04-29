<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-inline">
				<input type="text" name="stuName" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">费用</label>
			<div class="layui-input-inline">
				<input type="text" name="cost" lay-verify="required"
					autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">一月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month01">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
			<label class="layui-form-label">二月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month02">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">三月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month03">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
			<label class="layui-form-label">四月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month04">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">五月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month05">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
			<label class="layui-form-label">六月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month06">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">七月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month07">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
			<label class="layui-form-label">八月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month08">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">九月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month09">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
			<label class="layui-form-label">十月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month10">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">十一月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month11">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
			<label class="layui-form-label">十二月</label>
			<div class="layui-input-inline" style="width: 100px;">
				<select name="month12">
					<option value="0" selected>未交</option>
					<option value="1">已交</option>
				</select>
			</div>
		</div>
		<button lay-filter="add" lay-submit style="display: none;"></button>
	</form>
</div>