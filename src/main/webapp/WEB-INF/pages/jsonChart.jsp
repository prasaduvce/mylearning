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
                    title: {
                    	text: 'Consignments Processed'
                    },
                    subtitle: {
                    	text: 'Invoices Processed'
                    },
                    xAxis: {
						categories: ['','TSI/VANS','GIS','PEPPOL','NEMHANDEL'],
						title: {
							text: '---In Channels---'
						}
                    },
                    yAxis: {
                    	title: {
                    		text: '---Number of Invoices---'
                    	}
                    },
                    series: [{}, {}, {}, {}, {}]
                };
                $.getJSON('showChart',function(data) {
                    options.series[0].data = data;
                    options.series[0].name = 'Number of Consignments';

                    options.series[1].data = data;
                    options.series[1].name = 'Number of Invoices';

                    options.series[2].data = data;
                    options.series[2].name = 'Number of Invoices1';

                    options.series[3].data = data;
                    options.series[3].name = 'Number of Invoices2';

                    options.series[4].data = data;
                    options.series[4].name = 'Number of Invoices3';

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
