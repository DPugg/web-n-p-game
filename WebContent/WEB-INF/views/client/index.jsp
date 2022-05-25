<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width = device-width, initial-scales = 1.0">
    <title>League Of Legend</title>
    <link rel="stylesheet" href="./assets/CSS/style.css">
    <!-- <link rel="stylesheet" href="./assets/fonts/themify-icons/themify-icons.css"> -->
    <base href="${pageContext.servletContext.contextPath}/">
</head>

<body>
    <div id="main">
        <div id="header">
            <!-- begin nav -->
            <ul id="nav">
				<li class="logo"><a href="index.htm"><img class="logoChu"
						src="./assets/img/LogoLOL/LogoChu.png" alt="logo LOL"> </a></li>
				<li><a href="trangNap.htm">Nạp thẻ</a></li>
				<li><a href="LSThanhToan.htm">lịch sử giao dịch</a></li>
				<c:choose>
					<c:when test="${clientLogin == null}">
						<li><a href="${pageContext.servletContext.contextPath}/login">Sign
								in</a></li>
					</c:when>
					<c:otherwise>
						<li>
							<div class="user">
								<img src="./assets/img/iconUser.jpg" alt="imgUser"
									style="height: 36px;">
								<p class="userName">${clientLogin.username}</p>
							</div>
						</li>
					</c:otherwise>
				</c:choose>

				<li><a href="login.htm">Đăng xuất</a></li>


			</ul>
            <!-- end nav -->
        </div>


        <div class="slide">
            <!-- Thẻ Chứa Slideshow -->
            <div class="slideshow-container">
                <div class="background" style="background-image: url(./assets/img/slide/background.jpg); height:520px">
                
                    <!-- Kết hợp hình ảnh và nội dung cho mội phần tử trong slideshow-->
                    <div class="mySlides fade">
                        <div class="numbertext">1 / 3</div>
                        <img src="./assets/img/slide/slide1.png"
                            style="width:95%">
                        <!-- <div class="text">Nội Dung 1</div> -->
                    </div>
                    <div class="mySlides fade">
                        <div class="numbertext">2 / 3</div>
                        <img src="./assets/img/slide/slide2.jpg"
                            style="width:95%">
                        <!-- <div class="text">Nội Dung 2</div> -->
                    </div>
                    <div class="mySlides fade">
                        <div class="numbertext">3 / 3</div>
                        <img src="./assets/img/slide/slide3.png"
                            style="width:95%">
                        <!-- <div class="text">Nội Dung 3</div> -->
                    </div>
                    <!-- Nút điều khiển mũi tên-->
                    <a class="prev" onclick="plusSlides(-1)">❮</a>
                    <a class="next" onclick="plusSlides(1)">❯</a>
    
                    <!-- Nút tròn điều khiển slideshow-->
                    <div class="nut" style="text-align:center">
                        <span class="dot" onclick="currentSlide(1)"></span>
                        <span class="dot" onclick="currentSlide(2)"></span>
                        <span class="dot" onclick="currentSlide(3)"></span>
                    </div>
                </div>
            </div>


        </div>


    </div>

    <script>
        var slideIndex = 1;
        showSlides(slideIndex);
        function plusSlides(n) {
            showSlides(slideIndex += n);
        }
        function currentSlide(n) {
            showSlides(slideIndex = n);
        }
        function showSlides(n) {
            var i;
            var slides = document.getElementsByClassName("mySlides");
            var dots = document.getElementsByClassName("dot");
            if (n > slides.length) { slideIndex = 1 }
            if (n < 1) { slideIndex = slides.length }
            for (i = 0; i < slides.length; i++) {
                slides[i].style.display = "none";
            }
            for (i = 0; i < dots.length; i++) {
                dots[i].className = dots[i].className.replace(" active", "");
            }
            slides[slideIndex - 1].style.display = "block";
            dots[slideIndex - 1].className += " active";
        }
    </script>

</body>

</html>