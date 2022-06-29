package pages;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThuocTinhHoSoLuuTru {
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:ss");
	DateTimeFormatter formatNgayVanBan = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public String createdTime = myFormatObj.format(LocalDateTime.now());
	public String ma_ho_so = "HSLT/2021/TD" + System.currentTimeMillis();
	public String ma_ho_so_edit = "HSLT/2021/TD";
	public String file_hop_dong_tp_trinh_tgd = "C:\\AttachFiles\\File HD Tp trinh TGD.docx";
	public String file01 = "C:\\AttachFiles\\FileWord.docx";
	public String file01_full_name = "FileWord.docx";
	public String ten_ho_so = "Hồ sơ Lưu trữ tạo ngày: " + createdTime;
	public String ten_ho_so_edit = "Hồ sơ Lưu trữ Edit" + createdTime;
	public String noi_dung_ho_so = "Nội dung Hồ sơ Lưu trữ";
	public String tu_ngay = "15/07/2021";
	public String den_ngay = "20/07/2021";
	public String noi_luu = "Nơi lưu Hồ sơ Lưu trữ ở Tập đoàn";
	public String linh_vuc = "An toàn môi trường";
	public String tinh_trang = "Đang triển khai";
	public String nguoi_cap_nhat = "Eoff Chuyên viên 2";
	public String quyen_xem = "Eoff Trưởng phòng";
	public String nguoi_tao_hs = "Eoff Chuyên viên 1";
	public String so_van_ban_den = "QĐ/2706/1628671039585";
	public String trich_yeu_vb_den = "TC 03 - TGD- Kiểm tra Tổng giám đốc Chia sẻ VB được tạo lúc: 11-08-2021 15:32:58";
	public String ngay_them_vb_vao_hs = formatNgayVanBan.format(LocalDateTime.now());
	public String so_van_ban_ban_hanh = "486/PLXTKDG-KTTC-NQ";
	public String trich_yeu_vb_ban_hanh = "TC 23 - Luồng ký số VB Yêu cầu hiệu chỉnh và Thay đổi người phê duyệt 1628698824646";
	public String ten_ho_so_tai_lieu = "Hồ sơ tài liệu không ký mộc - Yêu cầu điều chỉnh và thay đổi người duyệt 07-08-2021 08:22";
	public String so_ho_so_tai_lieu = "TT/20211628343442637";
	public String ten_tai_lieu = "Tên tài liệu - File đính kèm";
	public String ngay_tren_vb = "25/12/2021";
	public String plx_ky_chinh = "Nội dung PLX Ký chính";
	public String doi_tac_ky = "Đối tác ký trên tài liệu";
	public String ghi_chu = "Nội dung ghi chú trên file";
	
}
