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
            <div class="ms-5 me-5 h-100">
                <h2>Order Detail</h2>
                <hr>
                <div class="input-group mb-4 mt-4">
                    <span class="input-group-text" id="basic-addon1">Order Code</span>
                    <label class="form-control" aria-label="OrderID" aria-describedby="basic-addon1">#${AdminOrderFormBean.detailOrder.id }</label>
                    <span class="input-group-text" id="basic-addon6">Customer Name</span>
                    <label class="form-control" aria-label="OrderID" aria-describedby="basic-addon6">${AdminOrderFormBean.detailOrder.receiverName }</label>
                </div>
                <div class="input-group mb-4 mt-4">
                    <span class="input-group-text" id="basic-addon3">Quantity</span>
                    <label class="form-control" aria-label="Quantity" aria-describedby="basic-addon3">${AdminOrderFormBean.detailOrder.totalQty }</label>
                    <span class="input-group-text" id="basic-addon4">Total Price</span>
                    <label class="form-control" aria-label="TotalPrice" aria-describedby="basic-addon4">${AdminOrderFormBean.detailOrder.totalPrice } ks</label>
                </div>
                <div class="input-group mb-4 mt-4">   
                    <span class="input-group-text" id="basic-addon2">Order Date</span>
                    <label class="form-control" aria-label="OrderDate" aria-describedby="basic-addon2">${AdminOrderFormBean.detailOrder.orderDate }</label>
                    <span class="input-group-text" id="basic-addon5">Payment Type</span>
                    <label class="form-control" aria-label="Payment Type" aria-describedby="basic-addon5">${AdminOrderFormBean.detailOrder.paymentType }</label>
                </div>
                <div class="input-group mb-5 mt-4">
                    <span class="input-group-text" id="basic-addon7">Remark</span>
                    <label class="form-control" aria-label="Payment Type" aria-describedby="basic-addon7">${AdminOrderFormBean.detailOrder.remark }</label>
                </div>

                <div class="mb-3 w-100 rounded-1 p-2" style="background-color: #e3edfd;" >
                    Shipping Address
                </div>
                <hr>
                <div class="input-group mb-4 mt-4">   
                    <span class="input-group-text" id="basic-addon8">Receiver Name</span>
                    <label class="form-control" aria-label="Receiver Name" aria-describedby="basic-addon8">${AdminOrderFormBean.detailOrder.receiverName }</label>
                    <span class="input-group-text" id="basic-addon9">Receiver Phone</span>
                    <label class="form-control" aria-label="Receiver Phone" aria-describedby="basic-addon9">${AdminOrderFormBean.detailOrder.receiverPhone }</label>
                </div>
                <div class="input-group mb-5 mt-4">
                    <span class="input-group-text" id="basic-addon10">Address</span>
                    <label class="form-control" aria-label="Address" aria-describedby="basic-addon10">${AdminOrderFormBean.detailOrder.receiverAddress }</label>
                </div>

                <div class="mb-3 w-100 rounded-1 p-2" style="background-color: #e3edfd;" >
                    Order Items 
                </div>
                <hr>
                

                <div class="order-detail-table-container w-100">
                    <table class="item-table table table-striped">
                        <tr><th colspan="2" class="text-center">Item</th>
                            <th class="text-center">Unit Price</th>
                            <th class="text-center">Qty</th>
                            <th class="text-center">Total Price</th>
                        </tr>
                        <logic:notEmpty property="frmDetailCartItemList" name="AdminOrderFormBean">
							<logic:iterate id="cartItem" property="frmDetailCartItemList" name="AdminOrderFormBean">
								<tr>
                                    <td class="text-center">
                                        <div class="img-container">
                                            <img src="${cartItem.cartItem.itemImage }">
                                        </div> 
                                    </td>
                                    <td  class="item-name">${cartItem.cartItem.itemName } </td>
                                    <td class="text-center">${cartItem.cartItem.unitPrice } ks</td>
                                    <td class="text-center">${cartItem.qty }</td>
                                    <td class="text-center">${cartItem.cartItem.unitPrice * cartItem.qty } ks</td> 
                                </tr>
							</logic:iterate>
						</logic:notEmpty>
                       
                    </table>
                </div>
            </div>
          
           
          
        </div>
    </div>
    
    <script src="js/bootstrap.min.js"></script>
</body>
</html>