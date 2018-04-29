<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>登录</title>
<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="css/login.css" />
</head>

<body class="beg-login-bg">
	<div class="beg-login-box">
		<header>
			<h1>后台登录</h1>
		</header>
		<div class="beg-login-main">
			<form action="/manage/login" class="layui-form" method="post">
				<input name="__RequestVerificationToken" type="hidden"
					value="fkfh8D89BFqTdrE2iiSdG_L781RSRtdWOH411poVUWhxzA5MzI8es07g6KPYQh9Log-xf84pIR2RIAEkOokZL3Ee3UKmX0Jc8bW8jOdhqo81" />
				<div class="layui-form-item">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe612;</i>
					</label> <input type="text" name="username"
						value="${cookie.username.value}" lay-verify="userName"
						autocomplete="off" placeholder="这里输入登录名" class="layui-input">
				</div>
				<div class="layui-form-item">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe642;</i>
					</label> <input type="password" name="password"
						value="${cookie.password.value}" lay-verify="password"
						autocomplete="off" placeholder="这里输入密码" class="layui-input">
				</div>
				<div class="layui-form-item">
					<div class="beg-pull-left beg-login-remember">
						<label>记住帐号？</label> <input type="checkbox" name="rememberMe"
							value="true" lay-skin="switch" checked title="记住帐号">
					</div>
					<div class="beg-pull-right">
						<button class="layui-btn layui-btn-primary" lay-submit
							lay-filter="login">
							<i class="layui-icon">&#xe650;</i> 用户登录
						</button>
					</div>
					<div class="beg-pull-right">
						<button class="layui-btn layui-btn-primary" lay-submit
							lay-filter="stuRegister">
							<i class="layui-icon">&#xe650;</i> 学生注册
						</button>
					</div>
					<div class="beg-clear"></div>
					<div class="beg-pull-right">
						<button class="layui-btn layui-btn-primary" lay-submit
							lay-filter="teaRegister">
							<i class="layui-icon">&#xe650;</i> 教师注册
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
			layui.use(['layer', 'form'], function() {
				var layer = layui.layer,
					$ = layui.jquery,
					form = layui.form();
					
				form.on('submit(login)',function(data){
					//ajax方法提交表单
					$.ajax({
					   type: "POST",
					   url: "userLogin",
					   data: data.field,
					   dataType: "json",
					   success: function(data){
						   if (data.status==200) {
							   layer.msg('登陆成功', {icon: 6,time: 500},function(){
								   location.href="/";
							   });
						   } else {
							   layer.msg(data.msg, {icon: 5,time: 1000});
						   }
					   }
					});
					//location.href='index.html';
					return false;
				});
				form.on('submit(stuRegister)',function(data){
					location.href="/register-stu";
					return false;
				});
				form.on('submit(teaRegister)',function(data){
					location.href="/register-tea";
					return false;
				});
			});
			
		</script>
</body>

</html>