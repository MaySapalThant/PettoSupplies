<%@ include file="common.jsp"%>
 <c:choose>
 <c:when test="${param.dark == 'dashboard' }">
 <c:set var="dashboard" value="text-dark"/>
 </c:when>
 <c:when test="${param.dark == 'product' }">
 <c:set var="product" value="text-dark"/>
 </c:when>
  <c:when test="${param.dark == 'user' }">
 <c:set var="user" value="text-dark"/>
 </c:when>
  <c:when test="${param.dark == 'order' }">
 <c:set var="order" value="text-dark"/>
 </c:when>
  <c:when test="${param.dark == 'profile' }">
 <c:set var="profile" value="text-dark"/>
 </c:when>
 </c:choose>
    <nav class="navbar navbar-expand-lg navbar-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <img src="images/paw-print-clip-art-heart.png" alt="" width="50">
              </a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a href="adminDashboardPath.do" class="nav-link text-uppercase fw-bold text-dark fs-5" style="font-family: 'Copperplate Gothic Light';">Pet Needs</a>
             </li>
            </ul>
            
            	<a
					href="adminDashboardPath.do" style="color:'#eb6758'"
					class="text-decoration-none nav-link fw-bold nav-hover ${dashboard }">Dashboard</a>
					
            	<a
					href="adminAllOrderPath.do" style="color:'#254661'"
					class="text-decoration-none nav-link fw-bold nav-hover ${order }">Orders</a>
            	
				<a
					href="adminAllCustomerPath.do"
					class="text-decoration-none nav-link fw-bold nav-hover ${user }">Users</a>
				    
            <div class="dropdown ms-3 me-3  mb-md-0 mb-2">
				<a class="dropdown-toggle text-decoration-none fw-bold nav-hover ${product }" 
					id="dropdownMenuButton1" data-bs-toggle="dropdown"
					aria-expanded="false">Products</a>
				<ul class="dropdown-menu"
					aria-labelledby="dropdownMenuButton1">
					<li><a href="adminAllItemPath.do"
					class="dropdown-item" aria-current="true">Products</a>
					</li>
					<li><a href="adminAllCategoryPath.do"
					class="dropdown-item">Categories</a>
					</li>
					<li><a href="adminAllPetPath.do"
					class="dropdown-item">Pets</a>
					</li>
				</ul>
			</div>
			
             <div class="dropdown me-4">
				<a class="dropdown-toggle text-decoration-none fw-bold ${profile }" 
					id="dropdownMenuButton1" data-bs-toggle="dropdown"
					aria-expanded="false">${AdminLoginFormBean.loginAdmin.adminName }</a>
				<ul class="dropdown-menu"
					aria-labelledby="dropdownMenuButton1">
					<li><a class="dropdown-item" href="adminProfileUpdatePathFirst.do">Edit Profile</a>
					</li>
					<li><a class="dropdown-item" href="adminChangePasswordPathFirst.do">Change Password</a>
					</li>
					<li><hr class="dropdown-divider">
					</li>
					<li><a class="dropdown-item text-decoration-none" data-bs-toggle="modal" data-bs-target="#exampleModalNav">Logout</a>
					</li>
				</ul>
			</div>
			   
          </div>
        </div>
      </nav>
      
      <!-- Modal -->
					<div class="modal fade" id="exampleModalNav" tabindex="-1"
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