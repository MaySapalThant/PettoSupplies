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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<jsp:include page="inc/admin_nav.jsp">
		<jsp:param name="dark" value="dashboard"/>
	</jsp:include>
	
		<div class="row">
			<div class="col-md-3 col-12">
			<div class="list-group m-4" style="background-color: #e3edfd;">
				<a href="adminAllItemPath.do"
					class="list-group-item list-group-item-action" aria-current="true"><i
					class="fa fa-shopping-basket me-2" style="color: #fa645e;"></i>Product
					Management</a> <a href="adminAllCategoryPath.do"
					class="list-group-item list-group-item-action"><i
					class="fa fa-cubes me-1" style="color: #fa645e;"></i>Category
					Management</a> <a href="adminAllPetPath.do"
					class="list-group-item list-group-item-action"><i
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
			


				<!-- <div class="position-relative">
              <div class="position-absolute end-0 top-0">
                <form class="input-group">
                  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                  <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
              </div>
            </div> -->

			<div class="col-md-9 col-12 pt-3">
				<h2 class="d-inline-flex ms-md-0 ms-3">Admin Dashboard</h2>
				<hr>
				
				<div class="row me-2 ms-2 d-flex align-items-center">
					<div class="col-xl-3 col-lg-6 col-sm-6 col-12 mb-4">
						<div class="card text-center shadow fw-bold" style="height: 175px;">
							<div class="row">
								<div class="col-4 mt-2">
									<i class="fa fa-shopping-basket ms-4 mt-4 fa-3x text-success"></i>
								</div>
								<div class="col-8">
									<h5 class="mt-3 text-success fw-bold">Total Items</h5>
									<div class="card-body">
										<h1 class="card-title fw-bold text-success">${AdminLoginFormBean.frmTotalProduct }</h1>
										
									</div>
								</div>
							</div>
							<a href="adminAllItemPath.do" class="text-decoration-none">
							<div class="card-footer text-muted">View Detail >></div></a>
						</div>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-sm-6 col-12 mb-4">
						<div class="card text-center shadow fw-bold" style="height: 175px;">
							<div class="row">
								<div class="col-4 mt-2">
									<i class="fa fa-truck ms-4 mt-4 fa-3x text-primary"></i>
								</div>
								<div class="col-8">
									<h5 class="mt-3 fw-bold text-primary">Total Orders</h5>
									<div class="card-body">
										<h1 class="card-title fw-bold text-primary">${AdminLoginFormBean.frmTotalOrder }</h1>
										
									</div>
								</div>
							</div>
							<a href="adminAllOrderPath.do" class="text-decoration-none">
								<div class="card-footer text-muted">View Detail >></div>
							</a>
							
						</div>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-sm-6 col-12 mb-4">
						<div class="card text-center shadow fw-bold pt-3" style="height: 175px;">
							<div class="row">
								<div class="col-3 mt-2">
									<i class="fa fa-usd ms-4 mt-4 fa-3x text-warning"></i>
								</div>
								<div class="col-9">
									<h5 class="mt-3 fw-bold text-warning">Total Sales</h5>
									<div class="card-body">
										<h2 class="card-title fw-bold text-warning">${AdminLoginFormBean.frmTotalSale }</h2>
										
									</div>
								</div>
							</div>
							
						</div>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-sm-6 col-12 mb-4">
						<div class="card text-center fw-bold shadow" style="height: 175px;">
							<div class="row">
								<div class="col-3 mt-3">
									<i class="fa fa-users ms-4 mt-4 fa-2x text-danger"></i>
								</div>
								<div class="col-9">
									<h5 class="mt-3 fw-bold text-danger">Registered Users</h5>
									<div class="card-body">
										<h1 class="card-title fw-bold text-danger">${AdminLoginFormBean.frmTotalUser }</h1>
										
									</div>
								</div>
							</div>
							<a href="adminAllCustomerPath.do" class="text-decoration-none">
								<div class="card-footer text-muted">View Detail >></div>
							</a>
						</div>
					</div>
				</div>
				
				<div class="item-table-container shadow px-4 py-2 rounded w-100" style="background-color: #f3f8ff;">
				<h2>Recent Orders</h2>
                <table class="table table-striped">
                	<thead style="background-color: #e3edfd;">
                		<tr class="thead">
                        	<th>OrderCode</th>
                        	<th>Customer</th>
                        	<th>Qty</th>
                        	<th>Price</th>
                        	<th>Payment</th>
                        	<th>OrderDate</th>
                        	<th></th>
                        	<th>Detail</th>
                    	</tr>
                	</thead>
					<tbody>
                    <logic:notEmpty property="orderProcessingList" name="AdminLoginFormBean">
						<logic:iterate id="order" property="orderProcessingList" name="AdminLoginFormBean">
							<tr>
                              <td>#${order.id }</td>
                              <td>${order.receiverName }</td>
                              <td>${order.totalQty }</td>
                              <td>${order.totalPrice } ks</td>
                              <td>${order.paymentType }</td>
                              <td>${order.orderDate }</td>
                              <td><a href="adminOrderConfirmPath.do?frmDetailOrderId=${order.id }" class="btn btn-sm btn-primary">Confirm</a></td>
                              <td><a href="adminOrderDetailPath.do?frmDetailOrderId=${order.id }" class="btn btn-sm btn-outline-primary">View Detail</a></td>
                            </tr>
						</logic:iterate>
					</logic:notEmpty>
					</tbody>  
                </table>
            </div>
            
			<%-- 	<h3>Total Sale is "${AdminLoginFormBean.frmTotalSale }"</h3>
				<h3>Total Order is "${AdminLoginFormBean.frmTotalOrder }"</h3>
				<h3>Total Pending order is
					"${AdminLoginFormBean.frmTotalPendingOrder }"</h3>
				<h3>Total Confirm order is
					"${AdminLoginFormBean.frmTotalConfirmOrder }"</h3>
				<h3>Total Product is "${AdminLoginFormBean.frmTotalProduct }"</h3>
				<h3>Total Registered Customer is
					"${AdminLoginFormBean.frmTotalUser }"</h3> --%> 
			</div>
			</div>
		
	


	<script src="js/bootstrap.min.js"></script>
</body>
</html>