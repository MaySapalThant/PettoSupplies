<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css1/shared.css" type="text/css">
    <link rel="stylesheet" href="css1/product_detail_style.css" type="text/css">
    <link rel="icon" href="images/paw-print-clip-art-heart.ico">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <%-- <div class="position-fixed w-100 nav-div top-0">
        <nav class="navbar navbar-expand-lg navbar-light border-bottom border-1 border-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="homePath.do">
                    <img src="images/paw-print-clip-art-heart.png" alt="" width="50" class="rounded-circle">
                 </a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="homePath.do">Pet Needs</a>
                  </li>
                  
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Shop By Pet
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                     <logic:notEmpty property="petsList" name="ItemDetailFormBean">
							<logic:iterate id="pet" property="petsList" name="ItemDetailFormBean">
								<li><a class="dropdown-item" href="petPagePath.do?frmPetId=${pet.id}">${pet.petName }</a></li>
							</logic:iterate>
						</logic:notEmpty>
                    </ul>
                  </li>
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Shop By Category
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                      <logic:notEmpty property="categoriesList" name="ItemDetailFormBean">
							<logic:iterate id="category" property="categoriesList" name="ItemDetailFormBean">
								<li><a class="dropdown-item" href="categoryPagePath.do?frmCategoryId=${category.id}">${category.categoryName }</a></li>
							</logic:iterate>
						</logic:notEmpty>
                    </ul>
                  </li>
                </ul>
                <logic:notPresent property="loginCustomer" name="LoginFormBean">
                	<a href="loginPathFirst.do" class="nav-link text-decoration-none"><i class="fa fa-user-circle fa-2x m-0"></i>Login</a>
                </logic:notPresent>
                <logic:present property="loginCustomer" name="LoginFormBean">
                	<a href="profileUpdatePathFirst.do" class="nav-link text-decoration-none"><i class="fa fa-user-circle fa-2x m-0"></i>Profile</a>
                </logic:present>
                <a href="addToCartPath.do" class="nav-link text-decoration-none"><i class="fa fa-shopping-cart fa-2x m-0"></i></a>

              </div>
            </div>
        </nav>
    </div> --%>
    <%@ include file="inc/nav.jsp" %>
    
    <section class="section-main">
         
        <div class="container container-main">
            <div class="row">
                <div class="col-md-6 col-12">
               
                    <div class="container-gallery">
         
                        <!-- Main view of our gallery -->
                        <div class="main_view">
                            <img class="product-img" src="${ItemDetailFormBean.item.itemImage }" id="main" alt="IMAGE">
                        </div>
                 
                        <!-- All images with side view
                        <div class="side_view">
                            
                            <img class="product-img" src="images/blue_buffalo_front.jpg" onclick="change(this.src)">
                            <img class="product-img" src="images/blue_buffalo_back.jpg" onclick="change(this.src)">
                        </div> -->
                    </div>
                </div>
                <div class="col-md-6 col-12 mt-md-0 mt-3">
                    <h4>${ItemDetailFormBean.item.itemName }</h4>
                    
                    <h4 style="color: #f6615a;">${ItemDetailFormBean.item.unitPrice } ks</h4>
                    
                   
                    <p>
                        ${ItemDetailFormBean.item.description }
                    </p>
                    <hr>
                    
                    <div class="d-inline-block align-content-end">
                    	<html:form action="/itemDetailPath">
                    		<c:if test="${ItemDetailFormBean.item.stock == 0 || ItemDetailFormBean.item.stock <= ItemDetailFormBean.item.cartQty}">
                    			<html:submit property="btnMinus" disabled="true" styleClass="btn btn-red" value="-"></html:submit>
                        		<html:text property="frmItemQty" disabled="true" styleClass="border border-1 border-dark" value="0"/>
                        		<html:submit property="btnPlus" disabled="true" styleClass="btn btn-red" value="+"></html:submit>
                    		</c:if>
                    		<c:if test="${ItemDetailFormBean.item.stock != 0 && ItemDetailFormBean.item.stock > ItemDetailFormBean.item.cartQty}">
                    			<html:submit property="btnMinus" styleClass="btn btn-red" value="-"></html:submit>
                        		<html:text property="frmItemQty" disabled="true" styleId="itemDetailFormQty" styleClass="border border-1 border-dark" value="${ItemDetailFormBean.frmItemQty }"/>
                        		<html:submit property="btnPlus" styleClass="btn btn-red" value="+"></html:submit>
                    		</c:if>
                    		
                   		 </html:form>  
                   		 <p>Stock Left:
                   		  <c:if test="${ItemDetailFormBean.item.stock == 0 || ItemDetailFormBean.item.stock <= ItemDetailFormBean.item.cartQty}"> 0 item.</c:if>
                   		  <c:if test="${ItemDetailFormBean.item.stock != 0 && ItemDetailFormBean.item.stock > ItemDetailFormBean.item.cartQty}"> ${ItemDetailFormBean.item.stock - ItemDetailFormBean.item.cartQty} items.</c:if>
                   		 </p>
                    </div>
                    <html:form action="/addToCartPath">
                    	<html:hidden property="frmItemQty" styleId="CartFormQty" value="${ItemDetailFormBean.frmItemQty}"/>
                    	<html:hidden property="frmCartItemId" value="${ItemDetailFormBean.item.id}"/>
                    	<c:if test="${ItemDetailFormBean.item.stock == 0 || ItemDetailFormBean.item.stock <= ItemDetailFormBean.item.cartQty}">
                    		<html:submit property="btnAddToCart" disabled="true" styleClass="btn btn-secondary float-end btn-lg" value="Out of Stock"/>
                    	</c:if>
                    	<c:if test="${ItemDetailFormBean.item.stock != 0 && ItemDetailFormBean.item.stock > ItemDetailFormBean.item.cartQty}">
                    		<html:submit property="btnAddToCart" styleClass="btn btn-red float-end btn-lg" onclick="itemDetailToCartQtyCarry()" value="Add To Cart"/>
                    	</c:if>
                    </html:form>     
                </div>
            </div>
        </div> 
    </section>

   

    <script src="js/bootstrap.min.js"></script> 
    <script type="text/javascript">
        const change = src => {
            document.getElementById('main').src = src
        }
        
    	function itemDetailToCartQtyCarry(){
            const itemDetailFormQty = document.getElementById("itemDetailFormQty").value;
            console.log(itemDetailFormQty);
            // const height = document.getElementById("height").value;
            
            document.getElementById("CartFormQty").value = itemDetailFormQty;
        }
    </script>
    
</body>
</html>