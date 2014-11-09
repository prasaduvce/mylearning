<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
    <head>
        <title>TestSpringMVC</title>
    </head>
    <body>
    From EL:
        Message: ${message}
        <br/>
        From JSP
        Message: <%=request.getAttribute("message")%>
        <br/>
        ===============================================
        <br/>
        From JSTL: <c:out value="${message}"/>
    </body>
</html>