<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:html xhtml="true">

<head>
<title>An error occured</title>
<html:base />
<link rel="stylesheet" href="css/struts-training.css" type="text/css" />
</head>

<body background="images/layout1.jpg">
    <br />
    <br />
    <br />
    <br />
    <br />
    <div align="center">
        An unexpected error occured while processing your request<br /> The exception details are:
        <%=request.getAttribute("Globals.EXCEPTION_KEY")%>
    </div>
</body>

</html:html>