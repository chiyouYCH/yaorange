<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
<head>
<meta charset="utf-8">
</head>
<body style="height: 100%; margin: 0">
	<div id="container" style="height: 100%"></div>
	<script type="text/javascript" src="js/echarts.min.js"></script>
	<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
	<script type="text/javascript">
		var dom = document.getElementById("container");
		var myChart = echarts.init(dom);
		var app = {};
		option = null;
			var seriesLabel = {
			    normal: {
			        show: true,
			        textBorderColor: '#333',
			        textBorderWidth: 2
			    }
			}
		$.get("stat_getSalaryJson","",function(json){
			option = {
				    title: {
				        text: '每班按薪资统计'
				    },
				    tooltip: {
				        trigger: 'axis',
				        axisPointer: {
				            type: 'shadow'
				        }
				    },
				    legend: {
				        data: ['>5000', '5000-10000', '>10000']
				    },
				    grid: {
				        left: 100
				    },
				    toolbox: {
				        show: true,
				        feature: {
				            saveAsImage: {}
				        }
				    },
				    xAxis: {
				        type: 'value',
				        name: '人数',
				        axisLabel: {
				            formatter: '{value}'
				        }
				    },
				    yAxis: {
				        type: 'category',
				        inverse: true,
				        data: json.xAxisDate
				    },
				    series: json.echartSeries
				};;
				if (option && typeof option === "object") {
				    myChart.setOption(option, true);
				}
		},"json")
       </script>
</body>
</html>