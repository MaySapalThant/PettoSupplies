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
            <div class="row">
                <div class="col-md-2 col-12 ms-5 col-one">
                    <table class="category-lists">
                        <tr>
                            <th>${PetPageFormBean.pet.petName } Supplies</th>
                        </tr>
                        <logic:notEmpty property="subCategoriesList" name="PetPageFormBean">
							<logic:iterate id="category" property="subCategoriesList" name="PetPageFormBean">
								<tr>
                            		<td><a href="categoryPagePath.do?frmCategoryId=${category.id}" class="category-card-text d-block">${category.categoryName }</a></td>
                        		</tr>
							</logic:iterate>
						</logic:notEmpty> 
                    </table>   
                </div>
                <div class="col-md-9 col-12 mt-md-0 mt-5">
                    <div class="row">
                    	<div class="col-md-3 col-sm-6">
                    		<h6 class="m-3"><a href="homePath.do">home</a>/<a href="petPagePath.do?frmPetId=${PetPageFormBean.pet.id}">All ${PetPageFormBean.pet.petName } items</a></h6>
                    	</div>
                    	<div class="col-md-5 d-md-block d-none">
                    		
                    	</div>
                    	<div class="col-md-4 col-sm-6">
                    	<html:form action="/petPagePath" styleClass="d-flex me-md-0 me-2">
							<html:hidden property="frmPetId" value="${PetPageFormBean.pet.id}"/>
							<html:hidden property="frmSearchKey" styleId="idSearchKey" />
                    		<input class="form-control ms-md-0 ms-2" list="datalistOptions" id="idItemName">
							<datalist id="datalistOptions">
								<logic:notEmpty property="searchList" name="PetPageFormBean">
									<logic:iterate id="item" property="searchList" name="PetPageFormBean">
										<option value="${item.itemName }">
									</logic:iterate>
								</logic:notEmpty>	
							</datalist>
							<html:submit property="btnSearch"
							styleClass="btn btn-outline-danger ms-2" styleId="search"
							onclick="dataListSearch()">Search</html:submit>
						</html:form>
                    	</div>
                        
                    </div>
                    <h1 class="ms-md-0 ms-5">All ${PetPageFormBean.pet.petName } Supplies</h1>

                    <div class="container">
            
                        <div class="row d-flex justify-content-around"> <!--  class="products-frame" -->
                            <logic:notEmpty property="subItemsListByPet" name="PetPageFormBean">
								<logic:iterate id="item" property="subItemsListByPet" name="PetPageFormBean">
									<div class="card product-cards shadow col-lg-3 col-5 mb-5 mx-2"
									id="product-card${item.id}" style="background: #faf0ea;">
									<img src="${item.itemImage }" class="card-img-top mt-2"
										alt="${item.itemName }" >
									<div class="card-body d-flex flex-column">
										<h6 class="card-title">${item.itemName }</h6>
										<p class="card-text">${item.unitPrice } ks</p>


										<html:form action="/addToCartPath"
											styleClass="mt-auto w-100 align-self-baseline">

											<a href="itemDetailPath.do?frmItemId=${item.id}" style="">View
												Detail</a>

											<html:hidden property="frmItemQty" value="1" />
											<html:hidden property="frmCartItemId" value="${item.id}" />

											<c:if test="${item.stock == 0 || item.stock <= item.cartQty}">
												<span class="d-block">Item left: 0 item.</span>
												<html:submit property="btnAddToCart" disabled="true"
													styleClass="btn btn-secondary btn-lg w-100"
													value="Out of Stock" />
											</c:if>

											<c:if test="${item.stock != 0 && item.stock > item.cartQty}">
												<span class="d-block">Item left:${item.stock -
													item.cartQty} items.</span>
												<html:submit property="btnAddToCart"
													styleId="add-to-cart-toggle${item.id}"
													styleClass="cart-btn btn btn-red btn-lg w-100"
													value="Add to Cart" />


												<%-- <logic:notEmpty property="frmAlert" name="CartFormBean">
          											<html:submit property="btnAddToCart" styleId="add-to-cart-toggle" styleClass="btn btn-red btn-lg w-100" onclick="addToCart()" value="View Cart >>"/>
          										</logic:notEmpty> --%>
											</c:if>


										</html:form>



									</div>
								</div>
								<%-- <div class="card product-cards col-md-3 col-6 mb-5 mx-4">
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
         
        /*$(".product-cards").attr("id", "product-card" + ${item.id}).mouseover(function(){
            $(this).css({"background-color": "#ff4a97", "color" : "white"});
            });*/
        $(".product-cards").attr("id", "product-card" + ${item.id}).mouseout(function(){
            $(this).css({"background-color": "#faf0ea", "color" : "#000000"});
            });
        
        
    });
	
	function dataListSearch(){
        const itemName = document.getElementById("idItemName").value;
        console.log(itemName);
        // const height = document.getElementById("height").value;
        
        document.getElementById("idSearchKey").value = itemName;
    }
	</script>
</body>
</html>