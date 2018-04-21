<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>注册</title>
		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="css/login.css" />
		<link rel="stylesheet" href="css/global.css" media="all">
		<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="css/table.css" />
	</head>

	<body class="beg-login-bg">
		<div class="beg-login-box">
			<header>
				<h1>后台注册</h1>
			</header>
			<div class="beg-login-main">
				<form action="/manage/teaRregister"  class="layui-form" method="post"><input name="__RequestVerificationToken" type="hidden" value="fkfh8D89BFqTdrE2iiSdG_L781RSRtdWOH411poVUWhxzA5MzI8es07g6KPYQh9Log-xf84pIR2RIAEkOokZL3Ee3UKmX0Jc8bW8jOdhqo81" />
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
						<input type="text" name="username"  lay-verify="username" autocomplete="off" placeholder="这里输入登录名" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="password" name="password" lay-verify="password" autocomplete="off" placeholder="这里输入密码" class="layui-input">
					</div>
					<div class="layui-form-item tea">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="text" name="teano" lay-verify="teano" autocomplete="off" placeholder="这里输入教师号" class="layui-input">
					</div>
					<div class="layui-form-item tea" style="display:none;">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="text" name="code" value="1" lay-verify="code" autocomplete="off" class="layui-input">
					</div>
					<div class="layui-form-item">
						<div class="beg-pull-right">
							<button class="layui-btn layui-btn-primary" lay-submit lay-filter="teaRregister">
                            <i class="layui-icon">&#xe650;</i> 注册
                        </button>
						</div>
						<div class="beg-clear"></div>
					</div>
				</form>
			</div>
			<footer>
				<p>学籍管理系统</p>
			</footer>
		</div>
		<script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script>
		layui.config({
			base: 'js/'
		});
			layui.use(['layer', 'form','jquery'], function() {
				var layer = layui.layer,
					$ = layui.jquery,
					form = layui.form();
				form.on('submit(teaRregister)',function(data){
					//ajax方法提交表单
					$.ajax({
					   type: "POST",
					   url: "userRegister",
					   data: data.field,
					   dataType: "json",
					   success: function(data){
						   if (data.status==200) {
							   layer.msg('注册成功', {icon: 6,time: 500},function(){
								   location.href="/login";
							   });
						   } else {
							   layer.msg(data.msg, {icon: 5,time: 1000});
						   }
					   }
					});
					return false;
				});
			});
		</script>
	</body>

</html>