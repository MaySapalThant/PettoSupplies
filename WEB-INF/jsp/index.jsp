<%--
    Licensed to the Apache Software Foundation (ASF) under one or more
    contributor license agreements.  See the NOTICE file distributed with
    this work for additional information regarding copyright ownership.
    The ASF licenses this file to You under the Apache License, Version 2.0
    (the "License"); you may not use this file except in compliance with
    the License.  You may obtain a copy of the License at
   
         http://www.apache.org/licenses/LICENSE-2.0
   
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
--%>
<%@ include file="inc/common.jsp"%>
<logic:redirect href="homePath.do"></logic:redirect>

<%--

Redirect default requests to Welcome global ActionForward.
By using a redirect, the user-agent will change address to match the path of our Welcome ActionForward. 

--%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Document</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css1/shared.css" type="text/css">
<link rel="stylesheet" href="css1/home-style.css" type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="position-fixed w-100 nav-div top-0">
		<nav
			class="navbar navbar-expand-lg navbar-light border-bottom border-1 border-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="images/paw-print-clip-art-heart.png" alt="" width="50"
				class="rounded-circle"> </a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Pet Needs</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Shop By Pet </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<logic:notEmpty property="petsList" name="HomeFormBean">
								<logic:iterate id="pet" property="petsList"
									name="HomeFormBean">
									<li><a class="dropdown-item" href="petPagePath.do?frmPetId=${pet.id}">${pet.petName }</a></li>
								</logic:iterate>
							</logic:notEmpty>
						</ul></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Shop By Category </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="shop_category.html">Dog
									Foods</a>
							</li>
							<li><a class="dropdown-item" href="#">Dog Beds and
									Funiture</a>
							</li>
							<li><a class="dropdown-item" href="#">Cat Foods</a>
							</li>
							<li><a class="dropdown-item" href="#">Fish Foods</a>
							</li>
						</ul></li>
				</ul>
				<a href="login.html" class="nav-link text-decoration-none"><i
					class="fa fa-user-circle fa-2x m-0"></i>
				</a> <a href="cart.html" class="nav-link text-decoration-none"><i
					class="fa fa-shopping-cart fa-2x m-0"></i>
				</a>
				<form class="d-flex">

					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-danger" type="submit">Search</button>
				</form>
			</div>
		</div>
		</nav>
	</div>

	<section class="section-home border-bottom border-1 border-dark">
	<div class="container">
		<div class="row home">
			<div class="home-text-box col-md-5 col-12">
				<h1 class="heading-primary  mt-3">Pet accessories to your
					lovely pets.</h1>
				<p class="home-description">Lorem ipsum dolor sit amet
					consectetur adipisicing elit. Eligendi nobis odio similique labore
					deleniti in reprehenderit amet a totam. Assumenda a aspernatur quae
					velit rerum accusamus voluptatibus culpa rem quod.</p>
				<a href="#" type="button" class="btn btn-red btn-big">Learn more
					&darr;</a>
			</div>
			<div class="home-img-box col-md-7 col-12">
				<img src="images/Doggie.png" class="home-img"
					alt="A dog and a girl.">
			</div>
		</div>
	</div>
	</section>

	<section class="border-bottom border-1 border-dark">
	<div class="all-pet-container">
		<h2 class="heading-secondary text-center">Shop by Pet</h2>
		<div class="container-fluid py-2 overflow-scroll overflow-hidden">

			<div class="d-flex flex-row flex-nowrap justify-content-between">

				<div class="pet-card col-sm-3 col-6 text-center">
					<div class="pet-img-container">
						<img src="images/Happy-Dog334.jpg" class="pet-img" alt="Dog">
					</div>
					<a href="#" type="button" class="btn btn-red">Dog<span
						class="link"></span>
					</a>
				</div>
				<div class="pet-card col-sm-3 col-6 text-center">
					<div class="pet-img-container">
						<img src="images/Pretty-Cat334.jpg" class="pet-img" alt="Dog">
					</div>
					<a href="#" type="button" class="btn btn-red">Cat<span
						class="pet-card-link"></span>
					</a>
				</div>
				<div class="pet-card col-sm-3 col-6 text-center">
					<div class="pet-img-container">
						<img src="images/Red-Fish334.jpg" class="pet-img" alt="Dog">
					</div>
					<a href="#" type="button" class="btn btn-red">Fish<span
						class="link"></span>
					</a>
				</div>

			</div>
		</div>
	</div>

	</section>

	<section class="border-bottom border-1 border-dark">
	<h2 class="heading-secondary text-center">Latest Products</h2>
	<div class="container-fluid py-2 overflow-scroll mt-5">

		<div class="d-flex flex-row flex-nowrap justify-content-between">

			<div class="product-card col-lg-2 col-6 mb-3">
				<img src="images/blue_buffalo_front.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h6 class="card-title">
						Blue Buffalo Life Protection Formula Natural Adult Dry Dog Food,
						Chicken and Brown Rice 30-lb
						</h5>
						<p class="card-text">5400 ks</p>
						<div class="align-content-center">
							<a href="#" type="button" class="btn btn-red">Detail<span
								class="link"></span>
							</a>
						</div>
				</div>
			</div>

			<div class="product-card col-lg-2 col-6 mb-3">
				<img src="images/cesar_front.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h6 class="card-title">
						CESAR Soft Wet Dog Food Classic Loaf in Sauce Beef Recipe
						</h5>
						<p class="card-text">3000 ks</p>
						<a href="#" type="button" class="btn btn-red">Detail<span
							class="link"></span>
						</a>
				</div>
			</div>

			<div class="product-card col-lg-2 col-6 mb-3">
				<img src="images/Iamso_front.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<h6 class="card-title">
						IAMS PROACTIVE HEALTH Adult Minichunks Small Kibble High Protein
						Dry Dog Food with Real Chicken, 30 lb. Bag
						</h5>
						<p class="card-text">3500 ks</p>
						<a href="#" type="button" class="btn btn-red">Detail<span
							class="link"></span>
						</a>
				</div>
			</div>

			<div class="product-card col-lg-2 col-6 mb-3">
				<img src="images/kibble_bits_front.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h6 class="card-title">
						Kibbles 'N Bits Original Savory Beef & Chicken Flavors Dry Dog
						Food
						</h5>
						<p class="card-text">3300 ks</p>
						<a href="#" type="button" class="btn btn-red">Detail<span
							class="link"></span>
						</a>
				</div>
			</div>

			<!-- <div class="product-card col-lg-2 col-6 mb-3">
                    <img src="images/Doggie500x375.png" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title">Some quick example text to build on the card title.</h5>
                      <p class="card-text">40000 ks</p>
                      <a href="#" class="btn text-white" style="background-color: #f6615a;">Detail<span class="link"></span></a>
                    </div>
                </div>

                <div class="product-card col-lg-2 col-6 mb-3">
                    <img src="images/Doggie500x375.png" class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title">Make up the bulk of the card's content.</h5>
                      <p class="card-text">30200 ks</p>
                      <a href="#" class="btn text-white" style="background-color: #f6615a;">Detail<span class="link"></span></a>
                    </div>
                </div> -->
		</div>
	</div>
	</section>

	<section class="border-bottom border-1 border-dark">

	<h2 class="heading-secondary text-center">Shop by Category</h2>
	<div class="container">

		<div class="row justify-content-between">

			<div class="category-card col-sm-5 col-6">
				<h5 class="category-card-title">Dog</h5>
				<a href="#" class="category-card-text d-block">Dog Foods</a> <a
					href="#" class="category-card-text d-block">Dog Beds & Funiture</a>
				<a href="#" class="category-card-text d-block">Dog Health and
					Wellness</a> <a href="#" class="category-card-text d-block">Dog
					Clothing and Shoess</a>

			</div>

			<div class="category-card col-sm-4 col-6">
				<h5 class="category-card-title">Cat</h5>
				<a href="#" class="category-card-text d-block">Dog Foods</a> <a
					href="#" class="category-card-text d-block">Dog Beds & Funiture</a>
				<a href="#" class="category-card-text d-block">Dog Health and
					Wellness</a> <a href="#" class="category-card-text d-block">Dog
					Clothing and Shoess</a> <a href="#" class="category-card-text d-block">Dog
					Foods</a> <a href="#" class="category-card-text d-block">Dog Beds &
					Funiture</a> <a href="#" class="category-card-text d-block">Dog
					Health and Wellness</a> <a href="#" class="category-card-text d-block">Dog
					Clothing and Shoess</a>
			</div>

			<div class="category-card col-sm-3 col-6">
				<h5 class="category-card-title">Fish</h5>
				<a href="#" class="category-card-text d-block">Dog Foods</a> <a
					href="#" class="category-card-text d-block">Dog Beds & Funiture</a>
				<a href="#" class="category-card-text d-block">Dog Health and
					Wellness</a> <a href="#" class="category-card-text d-block">Dog
					Clothing and Shoess</a>

			</div>

		</div>
	</div>


	</section>

	<script src="js/bootstrap.min.js"></script>
</body>
</html>
