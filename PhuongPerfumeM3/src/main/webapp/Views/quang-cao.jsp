<%-- 
    Document   : quang-cao-slider
--%>
<%-- ban đầu: 4 cái hình này là web tĩnh, cố định lun --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="slider-area">
	<!-- Slider -->
	<div class="block-slider block-slider4">
		<ul class="" id="bxslider-home4">
			<c:forEach items="${dsqc }" var="qc">
				<li>
					<img src="img/${qc.hinhAnh}" alt="${qc.hinhAnh}">
					<div class="caption-group">
						<h2 class="caption title">
							<span class="primary"><strong>${qc.thongDiep} </strong></span>
						</h2>
						<h4 class="caption subtitle">${qc.ngayDang} </h4>
						<a class="caption button-radius" href="#"><span class="icon"></span>Chi tiết</a>
					</div>
				</li>
			</c:forEach>

		</ul>
	</div>
	<!-- ./Slider -->
</div>
<!-- End slider area -->