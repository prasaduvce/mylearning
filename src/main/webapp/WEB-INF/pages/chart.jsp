<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
			First High Chart
		</title>

		<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/highcharts.js" />" ></script>

		<script type="text/javascript">
			$(document).ready(function() {
				$('#container').highcharts({
					chart: {
						type: 'bar'
					},
					title: {
						text: 'Fruit Consumption'
					},
					xAxis: {
						categories: ['Apples','Bananas','Mangoes']
					},
					yAxis: {
						title: {
							test: 'Fruit Eaten'
						}
					},
					series: [{
						name: 'Jane',
						data: [1, 0, 4]
					},
					{
						name: 'John',
						data: [5, 7, 3]
					}]
				});
			});
		</script>
	</head>
	<body>
		<div id="container" style="width: 100%; height: 400px;">
		</div>
	</body>
</html>
