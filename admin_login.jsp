<%@ include file="WEB-INF/jsp/inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs - Admin</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css1/shared.css" type="text/css">
	<link rel="stylesheet" href="css1/admin_style.css" type="text/css">
	 <link rel="icon" href="images/paw-print-clip-art-heart.ico">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light ">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img src="images/Doggie.png"
			alt="" width="50"> </a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item">
                	<a class="nav-link text-uppercase fw-bold text-dark fs-5" style="font-family: 'Copperplate Gothic Light';">Pet Needs</a>
             	</li>
			</ul>

		</div>
	</div>
	</nav>
	
    <section class="section-main" style="margin-top: 50px;">
       <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6 ms-md-0 ms-3 me-md-0 me-3">
          <div class="container-md container-main ps-5 pe-5">
           <h1>Admin Login</h1>
            <h5>Registered Admins</h5>
            <hr>     
           
           <div class="w-100 ps-5 pe-5">
          	<html:form action="/adminLoginPath">
          	<html:errors property="loginerror"/> 
          	<html:errors property="frmAdminEmail"/>
          	<html:errors property="frmAdminPassword"/>
          		<p>If you have an account, sign in with your email address.</p>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="basic-addon1">Email</span>
                    <html:text property="frmAdminEmail" styleClass="form-control"></html:text>
                   
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="basic-addon2">Password</span>
                    <html:password property="frmAdminPassword" styleClass="form-control"></html:password>
                </div>
                <div class="w-100 ps-5 pe-5">
                    <html:submit property="btnLogin" styleClass="btn btn-lg btn-primary text-white w-100">Sign In</html:submit>
                </div> 
          	</html:form>
            </div>
           
           
            <br>
            <hr>     
        </div> 
        </div>
        	<div class="col-md-3"></div>
        </div>
    </section>

    <script src="js/bootstrap.min.js"></script> 
    
</body>
</html>