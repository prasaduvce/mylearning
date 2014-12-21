<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
			Test High Chart
		</title>

		<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/highcharts.js" />" ></script>

		<script type="text/javascript">
			$(document).ready(function() {
                var options = {
                    chart: {
                        type: 'column'
                    },
                    title: {
                        text: 'My custom title'
                    },
                    subtitle: {
                        text: 'My custom subtitle'
                    },
                    xAxis: {
                        /*
                        labels: {
                            formatter: function () {
                                return this.value;
                            }
                        },
                        */
                        gridLineWidth: 1,
                        categories: ['India','Norway','Denmark'],
                        title: {text: '-----Countries-----'}
                    },
                    yAxis:[
                        {
                            type: 'linear',
                            title: {text: '-----Temperature-----'},
                            gridLineWidth: 0
                        },
                        {
                            title: {text: '-----Rainfall-----'},
                            gridLineWidth: 0,
                            opposite: true
                        }
                    ],
                    series: [
                        {
                            yAxis: 0,
                            data: [49.9, 71.5, 106.4],
                            name: 'Temperature'
                        },
                        {
                            yAxis: 1,
                            data: [7.0, 6.9, 9.5],
                            name: 'Rainfall'
                        }
                    ]
                };

                $('#container').highcharts(options);
			});
		</script>
	</head>
	<body>
		<div id="container" style="width: 100%; height: 600px;">
		</div>
	</body>
</html>
