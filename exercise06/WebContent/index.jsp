<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:html xhtml="true">

<head>
<title><bean:message key="ex.indexpage.title" /></title>
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
		<html:link page="/showCustomerSearchForm.do">
			<h2><bean:message key="indexpage.linktext" /></h2>
		</html:link>
	</div>
</body>

</html:html>