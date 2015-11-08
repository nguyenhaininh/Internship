<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/struts-html-el.tld" prefix="html-el" %>

<html:html xhtml="true">
	<head>
		<title>
			<bean:message key="exercise01.successpage.title" />
        </title>
        <html:base/>
	</head>
   
	<body>
		<div align="center">
      	<h2>
        	<bean:message key="prompt.customer.firstname" />: <c:out value='${CustomerForm.firstName}' />
        	<bean:message key="prompt.customer.lastname" />: <c:out value='${CustomerForm.lastName}' />
        </h2>
        
        <h3><bean:message key="exercise01.successpage.message" /></h3>
		<html-el:img src="images/ninh.jpg" altKey="image.congra.alttext" bundle = "bundle.image"/>
    	<p/><p/>
    	
    	<c:if test='${CustomerForm.receiveEmail == true}' >
			<bean:message key="successpage.thanks"/>
			<br/>
			<bean:message key="successpage.emaildest"/>
			<c:out value='${CustomerForm.emailAddress}' />
		</c:if>
		<br/>
     	<html-el:link page="/showCustomerForm.do"><h2>Go Back</h2></html-el:link>
     	</div>
     </body>
</html:html>

