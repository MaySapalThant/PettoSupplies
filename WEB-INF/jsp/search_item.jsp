<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css1/shared.css" type="text/css">
    <link rel="stylesheet" href="css1/all_products_style.css" type="text/css">
    <link rel="icon" href="images/paw-print-clip-art-heart.ico">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<style>
	.product-cards:hover{
	border: 2px solid red;
}
	</style>
</head>
<body>
<%@ include file="inc/nav.jsp" %>
    <section class="section-main">
        
        <div class="container-category">
            
                
                    <logic:notEmpty property="itemsList" name="SearchFormBean">
                    	<h5 class="ms-4">Items of your search - ${SearchFormBean.searchKey }</h5>
					</logic:notEmpty>
					<logic:empty property="itemsList" name="SearchFormBean">
                    	<h5 class="ms-4">Your search - ${SearchFormBean.searchKey } did not match any items.</h5>
					</logic:empty>
					
					
                    <div class="container">
            
                        <div class="row"> <!--  class="products-frame" -->
                            <logic:notEmpty property="itemsList" name="SearchFormBean">
								<logic:iterate id="item" property="itemsList" name="SearchFormBean">
								<div class="card product-cards col-lg-2 col-6 mb-3 mx-3" id="product-card${item.id}" style="background: #faf0ea;">
                    		<img src="${item.itemImage }" class="card-img-top mt-2" alt="${item.itemName }">
                    		<div class="card-body d-flex flex-column">
                      			<h6 class="card-title">${item.itemName }</h6>
                      			<p class="card-text">${item.unitPrice } ks</p>
                      			
                      			 
                      			 	<html:form action="/addToCartPath" styleClass="mt-auto w-100 align-self-baseline">
                      			 	
                        				<a href="itemDetailPath.do?frmItemId=${item.id}" style="">View Detail</a>
                      					
                    					<html:hidden property="frmItemQty" value="1"/>
                    					<html:hidden property="frmCartItemId" value="${item.id}"/>
                    					<%-- <logic:notEmpty property="cartItemList" name="CartFormBean">
											<logic:iterate id="itemInCart" property="cartItemList" name="CartFormBean">
												<c:if test="${item.id == itemInCart.cartItem.id }">
													<html:hidden property="tempQty" value="${itemInCart.qty }"/>
												</c:if>
											</logic:iterate> --%>
										
                    						<c:if test="${item.stock == 0 || item.stock <= item.cartQty}">
                    						<span class="d-block">Item left: 0 item.</span>
                    							<html:submit property="btnAddToCart" disabled="true" styleClass="btn btn-secondary btn-lg w-100" value="Out of Stock"/>
                    						</c:if>
                    					
                    						<c:if test="${item.stock != 0 && item.stock > item.cartQty}">
                    							<span class="d-block">Item left:${item.stock - item.cartQty} items.</span>
          										<html:submit property="btnAddToCart" styleId="add-to-cart-toggle${item.id}" styleClass="cart-btn btn btn-red btn-lg w-100" value="Add to Cart"/>
          										
                    							
                    							<%-- <logic:notEmpty property="frmAlert" name="CartFormBean">
          											<html:submit property="btnAddToCart" styleId="add-to-cart-toggle" styleClass="btn btn-red btn-lg w-100" onclick="addToCart()" value="View Cart >>"/>
          										</logic:notEmpty> --%>		
                    						</c:if>
                    					<%-- </logic:notEmpty> --%>
                    					
                    				</html:form>
        						
      							
                      			
                    		</div>
                		</div>
									<%-- <div class="product-card col-lg-2 col-6 mb-5">
                                		<img src="${item.itemImage }" class="card-img-top" alt="${item.itemName }">
                                		<div class="card-body">
                                  			<h6 class="card-title">${item.itemName }</h6>
                                  			<p class="card-text">${item.unitPrice } ks</p>
                                  			
                                  			<a href="itemDetailPath.do?frmItemId=${item.id}" class="btn btn-red">Detail<span class="link"></span></a>
                                		</div>
                            		</div> --%>
								</logic:iterate>
							</logic:notEmpty>
                            

                        </div>
                    </div>
              
        </div> 
    </section>
    <script src="js/bootstrap.min.js"></script>
    	<script src="js/jquery.js"></script>
    	<script type="text/JavaScript">
	$(document).ready(function(){
		
       /*  $("#add-to-cart-toggle").click(function(){
            var btn = $("#add-to-cart-toggle");
            btn.css({ backgroundColor : 'pink'});
        }); */ 
        
        $(".cart-btn").attr("id", "add-to-cart-toggle" + ${item.id}).click(function(){
            $(this).css({"background-color": "#ffffff", "color" : "pink"});
            });
         

        $(".product-cards").attr("id", "product-card" + ${item.id}).mouseout(function(){
            $(this).css({"background-color": "#faf0ea", "color" : "#000000"});
            });
        
        
    });
	
	</script> 
</body>
</html>