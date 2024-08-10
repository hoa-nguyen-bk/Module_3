## Hướng dẫn phần Quảng cáo theo MVC
### Model phải có:
1. Java Bean: QuangCao là tạo cái class:
	- 4 yêu cầu của 1 java bean: 
		+ cần lấy hết mấy thuộc tính
		+ khai báo dữ liệu
		+ phương thức getter, setter
		+ hàm khởi tạo ko tham số
2. Business Logic: 
	- CSDL: như thường lệ
	- QuangCaoBL -> docTatCa() -> List<QuangCao>
### View:
3. Sửa lại trang views/quang-cao.jsp cho dữ liệu động
### Controller:
4. Servlet: QuangCaoServlet: 
	+ trong này ta sẽ chuẩn bị data, làm sao lấy được List<QuangCao>
	+ đặt lên thuộc tính ứng dụng web: tức là request.setAttribute("dsqc",dsqc)
	+ trả về trang views/quang-cao.jsp để hiển thị
		request.getRequestDispatcher("views/quang-cao.jsp).include(request,response); 
		chỗ này hơm rõ, coi lại record nghen: forward khi nó là 1 thành phần của trang này, include là chèn trang đó vào đây
	+ xong nếu gọi trực tiếp trên trang trang-chu thì nó ko có gì cả, vì servlet nó lấy data từ QuangCaoServlet
	+ trong trang-chu.jsp sửa views/quang-cao.jsp thành QuangCaoServlet
		. cách xử lý là mở Window/preferences/web/JSP files/Validation 2 casi warning 
			Included fragment file not found: Error -> Warning
			Included fragment file not specified: Error -> Warning

## Hướng dẫn phần Thương hiệu theo MVC
### Model phải có:
1. Java Bean: ThuongHieu là tạo cái class:
	- 4 yêu cầu của 1 java bean: 
		+ cần lấy hết mấy thuộc tính
2. Business Logic: 
	- CSDL: như thường lệ
	- ThuongHieuBL -> docTatCa() -> List<ThuongHieu>
### View:
3. Sửa lại trang views/quang-cao.jsp cho dữ liệu động
### Controller:
4. Servlet: ThuongHieuServlet: 
	+ trong này ta sẽ chuẩn bị data, làm sao lấy được List<ThuongHieu>
	+ đặt lên thuộc tính ứng dụng web: tức là request.setAttribute("dsqc",dsqc)
	+ trả về trang views/quang-cao.jsp để hiển thị
		request.getRequestDispatcher("views/quang-cao.jsp).include(request,response); 
		+ chỗ này hơm rõ, coi lại record nghen: forward khi nó là 1 thành phần của trang này, include là chèn trang đó vào đây
	+ xong nếu gọi trực tiếp trên trang trang-chu thì nó ko có gì cả, vì servlet nó lấy data từ ThuongHieuServlet
	+ trong trang-chu.jsp sửa views/quang-cao.jsp thành ThuongHieuServlet
		+ cách xử lý là mở Window/preferences/web/JSP files/Validation 2 casi warning 
			Included fragment file not found: Error -> Warning
			Included fragment file not specified: Error -> Warning

Note: nếu mà có đổi tên folder thì nên xóa máy chủ PhuongPerfumeM3 đi và chạy lại f11
