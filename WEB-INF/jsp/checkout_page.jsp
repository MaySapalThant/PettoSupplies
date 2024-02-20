<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css1/shared.css" type="text/css">
    <link rel="stylesheet" href="css1/checkout_form_style.css" type="text/css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="icon" href="images/paw-print-clip-art-heart.ico">
	<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.min.css'></link> 
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
                      <logic:notEmpty property="petsList" name="HomeFormBean">
							<logic:iterate id="pet" property="petsList" name="HomeFormBean">
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
                     <logic:notEmpty property="categoriesList" name="HomeFormBean">
							<logic:iterate id="category" property="categoriesList" name="HomeFormBean">
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
         
        <div class="container">
            <div class="row">
                <div class="col-7">
                    <h2 class="d-inline-flex">Checkout</h2>
                </div>
                <div class="col-5">
                    <div class="d-inline-flex float-end">
                        <a href="homePath.do" type="button" class="btn btn-red mb-2">Keep Shopping</a>
                    </div>
                </div>
            </div>
            

            <html:form action="/checkoutPath">
            <div class="row">
                <div class="col-md-9 col-12">
                    
                    <div class="title-bar mb-3 w-100 rounded-1 p-2 text-light" >
                        Shipping Address
                    </div>

                   
					<html:errors property="frmRecName" />
					<html:errors property="frmRecPhone" />
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Reciever Name</span>
                        <html:text property="frmRecName" styleClass="form-control"></html:text>
                        <span class="input-group-text">Phone</span>
                        <html:text property="frmRecPhone" styleClass="form-control"></html:text>
                    </div>

					<html:errors property="frmRecAddress" />
                    <div class="input-group mb-3">
                        <span class="input-group-text">Address</span>
                        <html:textarea property="frmRecAddress" styleClass="form-control"></html:textarea>
                    </div>
                    
                    <div class="input-group">
                        <span class="input-group-text">Remark (Optional)</span>
                        <html:textarea property="frmRemark" styleClass="form-control"></html:textarea>
                    </div>

                    <div class="mb-3 mt-4 w-100 title-bar rounded-1 p-2 text-light" >
                        Payment Method
                    </div>
					<html:errors property="paymentMethod" />

                    <div class="form-check">
                    	<html:radio property="paymentMethod" value="KBZ Bank Account" styleId="kbz" styleClass="form-check-input"/>
                        <label class="form-check-label" for="kbz">
                          KBZ Bank Account
                        </label>
                      </div>
                    <div class="form-check">
                    	<html:radio property="paymentMethod" value="Aya Bank Account" styleId="kbz" styleClass="form-check-input"/>
                        <label class="form-check-label" for="aya">
                          Aya Bank Account
                        </label>
                    </div>
                    <div class="form-check">
                    	<html:radio property="paymentMethod" value="CB Bank Account" styleId="cb" styleClass="form-check-input"/>
                        <label class="form-check-label" for="cb">
                          CB Bank Account
                        </label>
                    </div>
                    <div class="form-check">
                    	<html:radio property="paymentMethod" value="K Pay" styleId="kpay" styleClass="form-check-input"/>
                        <label class="form-check-label" for="kpay">
                          K Pay
                        </label>
                    </div>
                    <div class="form-check">
                    	<html:radio property="paymentMethod" value="CB Pay" styleId="cbpay" styleClass="form-check-input"/>
                        <label class="form-check-label" for="cbpay">
                          CB Pay
                        </label>
                    </div>
                    <p class="fs-6">(We'll call to your phone for futher payment information.)</p>
                </div>

                <div class="col-md-3 col-9">
                    <div class="mb-3 w-100 title-bar rounded-1 p-2 text-light" >
                        Order Summary
                    </div>
                    <div class="rounded-1 border-1 border-secondary border">
                        <table class="table">
                        
                            <tr>
                                <td><span class="m-2">Number of Items</span></td> <td  class="text-center">${OrderFormBean.totalQty }</td>
                            </tr>
                            <tr>
                                <th><span class="m-2">Total Price</span></th> <td  class="text-center">${OrderFormBean.totalPrice } ks</td>
                            </tr>
                        </table>
                    </div>
                    <html:submit onclick="checkoutOK()" property="btnPlaceOrder" styleClass="btn btn-red text-light p-2 rounded-1 mt-3 mb-3 w-100 btn-lg" value="Place Order"/>
                
                </div>
            </div>
            </html:form>
            
        </div> 
    </section>

    <script src="js/bootstrap.min.js"></script> 
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js"></script>
    <script>
    	let checkoutOK = function(){
        	swal("Order Complete!");    
    	}
    </script>
</body>
</html>