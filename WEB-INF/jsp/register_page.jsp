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
    
         <div class="col-lg-2"></div>
        <div class="col-lg-8 ms-md-0 ms-3 me-md-0 me-3">
        <div class="container-md container-main ps-md-5 pe-md-5 ps-0 pe-0 mb-3">
           <h2>Create New Customer Account</h2>
            <hr>     
           <html:form action="/registerPath">
           	<div class="w-100 ps-5 pe-5 pt-3">
           		<html:errors property="frmRegName" />
                <div class="input-group mb-4">
                    <span class="input-group-text" id="basic-addon1">Name</span>
                    <html:text property="frmRegName" styleClass="form-control"></html:text>
                    
                </div>
                <html:errors property="frmRegEmail" /> 
                <html:errors property="emailError" />
                <div class="input-group mb-4">   
                    <span class="input-group-text" id="basic-addon2">Email</span>
                    <html:text property="frmRegEmail" styleClass="form-control"></html:text>
                    
                    <span class="input-group-text" id="basic-addon5">Phone</span>
                    <html:text property="frmRegPhone" styleClass="form-control"></html:text>
                </div>
                
                <html:errors property="frmRegPassword" />
                <html:errors property="matchPassword" />
                <div class="input-group mb-4">
                    <span class="input-group-text" id="basic-addon3">Password</span>
                    <html:password property="frmRegPassword" styleClass="form-control"></html:password>
                
                    <span class="input-group-text" id="basic-addon4">Confirm Password</span>
                    <html:password property="frmRegConfirmPassword" styleClass="form-control"></html:password>
                    
                </div>
                <html:errors property="frmRegConfirmPassword" />
                <div class="input-group mb-5">
                    <span class="input-group-text">Address</span>
                    <html:textarea property="frmRegAddress" styleClass="form-control"></html:textarea>
                    <html:errors property="frmRegAddress" />
                </div>
                <div class="w-100 mb-2 d-flex justify-content-between">
                	<html:submit property="btnRegister" styleClass="btn btn-red btn-lg" value="Create Account"></html:submit>
                	<html:cancel value="Cancel" styleClass="btn btn-outline-danger btn-lg" />
                </div> 
            </div>
           </html:form>
           
                        
        </div></div> 
        <div class="col-lg-2"></div>
        </div>
    </section>

    <script src="js/bootstrap.min.js"></script> 
    
</body>
</html>