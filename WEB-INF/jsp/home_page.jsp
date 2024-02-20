<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css1/shared.css" type="text/css">
<link rel="stylesheet" href="css1/home-style.css" type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="icon" href="images/paw-print-clip-art-heart.ico">
<style type="text/css">
.badge-cart {
	position: relative;
}

.badge-cart-items {
	position: absolute;
	width: 25px;
	height: 25px;
	top: 0;
	right: 0;
	background: red;
	border-radius: 50%;
	padding: 2px;
	padding-bottom: 4px;
	color: white;
	text-align: center;
}

.product-cards:hover{
	border: 2px solid red;
}

</style>
</head>
<body>
	<div class="position-fixed w-100 nav-div top-0">
		<nav
			class="navbar navbar-expand-lg navbar-light border-bottom border-1 border-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="images/paw-print-clip-art-heart.png" alt="" width="50"
				class="rounded-circle"> </a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link text-uppercase fw-bold text-dark"
						aria-current="page" style="font-family: 'Copperplate Gothic Light';" href="homePath.do">Pet Needs</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Shop By Pet </a>
						<ul class="dropdown-menu border border-danger profile-dropdown" aria-labelledby="navbarDropdown">
							<logic:notEmpty property="petsList" name="HomeFormBean">
								<logic:iterate id="pet" property="petsList" name="HomeFormBean">
									<li><a class="dropdown-item"
										href="petPagePath.do?frmPetId=${pet.id}">${pet.petName }</a>
									</li>
								</logic:iterate>
							</logic:notEmpty>
						</ul></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Shop By Category </a>
						<ul class="dropdown-menu border border-danger profile-dropdown" aria-labelledby="navbarDropdown">
							<logic:notEmpty property="categoriesList" name="HomeFormBean">
								<logic:iterate id="category" property="categoriesList"
									name="HomeFormBean">
									<li><a class="dropdown-item"
										href="categoryPagePath.do?frmCategoryId=${category.id}">${category.categoryName
											}</a>
									</li>
								</logic:iterate>
							</logic:notEmpty>
						</ul></li>
				</ul>

				<html:form action="/searchItemPath" styleClass="d-flex">
					<%-- <html:text property="frmSearchKey" styleClass="form-control me-2" ></html:text> --%>
					<html:hidden property="frmSearchKey" styleId="idSearchKey" />
					<input class="form-control" list="datalistOptions" id="idItemName">
					<datalist id="datalistOptions"> <logic:iterate id="item"
						property="itemsList" name="HomeFormBean">
						<option value="${item.itemName }">
					</logic:iterate> </datalist>
					<html:submit property="btnSearch"
						styleClass="btn btn-outline-danger ms-2" styleId="search"
						onclick="dataListSearch()">Search</html:submit>
				</html:form>
				<logic:notPresent property="loginCustomer" name="LoginFormBean">
					<a href="loginPathFirst.do" class="text-decoration-none text-danger fw-bold  ms-2">Login</a>
				</logic:notPresent>
				<logic:present property="loginCustomer" name="LoginFormBean">
					<div class="dropdown ms-2">
						<a class="dropdown-toggle text-decoration-none text-danger fw-bold"
							id="dropdownMenuButton1" data-bs-toggle="dropdown"
							aria-expanded="false">${LoginFormBean.loginCustomer.customerName
						}</a>
						<ul class="dropdown-menu dropdown-menu-start  border border-danger profile-dropdown"
							aria-labelledby="dropdownMenuButton1">
							<li><a class="dropdown-item" href="profileUpdatePathFirst.do">Edit Profile</a></li>
							<li><a class="dropdown-item" href="changePasswordPathFirst.do">Change Password</a></li>
							<li><a class="dropdown-item" href="customerOrderPath.do">Orders History</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a data-bs-toggle="modal" data-bs-target="#exampleModalHome"
								class="dropdown-item text-decoration-none">Logout</a></li>
							
						</ul>
					</div>
					
				</logic:present>

				<div class="badge-cart">
					<a href="addToCartPath.do"
						class="nav-link text-decoration-none position-relative"><i
						class="fa fa-shopping-cart fa-2x m-0"></i> <logic:present
							property="frmTotalQty" name="CartFormBean">
							<span
								class="bg-danger badge position-absolute start-10 top-10 translate-middle rounded-circle ms-1"
								id="cart-qty">${CartFormBean.frmTotalQty }</span>
						</logic:present> <logic:notPresent property="frmTotalQty" name="CartFormBean">
							<span class="badge-cart-items">0</span>
						</logic:notPresent> </a>
				</div>
			</div>
		</div>
		</nav>
	</div>

	<section class="section-home border-bottom border-1 border-dark">
	<div class="container">
		<div class="row home">
			<div class="home-text-box col-md-5 col-12">
				<h1 class="mt-3" style="font-family: 'Copperplate Gothic Light';">Pet accessories to your
					lovely pets.</h1>
				<p class="home-description" style="font-family: 'Comic Sans';">Pet Needs is a online pet supplies
					shop. Providing pet foods, pet care products, accessories for
					different pets.</p>
				<a href="#shopbypet" type="button" class="btn btn-red btn-big">Learn
					more &darr;</a>
			</div>
			<div class="home-img-box col-md-7 col-12">
				<img src="images/Doggie.png" class="home-img"
					alt="A dog and a girl.">
			</div>
		</div>
	</div>
	</section>

	<section class="border-bottom border-1 border-dark" id="shopbypet">
	<div class="all-pet-container">
		<h2 class="heading-secondary text-center" style="font-family: 'Copperplate Gothic Light';">Shop by Pet</h2>
		<div class="container-fluid py-2 overflow-scroll overflow-hidden">

			<div class="d-flex flex-row flex-nowrap justify-content-between">
				<logic:notEmpty property="petsList" name="HomeFormBean">
					<logic:iterate id="pet" property="petsList" name="HomeFormBean">
						<div class="pet-card col-md-3 col-6 text-center">
							<div class="pet-img-container">
								<img src="${pet.petImage}" class="pet-img" alt="${pet.petName}">
							</div>
							<a href="petPagePath.do?frmPetId=${pet.id}" type="button"
								class="btn btn-red">${pet.petName}<span class="link"></span>
							</a>
						</div>
					</logic:iterate>
				</logic:notEmpty>


			</div>
		</div>
	</div>

	</section>

	<section class="">
	<h2 class="heading-secondary text-center" style="font-family: 'Copperplate Gothic Light';">Latest Products</h2>
	<div class="container-fluid py-2 overflow-scroll mt-5">

		<div class="d-flex flex-row flex-nowrap justify-content-between">
			<logic:notEmpty property="latestItemList" name="HomeFormBean">
				<logic:iterate id="item" property="latestItemList"
					name="HomeFormBean">
					<div class="card product-cards shadow col-md-2 col-6 mb-3 mx-3"
						id="product-card${item.id}" style="background: #faf0ea;">
						<img src="${item.itemImage }" class="card-img-top"
							alt="${item.itemName }">
						<div class="card-body d-flex flex-column">
							<h6 class="card-title">${item.itemName }</h6>
							<p class="card-text">${item.unitPrice } ks</p>


							<html:form action="/addToCartPath"
								styleClass="mt-auto w-100 align-self-baseline">

								<a href="itemDetailPath.do?frmItemId=${item.id}" style="">View
									Detail</a>

								<html:hidden property="frmItemQty" value="1" />
								<html:hidden property="frmCartItemId" value="${item.id}" />
								<%-- <logic:notEmpty property="cartItemList" name="CartFormBean">
											<logic:iterate id="itemInCart" property="cartItemList" name="CartFormBean">
												<c:if test="${item.id == itemInCart.cartItem.id }">
													<html:hidden property="tempQty" value="${itemInCart.qty }"/>
												</c:if>
											</logic:iterate> --%>

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
								<%-- </logic:notEmpty> --%>

							</html:form>



						</div>
					</div>
				</logic:iterate>
			</logic:notEmpty>


			<!-- <div class="product-card col-lg-2 col-6 mb-3">
                    <img src="images/Doggie500x375.png" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title">Some quick example text to build on the card title.</h5>
                      <p class="card-text">40000 ks</p>
                      <a href="#" class="btn text-white" style="background-color: #f6615a;">Detail<span class="link"></span></a>
                    </div>
                </div>

                <div class="product-card col-lg-2 col-6 mb-3">
                    <img src="images/Doggie500x375.png" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title">Make up the bulk of the card's content.</h5>
                      <p class="card-text">30200 ks</p>
                      <a href="#" class="btn text-white" style="background-color: #f6615a;">Detail<span class="link"></span></a>
                    </div>
                </div> -->
		</div>
	</div>
	</section>
	<!-- Modal -->
					<div class="modal fade" id="exampleModalHome" tabindex="-1"
						aria-labelledby="exampleModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title" id="exampleModalLabel">Are you
										sure to Logout?</h5>
									<button type="button" class="btn-close" data-bs-dismiss="modal"
										aria-label="Close"></button>
								</div>

								<div class="modal-footer">
									
										<button type="button" class="btn btn-outline-danger"
											data-bs-dismiss="modal">Cancel</button>
										<a type="button" style="background-color: #dc3545;" href="logoutPath.do" class="btn btn-danger">Logout</a>
										
									
								</div>
							</div>
						</div>
					</div>

	<!--     <section class="border-bottom border-1 border-dark">
        
            <h2 class="heading-secondary text-center">Shop by Category</h2>
        <div class="container">
            
            <div class="row justify-content-between">
                  
               <logic:notEmpty property="petsList" name="HomeFormBean">
					<logic:iterate id="pet" property="petsList" name="HomeFormBean">
						<div class="category-card col-sm-4 col-6">
                    		<h5 class="category-card-title">${pet.petName }</h5>
                    		<logic:notEmpty property="categoriesList" name="HomeFormBean">
								<logic:iterate id="category" property="categoriesList" name="HomeFormBean">
									<a href="#" class="category-card-text d-block">${category.categoryName }</a>
								</logic:iterate>
							</logic:notEmpty>               
                		</div>
					</logic:iterate>
				</logic:notEmpty>   
               
            </div>
        </div>
       
        
    </section> -->

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
	
	function dataListSearch(){
        const itemName = document.getElementById("idItemName").value;
        console.log(itemName);
        // const height = document.getElementById("height").value;
        
        document.getElementById("idSearchKey").value = itemName;
    }
	</script>
</body>
</html>