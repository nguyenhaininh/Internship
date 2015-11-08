<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html xhtml="true">

<head>
	<title><bean:message key="ex.indexpage.title"/></title>
	<html:base/>
</head>

<body background="images/layout1.jpg">
	<p/>
    <div align="center" >
    </br></br></br></br>
    	<html:link page="/showCustomerForm.do"><h1>Go to Customer Form</h1></html:link>
    </div>
</body>

</html:html>