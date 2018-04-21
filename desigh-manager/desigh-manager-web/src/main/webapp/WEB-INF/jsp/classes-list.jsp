﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>班级信息</title>
		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="css/global.css" media="all">
		<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="css/table.css" />
	</head>

	<body>
		<div class="admin-main">

			<blockquote class="layui-elem-quote">
				<a href="javascript:;" class="layui-btn layui-btn-small" id="add">
					<i class="layui-icon">&#xe608;</i> 添加班级
				</a>
				<a href="#" class="layui-btn layui-btn-small" id="getSelected">
					<i class="fa fa-shopping-cart" aria-hidden="true"></i> 删除所选
				</a>
				<a href="classes-list" class="layui-btn layui-btn-small" id="fluse">
					<i class="layui-icon">&#x1002;</i> 刷新
				</a>
				<form class="layui-form" style="float:right;">
	                <div class="layui-form-item" style="margin:0;">
	                    <div class="layui-input-inline">
	                        <input type="text" name="name" placeholder="请输入班级名.." autocomplete="off" class="layui-input">
	                    </div>
	                    <div class="layui-form-mid layui-word-aux" style="padding:0;">
	                        <button lay-filter="search" class="layui-btn" lay-submit  id="search"><i class="fa fa-search" aria-hidden="true"></i> 查询</button>
	                    </div>
	                </div>
            	</form>
            	
			</blockquote>
			<fieldset class="layui-elem-field">
				<legend>班级列表</legend>
				<div class="layui-field-box layui-form">
					<table class="layui-table admin-table">
						<thead>
							<tr>
								<th style="width: 30px;"><input type="checkbox" lay-filter="allselector" lay-skin="primary"></th>
								<th>班级名</th>
								<th>方向</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody id="content">
						</tbody>
					</table>
				</div>
			</fieldset>
			<div class="admin-table-page">
				<div id="paged" class="page">
				</div>
			</div>
		</div>
		<!--模板-->
		<script type="text/html" id="tpl">
			{{# layui.each(d.list, function(index, item){ }}
			<tr>
				<td><input type="checkbox" lay-skin="primary"></td>
				<td>{{ item.className }}</td>
				<td>{{ item.direct }}</td>
				<td>
					<a href="javascript:;" data-id="{{ item.id }}" data-opt="edit" class="layui-btn layui-btn-mini">编辑</a>
					<a href="javascript:;" data-id="{{ item.id }}" data-opt="del" class="layui-btn layui-btn-danger layui-btn-mini">删除</a>
				</td>
			</tr>
			{{# }); }}
		</script>
		<script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script>
			layui.config({
				base: 'js/'
			});

			layui.use(['paging', 'form'], function() {
				var $ = layui.jquery,
					paging = layui.paging(),
					layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
					layer = layui.layer, //获取当前窗口的layer对象
					form = layui.form();
				
				
				$('#search').on('click', function() {
					var $this = $(this);
					var name = $this.prev('input[name=name]').val();
					if(name === '') {
						layer.msg('请输入关键字！');
						return;
					}
					//调用get方法获取数据
					paging.get({
						t: Math.random(),
						name: name //获取输入的关键字。
					});
				});
                paging.init({
                    openWait: true,
                    url: 'getClassesList?name=${name}', //地址
					elem: '#content', //内容容器
					params: { //发送到服务端的参数
					},
					type: 'GET',
					tempElem: '#tpl', //模块容器
					pageConfig: { //分页参数配置
						elem: '#paged', //分页容器
						pageSize: 8 //分页大小
					},
					success: function() { //渲染成功的回调
						//alert('渲染成功');
					},
					fail: function(msg) { //获取数据失败的回调
						//alert('获取数据失败')
					},
					complate: function() { //完成的回调
						//alert('处理完成');
						//重新渲染复选框
						form.render('checkbox');
						form.on('checkbox(allselector)', function(data) {
							var elem = data.elem;

							$('#content').children('tr').each(function() {
								var $that = $(this);
								//全选或反选
								$that.children('td').eq(0).children('input[type=checkbox]')[0].checked = elem.checked;
								form.render('checkbox');
							});
						});

						//绑定所有删除按钮事件						
						$('#content').children('tr').each(function() {
							var $that = $(this);
							$that.children('td:last-child').children('a[data-opt=del]').on('click', function() {
								var id = $(this).data('id');// 获取id
								layer.confirm('您确认删除吗?', {icon: 3, title:'提示'}, function(index){
									  //do something
									  $.get("deleteClass",{id:id},function(data){
									//返回结果并刷新页面
									   layerTips.msg(data.msg,{time:500},function(){
										   layerTips.close(index);
											location.reload(); //刷新
									   });
									});
									 layer.close(index);
								});
								
							});

						});
						//绑定所有编辑按钮事件						
						$('#content').children('tr').each(function() {
							var $that = $(this);
							$that.children('td:last-child').children('a[data-opt=edit]').on('click', function() {
								var id = $(this).data('id');

								if(addBoxIndex !== -1)
									return;
								//本表单通过ajax加载 --以模板的形式，当然你也可以直接写在页面上读取
								$.get('class-edit', {id:id}, function(form) {
									addBoxIndex = layer.open({
										type: 1,
										title: '修改班级',
										content: form,
										btn: ['保存', '取消'],
										shade: false,
										offset: ['100px', '30%'],
										area: ['400px', '300px'],
										zIndex: 19891015,
										maxmin: true,
										yes: function(index) {
											//触发表单的提交事件
											$('form.layui-form').find('button[lay-filter=edit]').click();
										},
										full: function(elem) {
											var win = window.top === window.self ? window : parent.window;
											$(win).on('resize', function() {
												var $this = $(this);
												elem.width($this.width()).height($this.height()).css({
													top: 0,
													left: 0
												});
												elem.children('div.layui-layer-content').height($this.height() - 95);
											});
										},
										success: function(layero, index) {
											//弹出窗口成功后渲染表单
											var form = layui.form();
											form.render();
											form.on('submit(edit)', function(data) {
												//这里可以写ajax方法提交表单
												$.ajax({
												   type: "POST",
												   url: "updateClass",
												   data: data.field,
												   dataType: "json",
												   success: function(data){
													   //返回结果并刷新页面
													   layerTips.msg(data.msg,{time:500},function(){
														   layerTips.close(index);
															location.reload(); //刷新
													   })
												   }
												});
												return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。									
											});
										
										},
										end: function() {
											addBoxIndex = -1;
										}
									});
								});	
							});

						});

					},
				});
				//删除选择的列
				$('#getSelected').on('click', function() {
					var ids = '';
					$('#content').children('tr').each(function() {
						var $that = $(this);
						var $cbx = $that.children('td').eq(0).children('input[type=checkbox]')[0].checked;
						if($cbx) {
							var n = $that.children('td:last-child').children('a[data-opt=edit]').data('id');
							ids += n + ',';
						}
					});
					//后台删除内容
					layer.confirm('您确认删除吗?', {icon: 3, title:'提示'}, function(index){
						  //do something
						  $.get("deleteAllClass",{ids:ids},function(data){
						//返回结果并刷新页面
						   layerTips.msg(data.msg,{time:500},function(){
							   layerTips.close(index);
								location.reload(); //刷新
						   });
						});
						 layer.close(index);
					});
				});
				

				var addBoxIndex = -1;
				$('#add').on('click', function() {
					if(addBoxIndex !== -1)
						return;
					//本表单通过ajax加载 --以模板的形式，当然你也可以直接写在页面上读取
					$.get('class-add', null, function(form) {
						addBoxIndex = layer.open({
							type: 1,
							title: '添加班级',
							content: form,
							btn: ['保存', '取消'],
							shade: false,
							offset: ['100px', '30%'],
							area: ['400px', '300px'],
							zIndex: 19891015,
							maxmin: true,
							yes: function(index) {
								//触发表单的提交事件
								$('form.layui-form').find('button[lay-filter=add]').click();
							},
							full: function(elem) {
								var win = window.top === window.self ? window : parent.window;
								$(win).on('resize', function() {
									var $this = $(this);
									elem.width($this.width()).height($this.height()).css({
										top: 0,
										left: 0
									});
									elem.children('div.layui-layer-content').height($this.height() - 95);
								});
							},
							success: function(layero, index) {
								//弹出窗口成功后渲染表单
								var form = layui.form();
								form.render();
								form.on('submit(add)', function(data) {
									console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
									console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
									console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
									//调用父窗口的layer对象
									
									//这里可以写ajax方法提交表单
									$.ajax({
									   type: "POST",
									   url: "saveClass",
									   data: data.field,
									   dataType: "json",
									   success: function(data){
										   layerTips.msg(data.msg,{time:500},function(){
											   layerTips.close(index);
												location.reload(); //刷新
										   })
											 /*  layerTips.open({
												title: '提示',
												type: 1,
												content: data.msg,
												area: ['300px', '200px'],
												btn: ['关闭并刷新', '关闭'],
												yes: function(index, layero) {
													layerTips.msg('你点击了关闭并刷新');
													layerTips.close(index);
													location.reload(); //刷新
												}

											}); */
									   }
									});
									return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。									
								});
								//console.log(layero, index);
							},
							end: function() {
								addBoxIndex = -1;
							}
						});
					});
				});

				$('#import').on('click', function() {
					var that = this;
					var index = layer.tips('只想提示地精准些', that, { tips: [1, 'white'] });
					$('#layui-layer' + index).children('div.layui-layer-content').css('color', '#000000');
				});
				
				
				
			});
		</script>
	</body>

</html>