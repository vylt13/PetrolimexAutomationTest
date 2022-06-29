package pages;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThuocTinhVBDen {
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	DateTimeFormatter formatNgayVanBan = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public String createdTime = myFormatObj.format(LocalDateTime.now());
	public String so_van_ban = "QĐ/2706/";
	public String trich_yeu = "TC 01 - VB Đến đang lưu - Kiểm tra hiển thị khi không có file đính kèm. Được tạo lúc: " + createdTime;
	public String loai_van_ban = "Biên bản";
	public String loai_van_ban_HSDT = "Công văn";
	public String co_quan_gui = "BAN CHỈ HUY QUÂN SỰ QUẬN LONG BIÊN";
	public String linh_vuc = "An toàn môi trường";
	public String ngay_den = formatNgayVanBan.format(LocalDateTime.now());
	public String ngay_tren_vb = formatNgayVanBan.format(LocalDateTime.now());
	public String do_khan = "Thượng khẩn";
	public String do_mat = "Tuyệt mật";
	public String so_ban = "3";
	public String so_trang = "6";
	public String chon_lanh_dao_luu_vb_den = "Chọn lãnh đạo";
	public String chon_lanh_dao_trinh_buoc_vthu = "Eoff Chủ tịch";
	public String filePath = "C:\\AttachFiles\\FilePdf.pdf";
	public String file_name ="FilePdf.pdf";
	public String file_name_xl ="FilePdf";
	public String lanh_dao_chu_tich = "Chủ tịch eoffice";
	public String account_lanh_dao_chu_tich = "Eoff Chủ tịch";
	public String nguoi_duoc_chia_se_vb_den = "eoff.tkdg.cv1";
	public String tat_ca_don_vi_xu_ly = "PLXTGDG-DBVPCCC - Doi Bao ve PCCC - Manager, PLXTKDG-BGĐ - Ban Giam doc - Manager, PLXTKDG-KTTC - Phong Ke toan Tai chinh - Manager, PLXTKĐG - Tong kho Xang dau Duc Giang - Manager, PLXTKDG-XDVCKXD - Xuong Dich vu co khi Xang dau - Manager, PLXTKDG-QLHH - Phong Quan Ly Hang Hoa - Manager, PLXTKDG-QLKT - Phong Quan ly Ky Thuat - Manager, PLXTKDC-KCH101 - Kho cang H101 - Manager, PLXTKDG-TCHC - Phong To chuc Hanh chinh - Manager, PLXTKDG-GN - Doi Giao Nhan - Manager";
	public String lanh_dao_tgd = "Eoff Giám đốc";
	public String account_lanh_dao_tgd = "Eoff Giám đốc";
	public String truong_phong = "Trưởng phòng KV1";
	public String truong_phong_hc = "Eoff TPHC";
	public String account_truong_phong = "eoff.kv1.tp";
	public String trich_yeu_du_thao_vb = "[VTTest]-Trích yếu HSDT trên VB đến";
	public String nguoi_xu_ly_1 = "Eoff Chuyên viên 1";
	public String nguoi_xu_ly_2 = "Eoff Chuyên viên 2";
	public String account_nv_thuc_hien = "Eoff Chuyên viên 1";
	public String y_kien_lanh_dao_phan_cong = "Lãnh đạo phân công thực hiện VB";
	public String y_kien_lanh_dao = "chuyển xử lý";
	public String y_kien_tp_phan_cong = "Trưởng phòng phân công thực hiện VB";
	public String y_kien_nv_thuc_hien = "Nhân viên cập nhật tình trạng Task Văn bản";
	public String tien_do = "56";
	public String file_name_hsxl ="FilePdf";
	
}
