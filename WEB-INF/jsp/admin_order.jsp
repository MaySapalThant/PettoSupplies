<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Pet Needs - Admin</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
    <link rel="stylesheet" href="css1/shared.css"  type="text/css">
    <link rel="stylesheet" href="css1/admin_style.css"  type="text/css">
    <link rel="stylesheet" href="css/jquery.dataTables.min.css" type="text/css">
    <link rel="icon" href="images/paw-print-clip-art-heart.ico">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <jsp:include page="inc/admin_nav.jsp">
		<jsp:param name="dark" value="order"/>
	</jsp:include>
    <div class="row">
        <div class="col-md-3 col-12">
            <div class="list-group m-4 style="background-color: #e3edfd;">
                <a href="adminAllItemPath.do" class="list-group-item list-group-item-action"><i class="fa fa-shopping-basket me-1" style="color: #fa645e;"></i>Product Management</a>
                <a href="adminAllCategoryPath.do" class="list-group-item list-group-item-action"><i class="fa fa-cubes me-1" style="color: #fa645e;"></i>Category Management</a>
                <a href="adminAllPetPath.do" class="list-group-item list-group-item-action"><i class="fa fa-paw me-2" style="color: #fa645e;"></i>Pet Management</a>
                <a href="adminAllCustomerPath.do" class="list-group-item list-group-item-action"><i class="fa fa-users me-1" style="color: #fa645e;"></i>User Management</a>
                <a href="adminAllOrderPath.do" class="list-group-item list-group-item-action active" aria-current="true"><i class="fa fa-truck me-1" style="color: #fa645e;"></i>Order Management</a>
            </div>
        </div>
        <div class="col-md-9 col-12 m-0 pt-3">
          
          <h2 class="mb-3 ms-md-0 ms-3">All Orders</h2>  
          <hr>
          <div class="">
            <h4 class="ms-md-0 ms-3">Orders to confirm</h4> 
            <div class="item-table-container w-100">
                <table class="table table-striped display pt-3" id="table1">
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
                    <logic:notEmpty property="orderProcessingList" name="AdminOrderFormBean">
						<logic:iterate id="order" property="orderProcessingList" name="AdminOrderFormBean">
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
          </div>
           

          <hr>
          <div class="">
            <h4 class="ms-md-0 ms-3">Confirmed Orders</h4> 
            <div class="item-table-container w-100">
                <table class="table table-striped display pt-3" id="table2">
                	<thead style="background-color: #e3edfd;">
                		<tr class="thead">
                        <th>OrderCode</th>
                        <th>Customer</th>
                        <th>Qty</th>
                        <th>Price</th>
                        <th>Payment</th>
                        <th>OrderDate</th>
                        <th>Status</th>
                        <th>Detail</th>
                    	</tr>
                	</thead>
                    <tbody>
                    <logic:notEmpty property="orderConfirmList" name="AdminOrderFormBean">
						<logic:iterate id="order" property="orderConfirmList" name="AdminOrderFormBean">
							<tr>
                              <td>#${order.id }</td>
                              <td>${order.receiverName }</td>
                              <td>${order.totalQty }</td>
                              <td>${order.totalPrice } ks</td>
                              <td>${order.paymentType }</td>
                              <td>${order.orderDate }</td>
                              <td>${order.status }</td>
                              <td><a href="adminOrderDetailPath.do?frmDetailOrderId=${order.id }" class="btn btn-sm btn-outline-primary">View Detail</a></td>
                            </tr>
						</logic:iterate>
					</logic:notEmpty>
                   </tbody>
                </table>
            </div>
          </div>
           
          
        </div>
    </div>
    
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.js"></script>
    <script src="js/jquery.dataTables.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#table1").DataTable();
            $("#table2").DataTable();
        });
    </script>
</body>
</html>