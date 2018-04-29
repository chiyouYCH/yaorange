<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>注册</title>
<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="css/login.css" />
<link rel="stylesheet" href="css/global.css" media="all">
<link rel="stylesheet"
	href="plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="css/table.css" />
</head>

<body class="beg-login-bg">
	<div class="beg-login-box">
		<header>
			<h1>后台注册</h1>
		</header>
		<div class="beg-login-main">
			<form action="/manage/stuRregister" class="layui-form" method="post">
				<input name="__RequestVerificationToken" type="hidden"
					value="fkfh8D89BFqTdrE2iiSdG_L781RSRtdWOH411poVUWhxzA5MzI8es07g6KPYQh9Log-xf84pIR2RIAEkOokZL3Ee3UKmX0Jc8bW8jOdhqo81" />
				<div class="layui-form-item">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe612;</i>
					</label> <input type="text" name="username" lay-verify="username"
						autocomplete="off" placeholder="这里输入登录名" class="layui-input">
				</div>
				<div class="layui-form-item">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe642;</i>
					</label> <input type="password" name="password" lay-verify="password"
						autocomplete="off" placeholder="这里输入密码" class="layui-input">
				</div>
				<div class="layui-form-item stu">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe642;</i>
					</label> <input type="text" name="qq" lay-verify="qq" autocomplete="off"
						placeholder="这里输入qq" class="layui-input">
				</div>
				<div class="layui-form-item stu">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe642;</i>
					</label> <input type="text" name="email" lay-verify="email"
						autocomplete="off" placeholder="这里输入邮箱" class="layui-input">
				</div>
				<div class="layui-form-item" style="margin-left: -60px">
					<label class="layui-form-label">性别</label>
					<div class="layui-input-block">
						<input type="radio" name="sex" value="1" title="男"> <input
							type="radio" name="sex" value="2" title="女">
					</div>
					<div class="beg-pull-right">
						<button class="layui-btn layui-btn-primary" lay-submit
							lay-filter="stuRregister">
							<i class="layui-icon">&#xe650;</i> 注册
						</button>
					</div>
					<div class="beg-clear"></div>
				</div>
				<div class="layui-form-item" style="display: none;">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe642;</i>
					</label> <input type="text" name="code" value="2" lay-verify="code"
						autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-item"></div>
			</form>
		</div>
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
				form.on('submit(stuRregister)',function(data){
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