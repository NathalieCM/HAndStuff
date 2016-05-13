<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hobby And Stuff</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/MainPageTemplate.css" />

<!--This code for carousel-inner-->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}
</style>
</head>
<body>
	<div class="header">
		<div class="logo">
			<a href="index.html"><img
				src="<%=request.getContextPath()%>/resources/images/heading.png"
				alt="HobbyAndStuff"></a>
		</div>
		<div class="authorization">
			<security:authorize access="isAuthenticated()">

				<form action="/logout" method="post">
					<input type="submit" value="logout"> <input type="hidden"
						name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
			</security:authorize>
		</div>
	</div>

	<!--This part provides dropdown Menu-->
	<script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/jquery.easing.1.3.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#sdt_menu > li')
					.bind(
							'mouseenter',
							function() {
								var $elem = $(this);
								$elem
										.find('img')
										.stop(true)
										.animate({
											'width' : '170px',
											'height' : '170px',
											'left' : '0px'
										}, 400, 'easeOutBack')
										.andSelf()
										.find('.sdt_wrap')
										.stop(true)
										.animate({
											'top' : '140px'
										}, 500, 'easeOutBack')
										.andSelf()
										.find('.sdt_active')
										.stop(true)
										.animate(
												{
													'height' : '170px'
												},
												300,
												function() {
													var $sub_menu = $elem
															.find('.sdt_box');
													if ($sub_menu.length) {
														var left = '170px';
														if ($elem.parent()
																.children().length == $elem
																.index() + 1)
															left = '-170px';
														$sub_menu
																.show()
																.animate(
																		{
																			'left' : left
																		}, 200);
													}
												});
							}).bind(
							'mouseleave',
							function() {
								var $elem = $(this);
								var $sub_menu = $elem.find('.sdt_box');
								if ($sub_menu.length)
									$sub_menu.hide().css('left', '0px');

								$elem.find('.sdt_active').stop(true).animate({
									'height' : '0px'
								}, 300).andSelf().find('img').stop(true)
										.animate({
											'width' : '0px',
											'height' : '0px',
											'left' : '85px'
										}, 400).andSelf().find('.sdt_wrap')
										.stop(true).animate({
											'top' : '25px'
										}, 500);
							});
		});
	</script>
	<!--Parts of Menu-->
	<div class="container">
		<div class="section">
			<div class="nav">
				<ul id="sdt_menu" class="sdt_menu">
					<li><a href="#"> <img
							src="<%=request.getContextPath()%>/resources/images/2.png" alt="" />
							<span class="sdt_active"></span> <span class="sdt_wrap"> <span
								class="sdt_link">Top-5 Books</span> <span class="sdt_descr">Just
									reading</span>
						</span>
					</a>
						<div class="sdt_box">
							<a href="#">Science-Fiction</a> <a href="#">Fantasy</a> <a
								href="#">Novel</a> <a href="#">Play</a> <a href="#">Psychology</a>
							<a href="#">Philosophy</a>
						</div></li>
					<li><a href="#"> <img
							src="<%=request.getContextPath()%>/resources/images/1.png" alt="" />
							<span class="sdt_active"></span> <span class="sdt_wrap"> <span
								class="sdt_link">Top-5 Films</span> <span class="sdt_descr">Need
									to watch</span>
						</span>
					</a>
						<div class="sdt_box">
							<a href="#">Thriller</a> <a href="#">Drama</a> <a href="#">Comedy</a>
							<a href="#">Documental</a>
						</div></li>
					<li><a href="#"> <img
							src="<%=request.getContextPath()%>/resources/images/3.png" alt="" />
							<span class="sdt_active"></span> <span class="sdt_wrap"> <span
								class="sdt_link">Favorite</span> <span class="sdt_descr">A
									bit of everything</span>
						</span>
					</a>
						<div class="sdt_box">
							<a href="#">Pictures</a> <a href="#">Quotations</a> <a href="#">Nature</a>
							<a href="#">Songs</a>
						</div></li>
					<li><a href="#"> <img
							src="<%=request.getContextPath()%>/resources/images/4.png" alt="" />
							<span class="sdt_active"></span> <span class="sdt_wrap"> <span
								class="sdt_link">Poetry</span> <span class="sdt_descr">A
									part of life</span>
						</span>
					</a>
						<div class="sdt_box">
							<a href="#">My poor attempts</a> <a href="#">Hokku</a> <a
								href="#">Different</a> <a href="#">Classic</a>
						</div></li>
					<li><a href="#"> <img
							src="<%=request.getContextPath()%>/resources/images/5.png" alt="" />
							<span class="sdt_active"></span> <span class="sdt_wrap"> <span
								class="sdt_link">Blog</span> <span class="sdt_descr">I
									like to write</span>
						</span>
					</a>
						<div class="sdt_box">
							<a href="#">About life</a> <a href="#">About people</a> <a
								href="#">About world</a>
						</div></li>
				</ul>
			</div>
			<div class="mainBody">
			<p>jdhsjdh</p>
			</div>
		</div>
		<div class="aside"></div>
	</div>
</body>
</html>