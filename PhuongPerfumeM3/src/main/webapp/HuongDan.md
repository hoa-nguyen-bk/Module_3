## Hướng dẫn phần Quảng cáo theo MVC
### Model phải có:
	1. Java Bean: QuangCao là tạo cái class:
		- 4 yêu cầu của 1 java bean: 
			+ cần lấy hết mấy thuộc tính
	2. Business Logic: 
		- CSDL: như thường lệ
		- QuangCaoBL -> docTatCa() -> List<QuangCao>
### View:
	3. Sửa lại trang views/quang-cao.jsp cho dữ liệu động
### Controller:
	4. Servlet: QuangCaoServlet: 
		+trong này ta sẽ chuẩn bị data, làm sao lấy được List<QuangCao>
		+đặt lên thuộc tính ứng dụng web: tức là request.setAttribute("dsqc",dsqc)
		+trả về trang views/quang-cao.jsp để hiển thị
			request.getRequestDispatcher("views/quang-cao.jsp).include(request,response); 
			chỗ này hơm rõ, coi lại record nghen: forward khi nó là 1 thành phần của trang này, include là chèn trang đó vào đây

Note: nếu mà có đổi tên folder thì nên xóa máy chủ PhuongPerfumeM3 đi và chạy lại f11
