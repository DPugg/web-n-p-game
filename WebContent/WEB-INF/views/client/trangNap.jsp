<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width = device-width, initial-scales = 1.0">
<title>League Of Legend</title>
<link rel="stylesheet" href="./assets/CSS/styleTrangNap.css">
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



		<div class="content">
			<div class="advertisement">
				<img src="./assets/img/slide/img_napThe.jpg" alt="quảng cáo nạp thẻ">
			</div>

			<div class="cardType-header">
				<img
					src="./assets/img/LogoLOL/Lien-Minh-Huyen-Thoai-ky-niem-10-nam-1.jpg"
					alt="logoLOL" style="height: 40px; padding-right: 10px;">
				Liên minh huyền thoại
				<div
					style="height: 1px; background-color: #ccc; flex: auto; margin-top: 22px; margin-left: 8px;"></div>
			</div>

			<div class="text">Chọn loại thẻ muốn nạp</div>
			<div class="cardType">

				<div class="cardType-item garena" id="Garena" onclick="garenaType()">
					<div class="itemCard-border">
						<div class="itemCard-img">
							<img src="./assets/img/cardType/garena.png" alt="">
						</div>
					</div>
				</div>
				<div class="cardType-item viettel" id="Viettel"
					onclick="viettelType()">
					<div class="itemCard-border">
						<div class="itemCard-img">
							<img src="./assets/img/cardType/viettel.png" alt="">
						</div>
					</div>
				</div>
				<div class="cardType-item mobiphone" id="Mobiphone"
					onclick="mobiType()">
					<div class="itemCard-border">
						<div class="itemCard-img">
							<img src="./assets/img/cardType/mobi.png" alt="">
						</div>
					</div>
				</div>
				<div class="cardType-item vinaphone" id="Vinaphone"
					onclick="vinaType()">
					<div class="itemCard-border">
						<div class="itemCard-img">
							<img src="./assets/img/cardType/vina.png" alt="">
						</div>
					</div>
				</div>
			</div>

			<script>
				function vinaType() {
					var vina = document.getElementById('Vinaphone')
					document.getElementById("inputType").innerHTML = vina.id;
				}
				function mobiType() {
					var mobi = document.getElementById('Mobiphone')
					document.getElementById("inputType").innerHTML = mobi.id;
				}
				function viettelType() {
					var viettel = document.getElementById('Viettel')
					document.getElementById("inputType").innerHTML = viettel.id;
				}
				function garenaType() {
					var garena = document.getElementById('Garena')
					document.getElementById("inputType").innerHTML = garena.id;
				}
			</script>

			<div
				style="height: 1px; background-color: #ccc; flex: auto; margin-top: 40px; margin-bottom: 40px;">
			</div>

			<div class="contentBot">
				<div class="conversionTab">
					<div class="text">Giá quy đổi ra RP xin vui lòng tham khảo
						phía dưới</div>
					<div class="table">
						<div class="t-head ">
							<ul class="t-head-item row">
								<li class="col-2">Mệnh giá (VND)</li>
								<li class="col-2">Thêm điểm(RP)</li>
							</ul>
						</div>
						<div class="t-body">
							<ul class="t-body-item row">
								<li class="col-2">20 000 VND</li>
								<li class="col-2">RPx40</li>
							</ul>
							<ul class="t-body-item row">
								<li class="col-2">50 000 VND</li>
								<li class="col-2">RPx100</li>
							</ul>
							<ul class="t-body-item row">
								<li class="col-2">100 000 VND</li>
								<li class="col-2">RPx210</li>
							</ul>
							<ul class="t-body-item row">
								<li class="col-2">200 000 VND</li>
								<li class="col-2">RPx420</li>
							</ul>
							<ul class="t-body-item row">
								<li class="col-2">500 000 VND</li>
								<li class="col-2">RPx1100</li>
							</ul>
						</div>
					</div>
				</div>

				<div>
					<form action="nap" method="POST">
						<div class="inputCard">
							<div class="text">Chi tiết thanh toán</div>
							${message}
							<div class="infoCard">
								<div class="infoCard-item ">
									<div class="infoCard-item-left col-2">Loại thẻ</div>
									<div class="infoCard-item-right col-2" id="inputType"></div>
								</div>
								<div class="infoCard-item ">
									<div class="infoCard-item-left col-2">Mã thẻ</div>
									<input type="text" placeholder="nhập mã thẻ vào đây"
										class="infoCard-item-right col-2 input" name="cardCode"> </input>
								</div>
								<div class="infoCard-item ">
									<div class="infoCard-item-left col-2">Mệnh giá</div>
									<div class="infoCard-item-right col-2">${napThe.mucGia}</div>
								</div>
								<div class="infoCard-item ">
									<div class="infoCard-item-left col-2">Số RP quy đổi</div>
									<div class="infoCard-item-right col-2">${tienAo }
									</div>
								</div>
								<div class="infoCard-item">
									<div class="infoCard-item-left col-2">số seri</div>
									<div class="infoCard-item-right col-2">${napThe.soSeri}</div>
								</div>
								<div class="submit">
									<button class="btnPay">Thanh toán</button>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>