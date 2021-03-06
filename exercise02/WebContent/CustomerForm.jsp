<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html:html xhtml="true">

<head>
	<title><bean:message key="ex.formpage.title"/></title>
	<html:base/>
</head>

<body background="images/layout1.jpg">
<div align="center">
	<br/><br/><br/>
	<h2><bean:message key="formpage.title"/></h2>

	<html:errors/>

	<html:form action="/submitCustomerForm" method="GET">

  	<table align="center">
  		<tr>
			<td align="right"><bean:message key="prompt.customer.firstname"/>:</td>
			<td align="left"><html:text property="firstName" size="16" maxlength="25"/></td>
		</tr>

  		<tr>
			<td align="right"><bean:message key="prompt.customer.lastname"/>:</td>
			<td align="left"><html:text property="lastName" size="16" maxlength="25"/></td>
		</tr>

  		<tr>
			<td align="right"><bean:message key="prompt.customer.email"/>:</td>
			<td align="left"><html:text property="emailAddress" size="16" maxlength="30"/></td>
		</tr>

  		<tr>
			<td align="right"><bean:message key="prompt.customer.preferredCarrier"/>:</td>
			<td align="left">
				<html:radio property="preferredCarrier" value="UPS"/>UPS &nbsp;
				<html:radio property="preferredCarrier" value="USP"/>USPS &nbsp;
				<html:radio property="preferredCarrier" value="FDX"/>FedEx &nbsp;
			</td>
		</tr>

		<tr>
			<td align="right"><bean:message key="prompt.customer.address.city"/>:</td>
			<td align="left"><html:text property="address.city" size="16" maxlength="16"/></td>
		</tr>

		

  		<tr>
			<td align="right"><bean:message key="prompt.customer.address.zip"/>:</td>
			<td align="left"><html:text property="address.zip" size="16" maxlength="16"/></td>
		</tr>

		<tr>
			<td align="right"><html:checkbox property="receiveEmail"/></td>
			<td align="left"><bean:message key="prompt.customer.receiveEmail"/>:</td>
		</tr>

		<tr><td>&nbsp;</td><td>&nbsp;</td></tr>
		<tr>
			<td align="center"><html:image property="save" srcKey="image.save" altKey="image.save.alttext" bundle="bundle.image"/></td>
			<td align="center"><html:image property="cancel" srcKey="image.cancel" altKey="image.cancel.alttext" bundle="bundle.image"/></td>
		</tr>
	</table>
  	</html:form>
</div>
</body>

</html:html>