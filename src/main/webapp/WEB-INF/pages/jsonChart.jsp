<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
			Test High Chart
		</title>

		<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/highcharts.js" />" ></script>

		<script type="text/javascript">
		var jsonpath = '<c:url value="/resources/json/data.json" />';
			$(document).ready(function() {
			console.log("jsonpath ===> "+jsonpath);
                var options = {
                    chart: {
                        type: 'column'
                    },
                    series: [{}]
                };
                $.getJSON('http://localhost:8080'+jsonpath,function(data) {
                    options.series[0].data = data;
                    //var chart = Highcharts.Chart(options);
                    $('#container').highcharts(options);
                });
			});
		</script>
	</head>
	<body>
		<div id="container" style="width: 100%; height: 600px;">
		</div>
	</body>
</html>
