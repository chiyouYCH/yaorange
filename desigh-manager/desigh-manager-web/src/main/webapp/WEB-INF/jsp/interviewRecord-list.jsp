<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>面试记录信息</title>
	<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="css/global.css" media="all">
	<link rel="stylesheet"
		  href="plugins/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/table.css" />
</head>

<body>
<div class="admin-main">

	<blockquote class="layui-elem-quote">
		<a href="javascript:;" class="layui-btn layui-btn-small" id="add">
			<i class="layui-icon">&#xe608;</i> 添加面试记录
		</a> <a href="#" class="layui-btn layui-btn-small" id="getSelected">
		<i class="fa fa-shopping-cart" aria-hidden="true"></i> 删除所选
	</a> <a href="interviewRecord-list" class="layui-btn layui-btn-small" id="fluse">
		<i class="layui-icon">&#x1002;</i> 刷新
	</a>
		<form class="layui-form" style="float: right;">
			<div class="layui-form-item" style="margin: 0;">
				<div class="layui-input-inline">
					<input type="text" name="name" placeholder="请输入姓名"
						   autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux" style="padding: 0;">
					<button lay-filter="search" class="layui-btn" lay-submit
							id="search">
						<i class="fa fa-search" aria-hidden="true"></i> 查询
					</button>
				</div>
			</div>
		</form>

	</blockquote>
	<fieldset class="layui-elem-field">
		<legend>面试记录列表</legend>
		<div class="layui-field-box layui-form">
			<table class="layui-table admin-table">
				<thead>
				<tr>
					<th style="width: 30px;"><input type="checkbox"
													lay-filter="allselector" lay-skin="primary"></th>
					<th>学号</th>
					<th>姓名</th>
					<th>班级</th>
					<th>面试企业</th>
					<th>企业地点</th>
					<th>联系人</th>
					<th>企业联系电话</th>
					<th>面试时间</th>
				</tr>
				</thead>
				<tbody id="content">
				</tbody>
			</table>
		</div>
	</fieldset>
	<div class="admin-table-page">
		<div id="paged" class="page"></div>
	</div>
</div>
<!--模板-->
<script type="text/html" id="tpl">
	{{# layui.each(d.list, function(index, item){ }}
	<tr>
		<td><input type="checkbox" lay-skin="primary"></td>
		<td>{{ item.studentno }}</td>
		<td>{{ item.studentname }}</td>
		<td>{{ item.classname }}</td>
		<td>{{ item.interviewcompany }}</td>
		<td>{{ item.interviewplace }}</td>
		<td>{{ item.contacts }}</td>
		<td>{{ item.contactsphone }}</td>
		<td>{{ null==item.interviewtime?'':layui.laytpl.toDateString(item.creartetime,'yyyy-MM-dd') }}</td>
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

    layui.use(['paging', 'form','laydate'], function() {
        var $ = layui.jquery,
            paging = layui.paging(),
            layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
            layer = layui.layer, //获取当前窗口的layer对象
            laydate = layui.laydate,
            form = layui.form();
        layui.laytpl.toDateString = function(d, format){
            var date = new Date(d || new Date())
                ,ymd = [
                this.digit(date.getFullYear(), 4)
                ,this.digit(date.getMonth() + 1)
                ,this.digit(date.getDate())
            ]
                ,hms = [
                this.digit(date.getHours())
                ,this.digit(date.getMinutes())
                ,this.digit(date.getSeconds())
            ];

            format = format || 'yyyy-MM-dd HH:mm:ss';

            return format.replace(/yyyy/g, ymd[0])
                .replace(/MM/g, ymd[1])
                .replace(/dd/g, ymd[2])
                .replace(/HH/g, hms[0])
                .replace(/mm/g, hms[1])
                .replace(/ss/g, hms[2]);
        };
        layui.laytpl.toCode = function(code){
            if(code==0){
                return '管理员';
            }else if(code==1){
                return '教师';
            }else{
                return '学生';
            }
        };

        //数字前置补零
        layui.laytpl.digit = function(num, length, end){
            var str = '';
            num = String(num);
            length = length || 2;
            for(var i = num.length; i < length; i++){
                str += '0';
            }
            return num < Math.pow(10, length) ? str + (num|0) : num;
        };

        $('#search').on('click', function() {
            var $this = $(this);
            var name = $this.prev('input[username=username]').val();
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
            url: 'getInterviewRecordList?name=${name}', //地址
            elem: '#content', //内容容器
            params: { //发送到服务端的参数
            },
            type: 'GET',
            tempElem: '#tpl', //模块容器
            pageConfig: { //分页参数配置
                elem: '#paged', //分页容器
                pageSize: 4 //分页大小
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
                            $.get("deleteInterviewRecord",{id:id},function(data){
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
                        $.get('interviewRecord-edit', {id:id}, function(form) {
                            addBoxIndex = layer.open({
                                type: 1,
                                title: '修改面试记录信息',
                                content: form,
                                btn: ['保存', '取消'],
                                shade: false,
                                offset: 'auto',
                                area: ['520px', '450px'],
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
                                            url: "updateInterviewRecord",
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
                    var n = $that.children('td:last-child').children('a[data-opt=del]').data('id');
                    ids += n + ',';
                }
            });
            //后台删除内容
            layer.confirm('您确认删除吗?', {icon: 3, title:'提示'}, function(index){
                //do something
                $.get("deleteAllUser",{ids:ids},function(data){
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
            $.get('interviewRecord-add', null, function(form) {
                addBoxIndex = layer.open({
                    type: 1,
                    title: '添加面试记录',
                    content: form,
                    btn: ['保存', '取消'],
                    shade: false,
                    offset: 'auto',
                    area: ['400px', '360px'],
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
                            //这里可以写ajax方法提交表单
                            $.ajax({
                                type: "POST",
                                url: "saveInterviewRecord",
                                data: data.field,
                                dataType: "json",
                                success: function(data){
                                    layerTips.msg(data.msg,{time:500},function(){
                                        layerTips.close(index);
                                        location.reload(); //刷新
                                    })
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