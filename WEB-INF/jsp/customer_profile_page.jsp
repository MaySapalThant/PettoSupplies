<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css1/shared.css" type="text/css">
<link rel="stylesheet" href="css1/account_style.css" type="text/css">
<link rel="icon" href="images/paw-print-clip-art-heart.ico">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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

	<%@ include file="inc/nav.jsp"%>

	<section class="section-main">

	<div class="m-5">
		<div class="row">
			<div class="col-md-2 col-12">
				<div class="list-group mb-5">
					<a href="profileUpdatePathFirst.do"
						class="list-group-item list-group-item-action active">Profile
						Edit</a> <a href="changePasswordPathFirst.do"
						class="list-group-item list-group-item-action">Change Password</a>
					<a href="customerOrderPath.do"
						class="list-group-item list-group-item-action">Orders</a> <a
						data-bs-toggle="modal" data-bs-target="#exampleModal"
						class="list-group-item list-group-item-action">Logout</a>
					<!-- Modal -->
					<div class="modal fade" id="exampleModal" tabindex="-1"
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
				</div>
			</div>

			<div class="col-md-10 col-12">
				<html:form action="/profileUpdatePath">
					<div class="ms-5 me-5">

						<logic:notEmpty property="updateAlert" name="LoginFormBean">
							<div class="alert alert-success" role="alert">
								${UpdateFormBean.updateAlert}</div>
						</logic:notEmpty>
						<h2>Profile</h2>
						<hr>
						<html:errors property="frmUpdateName" />

						<div class="input-group mb-4 mt-4">
							<span class="input-group-text" id="basic-addon1">Name</span>
							<html:text property="frmUpdateName" styleClass="form-control"></html:text>
						</div>

						<div class="input-group mb-4">
							<span class="input-group-text" id="basic-addon2">Email</span>
							<html:text property="frmUpdateEmail" styleClass="form-control"
								disabled="true"></html:text>
						</div>

						<div class="input-group mb-4">
							<span class="input-group-text" id="basic-addon3">Phone</span>
							<html:text property="frmUpdatePhone" styleClass="form-control"></html:text>
						</div>
						<div class="input-group mb-5">
							<span class="input-group-text">Address</span>
							<html:textarea property="frmUpdateAddress"
								styleClass="form-control"></html:textarea>
						</div>
						<div class="w-100 mb-4">
							<html:submit property="btnUpdate"
								styleClass="btn btn-red text-uppercase">Update</html:submit>
						</div>
					</div>
				</html:form>
			</div>
		</div>
	</div>
	</section>

	<script src="js/bootstrap.min.js"></script>


</body>
</html>