<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css1/shared.css" type="text/css">
    <link rel="stylesheet" href="css1/cart_style.css" type="text/css">
    <link rel="icon" href="images/paw-print-clip-art-heart.ico">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

    
    <%@ include file="inc/nav.jsp" %>
    
    <section class="section-main">
        
        <%-- <logic:notEmpty property="frmAlert" name="CartFormBean">
          		<div class="row">
          			<div class="col-md-4">
          			</div>
          			<div class="col-md-4">
          				<div class="alert alert-success" role="alert">
  							${CartFormBean.frmAlert} 
						</div>
          			</div>
          			<div class="col-md-4">
          			</div>
          		</div>
          		
         </logic:notEmpty> --%>
          
        <div class="container container-main">
        
            <div class="row">
                <div class="col-7">
                    <h4 class="d-inline-flex"><span>${CartFormBean.frmTotalQty }</span> items in your cart.</h4>
                </div>
                <div class="col-5">
                    <div class="d-inline-flex float-end">
                        <a href="homePath.do" type="button" class="btn btn-red mb-3">Keep Shopping</a>
                    </div>
                </div>
            </div>
            

            
            <div class="row">
                <div class="col-lg-9 col-12">
                    <div class="item-table-container w-100">
                        <table class="item-table table table-striped">
                            <tr>
                                <th colspan="2" class="item-name text-center">Item</th>
                                <th class="unit-price text-center">Unit Price</th>
                                <th class="qty text-center">Qty</th>
                                <th class="text-center">Total Price</th>
                                <th></th>
                            </tr>
                            
                            <logic:notEmpty property="cartItemList" name="CartFormBean">
								<logic:iterate id="cartItem" property="cartItemList" name="CartFormBean">
								<html:form action="/addToCartPath">
									<tr>
                                		<td class="text-center">
                                    		<div class="img-container">
                                        		<img src="${cartItem.cartItem.itemImage }">
                                    		</div> 
                                		</td>
                                		<td  class="item-name">${cartItem.cartItem.itemName } </td>
                                		<td class="unit-price text-center">${cartItem.cartItem.unitPrice } ks</td>
                                		<td class="qty text-center">
                                		<c:if test="${cartItem.cartItem.stock <= 0}">
                    						<html:submit property="btnMinus" disabled="true" styleClass="btn btn-red" value="-"></html:submit>
                        					<html:text property="frmItemQty" disabled="true" size="1" styleClass="d-inline border border-1 border-dark" value="${cartItem.qty }"/>
                        					<html:submit property="btnPlus" disabled="true" styleClass="btn btn-red" value="+"></html:submit>
                    					</c:if>
                    					<c:if test="${cartItem.cartItem.stock != 0}">
                    						<html:submit property="btnMinus" styleClass="btn btn-red" value="-"></html:submit>
                        					<html:text property="frmItemQty" disabled="true" size="1" styleClass="d-inline border border-1 border-dark" value="${cartItem.qty }"/>
                        					<html:submit property="btnPlus" styleClass="btn btn-red" value="+"></html:submit>
                    					</c:if>
                    					</td>
                                		<td class="text-center">${cartItem.cartItem.unitPrice * cartItem.qty } ks</td>
                                		<html:hidden property="frmItemQty" value="${cartItem.qty}"/>
                                		<html:hidden property="frmCartItemId" value="${cartItem.cartItem.id}"/>
                                		<td><html:submit property="btnRemove" styleClass="text-decoration-none link-danger">Remove</html:submit></td>
                            		</tr>
								</html:form>	
								</logic:iterate>
							</logic:notEmpty>
                            
                        </table>
                    </div>
                    
                </div>
                <div class="col-lg-3 col-12">
                    <table class="total-table mt-lg-0 mt-3">
                        <tr>
                            <th colspan="2"><h2 class="m-2">Summary</h2> <hr class="m-2"> </th>
                        </tr>
                        
                        <tr>
                            <th><span class="m-2">Number of Items</span></th> <td  class="text-center">${CartFormBean.frmTotalQty }</td>
                        </tr>
                        <tr>
                            <th colspan="2"><br></th>
                        </tr>
                        <tr>
                            <th><span class="m-2">Total Price</span></th> <td  class="text-center">${CartFormBean.frmTotalPrice } ks<br></td>
                        </tr>
                        <tr>
                            <td colspan="2" class="text-center">
                                <hr>
                                <logic:notPresent property="loginCustomer" name="LoginFormBean">
                					<a href="loginPathFirst.do?" type="button" class="btn btn-lg btn-red m-1 mb-3">Process to Checkout</a>
                				</logic:notPresent>
                				<logic:present property="loginCustomer" name="LoginFormBean">
                					<a href="checkoutPathFirst.do" type="button" class="btn btn-lg btn-red m-1 mb-3">Process to Checkout</a>
                				</logic:present>

                            </td>
                        </tr>
                    </table>
                
            </div>
         
        </div> 
        </div>
    </section>


    <script src="js/bootstrap.min.js"></script>
    
    
</body>
</html>