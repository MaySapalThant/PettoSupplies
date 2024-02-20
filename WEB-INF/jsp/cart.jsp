<%@ include file="inc/common.jsp"%>
<%@page import="com.petto.presentation.form.CartForm"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

        
     <logic:iterate id="cItem" property="cartItemList" name="CartFormBean">
		<html:form>
		<div class="item-card">
		
			<h1>${cItem.cartItem.name}</h1>
			<p>${cItem.cartItem.unitPrice}</p>
			<h4>${cItem.qty}</h4>
			<%-- <html:hidden property="itemCardId" value="${item.id}"/> --%>
			<html:submit property="btnItemDetail" value="Remove"/>
		</div>
		</html:form>
	</logic:iterate>
</body>
</html>