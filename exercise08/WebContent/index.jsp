<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html xhtml="true">

<head>
	<title><bean:message key="ex.indexpage.title"/></title>
	<html:base/>
	<link rel="stylesheet" href="css/struts-training.css" charset="ISO-8859-1" type="text/css"/>
</head>

<body background="images/layout1.jpg">
	<br/><br/><br/><br/><br/>
    <div align="center">
    	<html:link page="/showCustomerSearchForm.do"><bean:message key="indexpage.linktext"/></html:link>
    </div>
    <br/><br/><br/><br/><br/>
    <div align="center">
    	<html:link forward="gotoXYZModule">Go to XYZ Module</html:link>
    </div>
</body>

</html:html>