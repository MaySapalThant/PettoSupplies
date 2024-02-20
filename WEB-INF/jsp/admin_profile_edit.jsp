<%@ include file="inc/common.jsp"%>
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
    <jsp:include page="inc/admin_nav.jsp">
		<jsp:param name="dark" value="profile"/>
	</jsp:include>
    
    <section class="">
         
       <div class="m-5">
           <div class="row">
               <div class="col-md-2 col-12">
                <div class="list-group mb-5" style="background-color: #e3edfd;">
                    <a href="adminProfileUpdatePathFirst.do" class="list-group-item list-group-item-action active">Profile Edit</a>
                    <a href="adminChangePasswordPathFirst.do" class="list-group-item list-group-item-action">Change Password</a>
                    <a data-bs-toggle="modal" data-bs-target="#exampleModal" class="list-group-item list-group-item-action">Log Out</a>
                </div>  
               </div>
               
               <div class="col-md-10 col-12">
               	<html:form action="/adminProfileUpdatePath">
               		<div class="ms-5 me-5">
                        <h2>Admin Profile</h2>
                        <hr>
                        <html:errors property="frmUpdateAdminName" />
                        
                        <div class="input-group mb-4 mt-4">
                            <span class="input-group-text" id="basic-addon1">Name</span>
                            <html:text property="frmUpdateAdminName" styleClass="form-control"></html:text>
                        </div>
                       
                        <div class="input-group mb-4">    
                            <span class="input-group-text" id="basic-addon2">Email</span>
                            <html:text property="frmUpdateAdminEmail" styleClass="form-control" disabled="true"></html:text>
                        </div>
                        <div class="w-100 mb-4">
                            <html:submit property="btnUpdate" styleClass="btn btn-primary text-white text-uppercase">Update</html:submit>
                        </div>
                    </div>
               	</html:form>
               </div>
           </div>
       </div>
    </section>
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
										<a type="button" style="background-color: #dc3545;" href="adminLogoutPath.do" class="btn btn-danger">Logout</a>
										
									
								</div>
							</div>
						</div>
					</div>

    <script src="js/bootstrap.min.js"></script> 

    
</body>
</html>