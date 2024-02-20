    <div class="position-fixed w-100 nav-div top-0">
        <nav class="navbar navbar-expand-lg navbar-light border-bottom border-1 border-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="homePath.do">
                    <img src="images/paw-print-clip-art-heart.png" alt="" width="50" class="rounded-circle">
                 </a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link text-uppercase fw-bold text-dark" style="font-family: 'Copperplate Gothic Light';" aria-current="page" href="homePath.do">Pet Needs</a>
                  </li>
                  
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" style="font-family: 'Comic Sans';" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Shop By Pet
                    </a>
                    <ul class="dropdown-menu border border-danger profile-dropdown" aria-labelledby="navbarDropdown">
                      <logic:notEmpty property="petsList" name="HomeFormBean">
							<logic:iterate id="pet" property="petsList" name="HomeFormBean">
								<li><a class="dropdown-item" href="petPagePath.do?frmPetId=${pet.id}">${pet.petName }</a></li>
							</logic:iterate>
						</logic:notEmpty>
                    </ul>
                  </li>
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" style="font-family: 'Comic Sans';" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Shop By Category
                    </a>
                    <ul class="dropdown-menu border border-danger profile-dropdown" aria-labelledby="navbarDropdown">
                      <logic:notEmpty property="categoriesList" name="HomeFormBean">
							<logic:iterate id="category" property="categoriesList" name="HomeFormBean">
								<li><a class="dropdown-item" href="categoryPagePath.do?frmCategoryId=${category.id}">${category.categoryName }</a></li>
							</logic:iterate>
						</logic:notEmpty>
                    </ul>
                  </li>
                </ul>
                <logic:notPresent property="loginCustomer" name="LoginFormBean">
					<a href="loginPathFirst.do" style="font-family: 'Comic Sans';" class="text-decoration-none text-danger fw-bold  ms-2">Login</a>
				</logic:notPresent>
				<logic:present property="loginCustomer" name="LoginFormBean">
					<div class="dropdown ms-2">
						<a class="dropdown-toggle text-decoration-none text-danger fw-bold"
							id="dropdownMenuButton1" data-bs-toggle="dropdown" style="font-family: 'Comic Sans';"
							aria-expanded="false">${LoginFormBean.loginCustomer.customerName
						}</a>
						<ul class="dropdown-menu dropdown-menu-start border border-danger profile-dropdown"
							aria-labelledby="dropdownMenuButton1" style="font-family: 'Comic Sans';">
							<li><a class="dropdown-item" href="profileUpdatePathFirst.do">Edit Profile</a></li>
							<li><a class="dropdown-item" href="changePasswordPathFirst.do">Change Password</a></li>
							<li><a class="dropdown-item" href="customerOrderPath.do">Orders History</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a data-bs-toggle="modal" data-bs-target="#exampleModalNav"
								class="dropdown-item text-decoration-none">Logout</a></li>
						</ul>
					</div>
					
				</logic:present>
                <div class="badge-cart">
               		<a href="addToCartPath.do" class="nav-link text-decoration-none position-relative"><i class="fa fa-shopping-cart fa-2x m-0"></i>
                		
							<logic:present property="frmTotalQty" name="CartFormBean">
								<span class="bg-danger badge position-absolute start-10 top-10 translate-middle rounded-circle ms-1" id="cart-qty">${CartFormBean.frmTotalQty }</span>
							</logic:present>
							<logic:notPresent property="frmTotalQty" name="CartFormBean">
								<span class="badge-cart-items">0</span>
							</logic:notPresent>
						
                	</a>
               	</div>
              </div>
            </div>
        </nav>
    </div>
    
    <!-- Modal -->
					<div class="modal fade" id="exampleModalNav" tabindex="-2"
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
										<a type="button" style="background-color: #dc3545;" href="logoutPath.do" class="btn btn-danger">Logout</a>
										
									
								</div>
							</div>
						</div>
					</div>