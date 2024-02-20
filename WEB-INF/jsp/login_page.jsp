<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="css1/shared.css" type="text/css">
	<link rel="icon" href="images/paw-print-clip-art-heart.ico">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <%@ include file="inc/nav.jsp" %>
    
    
    <section class="section-main">
        <div class="row">
        	<div class="col-lg-3"></div>
        	<div class="col-lg-6 ms-md-0 ms-3 me-md-0 me-3">
        	<div class="container-md container-main ps-5 pe-5">
            <h1>Customer Login</h1>
            <h5>Registered Customers</h5>
            <hr>     
           
           <div class="w-100 ps-5 pe-5">
          	<html:form action="/loginPath">
          	<html:errors property="loginerror"/> 
          	<html:errors property="frmLoginEmail"/>
          	<html:errors property="frmLoginPassword"/>
          		<p>If you have an account, sign in with your email address.</p>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="basic-addon1">Email</span>
                    <html:text property="frmLoginEmail" styleClass="form-control"></html:text>
                   
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="basic-addon2">Password</span>
                    <html:password property="frmLoginPassword" styleClass="form-control"></html:password>
                </div>
                <div class="w-100 ps-5 pe-5">
                    <html:submit property="btnLogin" styleClass="btn btn-lg btn-red w-100">Sign In</html:submit>
                </div> 
          	</html:form>
            </div>
           
           
            <br>
            <hr>
            <div class="d-flex w-100  ps-5 pe-5">
                <p>If you are new customer, create new account.</p>
            <a href="registerPathFirst.do" type="button" class="btn btn-red ms-5">Create Account</a> 
            </div>
            
            
            
        </div>
        	</div>
        	<div class="col-lg-3"></div>
        </div>
         
    </section>

    <script src="js/bootstrap.min.js"></script> 
    
</body>
</html>