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
		<jsp:param name="dark" value="product"/>
	</jsp:include>
    <div class="row">
        <div class="col-md-3 col-12">
            <div class="list-group m-4 style="background-color: #e3edfd;">
                <a href="adminAllItemPath.do" class="list-group-item list-group-item-action"><i class="fa fa-shopping-basket me-1" style="color: #fa645e;"></i>Product Management</a>
                <a href="adminAllCategoryPath.do" class="list-group-item list-group-item-action active" aria-current="true"><i class="fa fa-cubes me-1" style="color: #fa645e;"></i>Category Management</a>
                <a href="adminAllPetPath.do" class="list-group-item list-group-item-action"><i class="fa fa-paw me-2" style="color: #fa645e;"></i>Pet Management</a>
                <a href="adminAllCustomerPath.do" class="list-group-item list-group-item-action"><i class="fa fa-users me-1" style="color: #fa645e;"></i>User Management</a>
                <a href="adminAllOrderPath.do" class="list-group-item list-group-item-action"><i class="fa fa-truck me-1" style="color: #fa645e;"></i>Order Management</a>
            </div>
        </div>
        <div class="col-md-9 col-12 m-0 pt-3">
          
          
            <!-- <div class="position-relative">
              <div class="position-absolute end-0 top-0">
                <form class="input-group">
                  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                  <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
              </div>
            </div> -->
          <div class="row ms-md-0 ms-3">
              <div class="col-7">
                  <h2 class="d-inline-flex">Add New Category</h2>
              </div>
              <div class="col-5">
                  <div class="d-inline-flex float-end me-3">
                      <a href="adminAllCategoryPath.do" type="button" class="btn btn-info mb-3 text-white">All Categories</a>
                  </div>
              </div>
          </div>
          
          <logic:notEmpty property="alert" name="AdminCategoryFormBean">
          		<div class="alert alert-success" role="alert">
  					${AdminCategoryFormBean.frmCategoryName}  ${AdminCategoryFormBean.alert} 
				</div>
          </logic:notEmpty>
          
          
          <html:form action="/adminCategoryAddPath" method="post" enctype="multipart/form-data">
          <div class="add-new-container container">
        	<html:errors property="frmCategoryName"/>
            <div class="form-floating mb-3">
                <html:text property="frmCategoryName" styleClass="form-control form-control-sm" styleId="categoryName"></html:text>
                <label for="categoryName">Category Name</label>
            </div>
               
            <label class="mb-1">Choose Pet</label>   
			<html:select property="frmPetId" styleClass="form-select">
				
				<html:optionsCollection property="frmPetsList" value="id"
						label="petName" />
			</html:select> 
			
            
            <html:submit property="btnAdd" styleClass="btn btn-primary text-white text-uppercase mt-3">Add New Category</html:submit>
          </div>
          </html:form>
           
           
        </div>
    </div>
    
    <script src="js/bootstrap.min.js"></script>
</body>
</html>