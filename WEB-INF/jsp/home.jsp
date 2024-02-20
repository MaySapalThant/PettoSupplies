<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.item{
		border: 2px solid green;
		background-color: rgb(50,50,255);
		display: inline-block;
	}
</style>
</head>
<body>
	<logic:iterate id="item" property="itemsList" name="ItemsFormBean">
		<html:form action="/itemDetailPath">
		<div class="item">
			<h1>${item.name}</h1>
			<p>${item.description}</p>
			<h4>${item.unitPrice}</h4>
			<html:hidden property="itemCardId" value="${item.id}"/>
			<html:submit property="btnItemDetail" value="Detail"/>
		</div>
		</html:form>
	</logic:iterate>
</body>
</html>