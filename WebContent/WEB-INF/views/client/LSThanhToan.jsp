<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width = device-width, initial-scales = 1.0">
    <title>League Of Legend</title>
    <link rel="stylesheet" href="./assets/CSS/styleTrangNap.css">
    <!-- <link rel="stylesheet" href="./assets/fonts/themify-icons/themify-icons.css"> -->
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
                <img src="./assets/img/LogoLOL/Lien-Minh-Huyen-Thoai-ky-niem-10-nam-1.jpg" alt="logoLOL" style="height: 40px; padding-right: 10px;">
                Liên minh huyền thoại
                <div style="    height: 1px;
                background-color: #ccc;
                flex: auto;                
                margin-top: 22px;
                margin-left: 8px;"></div>
            </div>


            <div class="text">Lịch sử giao dịch</div>
            <div class="tabHistory">
                
                <div class="tabHistory-header ">
                    <div class="tabHis-header-item colUser col-7">
                        Tên tài khoản
                    </div>
                    <div class="tabHis-header-item colGame col-7">
                        Game
                    </div>
                    <div class="tabHis-header-item colCardCode col-7">
                        Mã thẻ
                    </div>
                    <div class="tabHis-header-item colDate col-7">
                        Ngày
                    </div>
                    <div class="tabHis-header-item colType col-7">
                        Loại thẻ
                    </div>
                    <div class="tabHis-header-item colCost col-7">
                        Mệnh giá
                    </div>
                    <div class="tabHis-header-item colConver col-7">
                        tiền ảo
                    </div>
                </div>
                <div class="tabHis-body">
                    <div class="tabHis-body-item ">
                        <div class="colUser col-7">
                            username
                        </div>
                        <div class="colGame col-7">
                            Liên minh
                        </div>
                        <div class="colCardCode col-7">
                            01254687564
                        </div>
                        <div class="colDate col-7">
                            14/9/2021
                        </div>
                        <div class="colType col-7">
                            viettel
                        </div>
                        <div class="colCost col-7">
                            50000 VND
                        </div>
                        <div class="colConver col-7">
                            80 RP
                        </div>
                        
                    </div>
                    <div class="tabHis-body-item ">
                        <div class="colUser col-7">
                            username
                        </div>
                        <div class="colGame col-7">
                            Liên minh
                        </div>
                        <div class="colCardCode col-7">
                            01254687564
                        </div>
                        <div class="colDate col-7">
                            14/9/2021
                        </div>
                        <div class="colType col-7">
                            viettel
                        </div>
                        <div class="colCost col-7">
                            50000 VND
                        </div>
                        <div class="colConver col-7">
                            80 RP
                        </div>
                        
                    </div>
                    <div class="tabHis-body-item ">
                        <div class="colUser col-7">
                            username
                        </div>
                        <div class="colGame col-7">
                            Liên minh
                        </div>
                        <div class="colCardCode col-7">
                            01254687564
                        </div>
                        <div class="colDate col-7">
                            14/9/2021
                        </div>
                        <div class="colType col-7">
                            viettel
                        </div>
                        <div class="colCost col-7">
                            50000 VND
                        </div>
                        <div class="colConver col-7">
                            80 RP
                        </div>
                        
                    </div>
                    <div class="tabHis-body-item ">
                        <div class="colUser col-7">
                            username
                        </div>
                        <div class="colGame col-7">
                            Liên minh
                        </div>
                        <div class="colCardCode col-7">
                            01254687564
                        </div>
                        <div class="colDate col-7">
                            14/9/2021
                        </div>
                        <div class="colType col-7">
                            viettel
                        </div>
                        <div class="colCost col-7">
                            50000 VND
                        </div>
                        <div class="colConver col-7">
                            80 RP
                        </div>
                        
                    </div>
                    <div class="tabHis-body-item ">
                        <div class="colUser col-7">
                            username
                        </div>
                        <div class="colGame col-7">
                            Liên minh
                        </div>
                        <div class="colCardCode col-7">
                            01254687564
                        </div>
                        <div class="colDate col-7">
                            14/9/2021
                        </div>
                        <div class="colType col-7">
                            viettel
                        </div>
                        <div class="colCost col-7">
                            50000 VND
                        </div>
                        <div class="colConver col-7">
                            80 RP
                        </div>
                        
                    </div>
                    <div class="tabHis-body-item ">
                        <div class="colUser col-7">
                            username
                        </div>
                        <div class="colGame col-7">
                            Liên minh
                        </div>
                        <div class="colCardCode col-7">
                            01254687564
                        </div>
                        <div class="colDate col-7">
                            14/9/2021
                        </div>
                        <div class="colType col-7">
                            viettel
                        </div>
                        <div class="colCost col-7">
                            50000 VND
                        </div>
                        <div class="colConver col-7">
                            80 RP
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>