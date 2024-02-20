<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/addToCartPath">
<h1>Item Detail</h1>
<h2>${ItemsFormBean.item.name}</h2>
<p>${ItemsFormBean.item.description}</p>
<h4>${ItemsFormBean.item.unitPrice}</h4>
<html:hidden property="frmCartItemId" value="${ItemsFormBean.item.id}"/>
<html:submit property="btnAddToCart" value="Add To Cart"/>
</html:form>
</body>
</html>