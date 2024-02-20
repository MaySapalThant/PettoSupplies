<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Needs - Admin</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css1/shared.css" type="text/css">
<link rel="stylesheet" href="css1/admin_style.css" type="text/css">
<link rel="stylesheet" href="css/jquery.dataTables.min.css" type="text/css">
<link rel="icon" href="images/paw-print-clip-art-heart.ico">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<jsp:include page="inc/admin_nav.jsp">
		<jsp:param name="dark" value="product"/>
	</jsp:include>
	<div class="row">
		<div class="col-md-3 col-12">
			<div class="list-group m-4 style="background-color: #e3edfd;">
				<a href="adminAllItemPath.do"
					class="list-group-item list-group-item-action"><i
					class="fa fa-shopping-basket me-2" style="color: #fa645e;"></i>Product
					Management</a> <a href="adminAllCategoryPath.do"
					class="list-group-item list-group-item-action"><i
					class="fa fa-cubes me-1" style="color: #fa645e;"></i>Category
					Management</a> <a href="adminAllPetPath.do"
					class="list-group-item list-group-item-action active"><i
					class="fa fa-paw me-2" style="color: #fa645e;"></i>Pet Management</a> <a
					href="adminAllCustomerPath.do"
					class="list-group-item list-group-item-action"><i
					class="fa fa-users me-1" style="color: #fa645e;"></i>User
					Management</a> <a href="adminAllOrderPath.do"
					class="list-group-item list-group-item-action"><i
					class="fa fa-truck me-1" style="color: #fa645e;"></i>Order
					Management</a>
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
					<h2 class="d-inline-flex">All Pets</h2>
				</div>
				<div class="col-5">
					<div class="d-inline-flex float-end me-3">
						<a href="adminPetAddPathFirst.do" type="button"
							class="btn btn-info mb-3 text-white"><i
							class="fa fa-plus me-1" style="color: #fcfcfc;"></i>Add New Pet</a>
					</div>
				</div>
			</div>

			<logic:notEmpty property="deleteError" name="AdminPetFormBean">
          		<div class="alert alert-warning" role="alert">
  					${AdminPetFormBean.deleteError} 
				</div>
          </logic:notEmpty>

			<div class="me-md-5"> 
            <table class="item-table table table-striped display pt-3" id="table" >
              <thead>
					<tr class="thead">
						<th></th>
						
						<th class="text-center">Pet Name</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<logic:notEmpty property="petsList" name="AdminPetFormBean">
						<logic:iterate id="pet" property="petsList"
							name="AdminPetFormBean">
							<tr>
								
									<td><html:img src="${pet.petImage}" height="100"
											width="100" />
									</td>
									
									<td class="text-center">${pet.petName}</td>

									<td><a href="adminPetEditPathFirst.do?frmPetId=${pet.id}"><i
											class="fa fa-pencil me-1"></i> </a>
									</td>
									<td><html:hidden property="frmPetId" value="${pet.id}" />
										<a data-bs-toggle="modal" data-bs-target="#exampleModal${pet.id}">
											<i class="fa fa-trash me-1"></i></a>
									</td>
									<!-- Modal -->
									<div class="modal fade" id="exampleModal${pet.id}" tabindex="1"
										aria-labelledby="exampleModalLabel" aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<h5 class="modal-title" id="exampleModalLabel">Are you sure to detete?</h5>
													<button type="button" class="btn-close"
														data-bs-dismiss="modal" aria-label="Close"></button>
												</div>
												
												<div class="modal-footer">
												   <html:form action="/adminAllPetPath">
													<button type="button" class="btn btn-outline-danger"
														data-bs-dismiss="modal">Cancel</button>
													<html:hidden property="frmPetId" value="${pet.id}" />
													<html:submit property="btnDelete" value="Delete"
														styleClass="btn btn-red">
													</html:submit>
												   </html:form>
												</div>
											</div>
										</div>
									</div>
								
							</tr>
						</logic:iterate>
					</logic:notEmpty>
					</tbody>

				</table>

			</div>
		</div>
	</div>

	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.js"></script>
    <script src="js/jquery.dataTables.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#table").DataTable();
        });
    </script>
</body>
</html>