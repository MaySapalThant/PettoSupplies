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
                  <h2 class="d-inline-flex">All Categorys</h2>
              </div>
              <div class="col-5">
                  <div class="d-inline-flex float-end me-3">
                      <a href="adminCategoryAddPathFirst.do" type="button"
							class="btn btn-info mb-3 text-white"><i
							class="fa fa-plus me-1" style="color: #fcfcfc;"></i>Add New Category</a>
                  </div>
              </div>
          </div>
          
          <logic:notEmpty property="deleteError" name="AdminCategoryFormBean">
          		<div class="alert alert-warning" role="alert">
  					${AdminCategoryFormBean.deleteError} 
				</div>
          </logic:notEmpty>
           
          <div class="me-md-5"> 
            <table class="item-table table table-striped display pt-3" id="table" >
              <thead>
              	<tr class="thead">
                  
                  <th>Category Name</th>
                  <th>Pet</th>
                  <th></th>
				  <th></th>
                </tr>
              </thead>
                
			<tbody>
				<logic:notEmpty property="categoriesList" name="AdminCategoryFormBean">
						<logic:iterate id="category" property="categoriesList"
							name="AdminCategoryFormBean">
							<tr>
							
                    			
                    			<td>${category.categoryName}</td>
                    			<td>${category.pet.petName}</td>
                    			<td>
                    				<a href="adminCategoryEditPathFirst.do?frmCategoryId=${category.id}"><i
											class="fa fa-pencil me-1"></i> </a>
								</td>
								<td>
										<a data-bs-toggle="modal" data-bs-target="#exampleModal${category.id}">
											<i class="fa fa-trash me-1"></i></a>
								</td>
									<!-- Modal -->
									<div class="modal fade" id="exampleModal${category.id}" tabindex="10"
										aria-labelledby="exampleModalLabel" aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<h5 class="modal-title" id="exampleModalLabel">Are you sure to detete?</h5>
													<button type="button" class="btn-close"
														data-bs-dismiss="modal" aria-label="Close"></button>
												</div>
												
												<div class="modal-footer">
												   <html:form action="/adminAllCategoryPath">
													<button type="button" class="btn btn-outline-danger"
														data-bs-dismiss="modal">Cancel</button>
													<html:hidden property="frmCategoryId" value="${category.id}" />
													
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
    <script src="js/AutoComplement.js"></script>
    <script>
        $(document).ready(
                function() {
                    var dataSrc = [];

                    var table = $('#table').DataTable({
                        'initComplete' : function() {
                            var api = this.api();

                            // Populate a dataset for autocomplete functionality
                            // using data from first, second and third columns
                            api.cells('tr', [ 0 ]).every(function() {
                                // Get cell data as plain text
                                var data = $('<div>').html(this.data()).text();
                                if (dataSrc.indexOf(data) === -1) {
                                    dataSrc.push(data);
                                }
                            });

                            // Sort dataset alphabetically
                            dataSrc.sort();
                            // Initialize Typeahead plug-in
                            $('.dataTables_filter input[type="search"]',
                                    api.table().container()).typeahead({
                                source : dataSrc,
                                afterSelect : function(value) {
                                    api.search(value).draw();
                                }
                            });

                            $('.dataTables_filter input[type="search"]').on('keyup', function() {
                                 console.log('event')
                                 $('#table').DataTable().column(0).search(this.value).draw();
                                 });

                        }
                    });

                });

        /*         $(document).ready(function() {
         $("#ctable").DataTable();

         $('.dataTables_filter input').off().on('keyup', function() {
         console.log('event')
         $('#ctable').DataTable().column(0).search(this.value).draw();
         });
         });  */
</script>	
</body>
</html>