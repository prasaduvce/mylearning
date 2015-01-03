<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>
			First Bar Chart
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
                    title: {
                    	text: 'Consignments Processed'
                    },
                    subtitle: {
                    	text: 'Invoices Processed'
                    },
                    xAxis: {
						categories: ['TSI/VANS','GIS','PEPPOL','NEMHANDEL', 'LIME'],
						title: {
							text: '---In Channels---'
						}
                    },
                    yAxis: {
                    	title: {
                    		text: '---Number of Invoices---'
                    	}
                    },
                    series: [{},{},{},{},{}]
                };
                $.getJSON('numberOfInvoicesProcessedPerChannel',function(data) {
                $.each(data, function(i, value) {
                    options.series[parseInt(i)].data = data[1];
                });
                $('#container').highcharts(options);
                }).fail(function (){
                	alert("Exception while fetching the data.");
                });
			});
		</script>
	</head>
	<body>
		<div id="container" style="width: 100%; height: 600px;">
		</div>
	</body>
</html>
