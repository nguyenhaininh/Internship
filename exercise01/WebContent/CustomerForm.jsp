<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html xhtml="true">

	<head>
			<title><bean:message key="exercise01.formpage.title"/></title>
			<html:base/>
	</head>
	
	<body background="images/donglua.jpg" style="
    background-repeat: no-repeat;">
		<div align="center">
		
			<h2><bean:message key="exercise01.formpage.title"/></h2>
			
			<html:errors/>
			
			<html:form action="/submitCustomerForm" method="GET">
			
				<bean:message key="prompt.customer.firstname"/>:
				<html:text property="firstName" size="16" maxlength="16"/>
				<BR>
				
				<bean:message key="prompt.customer.lastname"/>:
				<html:text property="lastName" size="16" maxlength="16"/>
				<BR>
				
				<html:submit property="step">
				<bean:message key="button.save"/>
			</html:submit>
			
			&nbsp;
		
			<html:cancel>
				<bean:message key="button.cancel"/>
			</html:cancel>
			
			</html:form>
		
		</div>
		
	</body>
	
</html:html>