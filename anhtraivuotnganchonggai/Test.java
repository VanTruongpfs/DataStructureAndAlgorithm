package Exercise1.src.anhtraivuotnganchonggai;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ChuongTrinhATVNCG ATVNCG = new ChuongTrinhATVNCG(1);
        LinkedList<AnhTai> anhTaiList = new LinkedList<>();
        // Tạo đối tượng Bằng Kiều
        ArrayList<String> ngheNghiep1 = new ArrayList<>();
        ngheNghiep1.add("Ca sĩ"); AnhTai bangKieu = new AnhTai("Kieu the Idol", "Bằng Kiều", "1973", 35, ngheNghiep1, 0, 0,0, "");
        anhTaiList.add(bangKieu);
        // Tạo đối tượng Tự Long
        ArrayList<String> ngheNghiep2 = new ArrayList<>();
        ngheNghiep2.add("Nghệ sĩ chèo");ngheNghiep2.add("Diễn viên");
        AnhTai tuLong = new AnhTai("Long the Legend", "Tự Long", "1973", 25, ngheNghiep2, 0, 0, 0,"");
        anhTaiList.add(tuLong);
        // Tạo đối tượng Đinh Tiến Đạt
        ArrayList<String> ngheNghiep3 = new ArrayList<>();
        ngheNghiep3.add("Rapper"); ngheNghiep3.add("Ca sĩ");
        ngheNghiep3.add("Vũ công"); ngheNghiep3.add("Doanh nhân");
        AnhTai dinhTienDat = new AnhTai("Dat RapMaster", "Đinh Tiến Đạt", "1981", 29, ngheNghiep3, 0, 0, 0,"");
        anhTaiList.add(dinhTienDat);
        // Tạo đối tượng Tiến Luật
        ArrayList<String> ngheNghiep4 = new ArrayList<>();
        ngheNghiep4.add("Diễn viên");
        AnhTai tienLuat = new AnhTai("Law the Star", "Tiến Luật", "1982", 25, ngheNghiep4, 0, 0, 0,""); anhTaiList.add(tienLuat);
        // Tạo đối tượng Đỗ Hoàng Hiệp
        ArrayList<String> ngheNghiep5 = new ArrayList<>();
        ngheNghiep5.add("Ca sĩ"); ngheNghiep5.add("Nhạc sĩ");
        AnhTai doHoangHiep = new AnhTai("Hiep Melody", "Đỗ Hoàng Hiệp", "1986", 28, ngheNghiep5, 0, 0, 0,"");
        anhTaiList.add(doHoangHiep);
        // Tạo đối tượng Thanh Duy
        ArrayList<String> ngheNghiep6 = new ArrayList<>();
        ngheNghiep6.add("Ca sĩ");
        AnhTai thanhDuy = new AnhTai("Duy Harmony", "Thanh Duy", "1986", 17, ngheNghiep6, 0, 0, 0,""); anhTaiList.add(thanhDuy);
        // Tạo đối tượng Quốc Thiên
        ArrayList<String> ngheNghiep7 = new ArrayList<>();
        ngheNghiep7.add("Ca sĩ");
        AnhTai quocThien = new AnhTai("Thien Vocalist", "Quốc Thiên", "1988", 16, ngheNghiep7, 0, 0, 0,"");
        anhTaiList.add(quocThien);
        // Tạo đối tượng Binz
        ArrayList<String> ngheNghiep8 = new ArrayList<>();
        ngheNghiep8.add("Rapper"); ngheNghiep8.add("Ca sĩ"); ngheNghiep8.add("Nhạc sĩ");
        AnhTai binz = new AnhTai("Binz the Poet", "Binz", "1988", 14, ngheNghiep8, 0, 0, 0,"");
        anhTaiList.add(binz);
        // Tạo đối tượng Cường Seven
        ArrayList<String> ngheNghiep9 = new ArrayList<>();
        ngheNghiep9.add("Ca sĩ"); ngheNghiep9.add("Diễn viên");
        AnhTai cuongSeven = new AnhTai("C7 Rockstar", "Cường Seven", "1989", 14, ngheNghiep9, 0, 0, 0,"");
        anhTaiList.add(cuongSeven);
        // Tạo đối tượng Jun Phạm
        ArrayList<String> ngheNghiep10 = new ArrayList<>();
        ngheNghiep10.add("Ca sĩ"); ngheNghiep10.add("Diễn viên");
        ngheNghiep10.add("MC"); ngheNghiep10.add("Nhà văn");
        AnhTai junPham = new AnhTai("Jun Multitalent", "Jun Phạm", "1989", 14, ngheNghiep10, 0, 0, 0,"");
        anhTaiList.add(junPham);
        // Tạo đối tượng BB Trần
        ArrayList<String> ngheNghiep11 = new ArrayList<>();
        ngheNghiep11.add("Diễn viên");
        AnhTai bbTran = new AnhTai("BB Trần", "Trần Phan Quốc Bảo", "1990", 15, ngheNghiep11, 0, 0, 0,"");
        anhTaiList.add(bbTran);
        // Tạo đối tượng S.T Sơn Thạch
        ArrayList<String> ngheNghiep12 = new ArrayList<>();
        ngheNghiep12.add("Ca sĩ"); ngheNghiep12.add("Diễn viên");
        ngheNghiep12.add("MC");
        AnhTai stSonThach = new AnhTai("ST the Performer", "S.T Sơn Thạch", "1990", 25, ngheNghiep12, 0, 0, 0,"");
        anhTaiList.add(stSonThach);
        // Tạo đối tượng Rhymastic
        ArrayList<String> ngheNghiep13 = new ArrayList<>();
        ngheNghiep13.add("Nhạc sĩ"); ngheNghiep13.add("Ca sĩ");
        ngheNghiep13.add("Rapper");
        AnhTai rhymastic = new AnhTai("Rhyme Genius", "Rhymastic", "1991", 15, ngheNghiep13, 0, 0, 0,"");
        anhTaiList.add(rhymastic);
        // Tạo đối tượng (S)TRONG Trọng Hiếu
        ArrayList<String> ngheNghiep14 = new ArrayList<>();
        ngheNghiep14.add("Ca sĩ"); ngheNghiep14.add("Vũ công");
        AnhTai trongHieu = new AnhTai("Hieu Dance King", "Trọng Hiếu", "1992", 9, ngheNghiep14, 0, 0, 0,"");
        anhTaiList.add(trongHieu);
        // Tạo đối tượng Soobin
        ArrayList<String> ngheNghiep15 = new ArrayList<>();
        ngheNghiep15.add("Ca sĩ"); ngheNghiep15.add("Nhạc sĩ");
        ngheNghiep15.add("Nhà sản xuất âm nhạc");
        AnhTai soobin = new AnhTai("Soobin Prodigy", "Soobin Hoàng Sơn", "1992", 14, ngheNghiep15, 0, 0, 0,"");
        anhTaiList.add(soobin);
        // Tạo đối tượng Kay Trần
        ArrayList<String> ngheNghiep16 = new ArrayList<>();
        ngheNghiep16.add("Ca sĩ"); ngheNghiep16.add("Rapper");
        ngheNghiep16.add("Vũ công");
        AnhTai kayTran = new AnhTai("Kay Dynamic", "Kay Trần", "1994", 10, ngheNghiep16, 0, 0, 0,"");
        anhTaiList.add(kayTran);
        // Tạo đối tượng Bùi Công Nam
        ArrayList<String> ngheNghiep17 = new ArrayList<>();
        ngheNghiep17.add("Ca sĩ"); ngheNghiep17.add("Nhạc sĩ");
        AnhTai buiCongNam = new AnhTai("Nam Melodist", "Bùi Công Nam", "1994", 7, ngheNghiep17, 0, 0, 0,"");
        anhTaiList.add(buiCongNam);
        // Phan Đình Tùng
        ArrayList<String> ngheNghiep18 = new ArrayList<>();
        ngheNghiep18.add("Ca sĩ"); ngheNghiep18.add("Nhạc sĩ");
        AnhTai phanDinhTung = new AnhTai("Tung Virtuoso", "Phan Đình Tùng", "1976", 25, ngheNghiep18, 0, 0, 0,"");
        anhTaiList.add(phanDinhTung);
        // Tuân Hưng
        ArrayList<String> ngheNghiep19 = new ArrayList<>();
        ngheNghiep19.add("Ca sĩ");
        AnhTai tuanHung = new AnhTai("Hung Vocal Power", "Tuấn Hưng", "1978", 29, ngheNghiep19, 0, 0,0, "");
        anhTaiList.add(tuanHung);
        //Hà Lê
        ArrayList<String> ngheNghiep20 = new ArrayList<>();
        ngheNghiep20.add("Ca sĩ");
        ngheNghiep20.add("Rapper"); ngheNghiep20.add("Vũ công");
        AnhTai haLe = new AnhTai("HaLe", "Hà Lê", "1984", 20, ngheNghiep20, 0, 0, 0,"");
        anhTaiList.add(haLe);
        //Thiên Minh
        ArrayList<String> ngheNghiep21 = new ArrayList<>();
        ngheNghiep21.add("Ca sĩ"); ngheNghiep21.add("Nhiếp ảnh gia");
        AnhTai thienMinh = new AnhTai("Minh the Artist", "Thiên Minh", "1990", 16, ngheNghiep21, 0, 0,0, "");
        anhTaiList.add(thienMinh);
        //Kiên Ưng
        ArrayList<String> ngheNghiep22 = new ArrayList<>();
        ngheNghiep22.add("Giám đốc sáng tạo"); ngheNghiep22.add("Đạo diễn");
        AnhTai kienUng = new AnhTai("Kien Visionary", "Kiên Ứng", "1992", 14, ngheNghiep22, 0, 0,0, "");
        anhTaiList.add(kienUng);
        //Duy Khanh
        ArrayList<String> ngheNghiep23 = new ArrayList<>();
        ngheNghiep23.add("Diễn viên"); ngheNghiep23.add("MC");
        AnhTai duyKhanh = new AnhTai("Khanh the Entertainer", "Duy Khánh", "1995",16, ngheNghiep23, 0, 0,0, "");
        anhTaiList.add(duyKhanh);

        // Trương Thế Vinh
        ArrayList<String> ngheNghiep24 = new ArrayList<>();
        ngheNghiep24.add("Ca sĩ"); ngheNghiep24.add("Diễn viên");
        AnhTai truongTheVinh = new AnhTai("Vinh Performer", "Trương Thế Vinh", "1984", 22, ngheNghiep24, 0, 0,0, "");
        anhTaiList.add(truongTheVinh);
        // Tăng Phúc
        ArrayList<String> ngheNghiep25 = new ArrayList<>();
        ngheNghiep25.add("Ca sĩ");
        AnhTai tangPhuc = new AnhTai("Phuc Smooth", "Tăng Phúc", "1990", 7, ngheNghiep25, 0, 0, 0,"");
        anhTaiList.add(tangPhuc);
        // Liên Bỉnh Phát
        ArrayList<String> ngheNghiep26 = new ArrayList<>();
        ngheNghiep26.add("Diễn viên");
        AnhTai lienBinhPhat = new AnhTai("Phat the Bold", "Liên Bỉnh Phát", "1990", 7, ngheNghiep26, 0, 0,0, ""); anhTaiList.add(lienBinhPhat);
        // Phạm Khánh Hưng
        ArrayList<String> ngheNghiep27 = new ArrayList<>();
        ngheNghiep27.add("Ca sĩ"); ngheNghiep27.add("Nhạc sĩ");
        AnhTai phamKhanhHung = new AnhTai("Hung the Composer", "Phạm Khánh Hưng", "1982", 25, ngheNghiep27, 0, 0,0, "");
        anhTaiList.add(phamKhanhHung);
        //Đăng Khôi
         ArrayList<String> ngheNghiep28 = new ArrayList<>();
         ngheNghiep28.add("Ca sĩ");
         AnhTai dangKhoi = new AnhTai("Khoi Vocal Star", "Đăng Khôi", "1983", 20, ngheNghiep28, 0,0,0, "");
         anhTaiList.add(dangKhoi);
         // Nguyễn Trần Duy Nhất
         ArrayList<String> ngheNghiep29 = new ArrayList<>();
         ngheNghiep29.add("Võ sĩ muay Thái");
         AnhTai nguyenTranDuyNhat = new AnhTai("Nhut the Warrior", "Nguyễn Trần Duy Nhất", "1989", 29, ngheNghiep29, 0, 0,0, "");
         anhTaiList.add(nguyenTranDuyNhat);
         // Neko Lê
         ArrayList<String> ngheNghiep30 = new ArrayList<>();
         ngheNghiep30.add("Đạo diễn"); ngheNghiep30.add("Rapper");
         AnhTai nekoLe = new AnhTai("Neko Creative", "Neko Lê", "1990", 15, ngheNghiep30, 0, 0, 0,"");
         anhTaiList.add(nekoLe);
         // Hồng Sơn
         ArrayList<String> ngheNghiep31 = new ArrayList<>();
         ngheNghiep31.add("Cầu thủ bóng đá");
         AnhTai hongSon = new AnhTai("Son the Legend", "Hồng Sơn", "1970", 35, ngheNghiep31, 0, 0, 0,"");
         anhTaiList.add(hongSon);
         // Thành Trung
         ArrayList<String> ngheNghiep32 = new ArrayList<>();
         ngheNghiep32.add("MC"); ngheNghiep32.add("Diễn viên");
         AnhTai thanhTrung = new AnhTai("Trung the Host", "Thành Trung", "1983", 21, ngheNghiep32, 0, 0,0, "");
         anhTaiList.add(thanhTrung);
         //HuyR
         ArrayList<String> ngheNghiep33 = new ArrayList<>();
         ngheNghiep33.add("Ca sĩ"); ngheNghiep33.add("Nhạc sĩ");
         AnhTai huyR = new AnhTai("HuyR the Melody Maker", "HuyR", "1995", 9, ngheNghiep33, 0, 0,0, "");
         anhTaiList.add(huyR);
         //Gia Huy
         ArrayList<String> ngheNghiep34 = new ArrayList<>();
         ngheNghiep34.add("Sinh Vien");
         AnhTai giaHuy = new AnhTai("HuyG", "Nguyễn Gia Huy", "2005", 14, ngheNghiep34, 0, 0,0, "");
         anhTaiList.add(giaHuy);
         //Lê Vân Trường
         ArrayList<String> ngheNghiep35 = new ArrayList<>();
         ngheNghiep35.add("Sinh Vien");
         AnhTai vanTruong = new AnhTai("Vân Trường MTP", "Lê Vân Trường", "2005", 14, ngheNghiep35, 0,0, 0, "");
         anhTaiList.add(vanTruong);
         // Thêm anh tài vào chương trình
         ATVNCG.setDsAnhTaiThamGia(anhTaiList);
     // SÂN KHẤU RA MẮT
        //nhóm anh tài huyền thoại
            //danh sach anh tai
        LinkedList<AnhTai> anhTaiHuyenThoai = new LinkedList<>();
        anhTaiHuyenThoai.add(tuanHung);
        anhTaiHuyenThoai.add(bangKieu);
        anhTaiHuyenThoai.add(tuLong);
        anhTaiHuyenThoai.add(hongSon);
            //bai hat trinh dien ca nhan
        BaiHat baiHat1 = new BaiHat("Quả táo vàng","Phúc Bồ",  "SlimV", null);
        BaiHat baiHat2 = new BaiHat("Hè muộn","Bằng Kiều",  "SlimV", null);
        BaiHat baiHat3 = new BaiHat("Tình đất","Tuấn Phương",  "SlimV", null);
        BaiHat baiHat4 = new BaiHat("Niềm tin chiến thắng","Lê Quang",  "SlimV", null);
        BaiHat baiHatChung1 = new BaiHat("Quê hương tuổi thơ tôi & Nếu có yêu tôi", "Từ Huy, Trần Duy Đức, Ngô Tịnh Yên", "SlimV", null);
        HashMap<AnhTai, BaiHat> baiHatRieng1 = new HashMap<>();
        baiHatRieng1.put(tuanHung,baiHat1);
        baiHatRieng1.put(bangKieu,baiHat2);
        baiHatRieng1.put(tuLong,baiHat3);
        baiHatRieng1.put(hongSon,baiHat4);
            // bang diem binh chon thanh vien
        HashMap<AnhTai, Integer> bangDiemCaNhanHuyenThoai = new HashMap<>();
        bangDiemCaNhanHuyenThoai.put(tuanHung,0);
        bangDiemCaNhanHuyenThoai.put(bangKieu,0);
        bangDiemCaNhanHuyenThoai.put(tuLong,0);
        bangDiemCaNhanHuyenThoai.put(hongSon,0);
            // danh sách thành viên bị loại
        ArrayList<AnhTai> dsAnhTaiHuyenThoaiLoai = new ArrayList<>();
        Nhom nhomAnhTaiHuyenThoai = new Nhom("Anh Tai Huyen Thoai", anhTaiHuyenThoai, baiHatRieng1, baiHatChung1, 0, bangDiemCaNhanHuyenThoai, dsAnhTaiHuyenThoaiLoai, null);
        //nhóm nam thần rực lửa
            //danh sach anh tai
        LinkedList<AnhTai> namThanRucLua = new LinkedList<>();
        namThanRucLua.add(kayTran);
        namThanRucLua.add(soobin);
        namThanRucLua.add(cuongSeven);
        namThanRucLua.add(kienUng);
        namThanRucLua.add(giaHuy);
        namThanRucLua.add(vanTruong);
            //Bai hat trinh dien
        BaiHat baiHat5 = new BaiHat("Đường vào tim em","Phúc Bồ",  "SlimV", null);
        BaiHat baiHat6 = new BaiHat("Giá như","Soobin",  "SlimV", null);
        BaiHat baiHat7 = new BaiHat("Quên lối về","Cường Seven",  "SlimV", null);
        BaiHat baiHat8 = new BaiHat("Diamond","Lil Wuyn",  "SlimV", null);
        BaiHat baiHat9 = new BaiHat("Dưới tán cây khô hoa nở","J97",  "J97", null);
        BaiHat baiHat10 = new BaiHat("Em cua ngay hom qua","Sơn tùng MTP",  "SlimV", null);
        BaiHat baiHatChung2 = new BaiHat("Nước hoa", "Hoàng Tôn", "Melyd K", null);
        HashMap<AnhTai, BaiHat> baiHatRieng2 = new HashMap<>();
        baiHatRieng2.put(kayTran,baiHat5);
        baiHatRieng2.put(soobin,baiHat6);
        baiHatRieng2.put(cuongSeven,baiHat7);
        baiHatRieng2.put(kienUng,baiHat8);
        baiHatRieng2.put(giaHuy,baiHat9);
        baiHatRieng2.put(vanTruong,baiHat10);
        // bang diem binh chon thanh vien
        HashMap<AnhTai, Integer> bangDiemCaNhanRucLua = new HashMap<>();
        bangDiemCaNhanHuyenThoai.put(tuanHung,0);
        bangDiemCaNhanHuyenThoai.put(bangKieu,0);
        bangDiemCaNhanHuyenThoai.put(tuLong,0);
        bangDiemCaNhanHuyenThoai.put(hongSon,0);
        // danh sách thành viên bị loại
        ArrayList<AnhTai> dsNamThanRucLuaLoai = new ArrayList<>();
        Nhom nhomNamThanRucLua= new Nhom("NamThanRucLua",namThanRucLua,baiHatRieng2,baiHatChung2,0,bangDiemCaNhanRucLua, dsNamThanRucLuaLoai, null);

        //nhóm anh tài sục sôi
        LinkedList<AnhTai> anhTaiSucSoi = new LinkedList<>();
        anhTaiSucSoi.add(phanDinhTung);
        anhTaiSucSoi.add(thanhTrung);
        anhTaiSucSoi.add(doHoangHiep);
        // Bài hát trình diễn cá nhân
        BaiHat baiHat11= new BaiHat("Bởi vì anh yêu em", "Phan Đinh Tùng", "SlimV", null);
        BaiHat baiHat12 = new BaiHat("Chiếc khăn gió ấm", "Nguyễn Văn Chung", "SlimV", null);
        BaiHat baiHat13 = new BaiHat("Trống vắng", "Quốc Hùng", "SlimV", null);
        // Bài hát chung
        BaiHat baiHatChung3 = new BaiHat("Đón bình minh", "Khắc Hưng", "SlimV", null);
        // Ghép bài hát cá nhân với các thành viên
        HashMap<AnhTai, BaiHat> baiHatRieng3 = new HashMap<>();
        baiHatRieng3.put(phanDinhTung, baiHat11);
        baiHatRieng3.put(thanhTrung, baiHat12);
        baiHatRieng3.put(doHoangHiep, baiHat13);
        // Bảng điểm cá nhân
        HashMap<AnhTai, Integer> bangDiemCaNhanSucSoi = new HashMap<>();
        bangDiemCaNhanSucSoi.put(phanDinhTung, 0);
        bangDiemCaNhanSucSoi.put(thanhTrung, 0);
        bangDiemCaNhanSucSoi.put(doHoangHiep, 0);
        // Danh sách thành viên bị loại
        ArrayList<AnhTai> dsAnhTaiSucSoiLoai = new ArrayList<>();
        // Tạo nhóm Anh Tài Sục Sôi
        Nhom nhomAnhTaiSucSoi = new Nhom("Anh Tài Sục Sôi", anhTaiSucSoi, baiHatRieng3, baiHatChung3, 0, bangDiemCaNhanSucSoi, dsAnhTaiSucSoiLoai, null);

        // Nhóm Anh Tài Bí Ẩn
        LinkedList<AnhTai> anhTaiBiAn = new LinkedList<>();
        anhTaiBiAn.add(trongHieu);
        anhTaiBiAn.add(stSonThach);
        anhTaiBiAn.add(thanhDuy);
        anhTaiBiAn.add(bbTran);
        anhTaiBiAn.add(nekoLe);
        // Bài hát trình diễn cá nhân
        BaiHat baiHat21 = new BaiHat("Rise Up", "(S)TRONG Trọng Hiếu, Scott Quinn, Ningyuan Jiang, Samuel Dick", "SlimV", null);
        BaiHat baiHat22 = new BaiHat("Thật xa thật gần", "Andiez Nam Trương", "SlimV", null);
        BaiHat baiHat23 = new BaiHat("Tình anh bán chiếu", "Thanh Duy", "SlimV", null);
        BaiHat baiHat24 = new BaiHat("Cánh hồng phai", "Dương Khắc Linh, Hoàng Huy Long", "SlimV", null);
        BaiHat baiHat25 = new BaiHat("Yêu em dại khờ", "Nguyên Jenda", "SlimV", null);
        // Bài hát chung
        BaiHat baiHatChung4 = new BaiHat("Người lạ ơi", "Châu Đăng Khoa", "SlimV", null);
        // Ghép bài hát cá nhân với các thành viên
        HashMap<AnhTai, BaiHat> baiHatRieng4 = new HashMap<>();
        baiHatRieng4.put(trongHieu, baiHat21);
        baiHatRieng4.put(stSonThach, baiHat22);
        baiHatRieng4.put(thanhDuy, baiHat23);
        baiHatRieng4.put(bbTran, baiHat24);
        baiHatRieng4.put(nekoLe, baiHat25);
        // Bảng điểm cá nhân
        HashMap<AnhTai, Integer> bangDiemCaNhanBiAn = new HashMap<>();
        bangDiemCaNhanBiAn.put(trongHieu, 0);
        bangDiemCaNhanBiAn.put(stSonThach, 0);
        bangDiemCaNhanBiAn.put(thanhDuy, 0);
        bangDiemCaNhanBiAn.put(bbTran, 0);
        bangDiemCaNhanBiAn.put(nekoLe, 0);
        // Danh sách thành viên bị loại
        ArrayList<AnhTai> dsAnhTaiBiAnLoai = new ArrayList<>();
        // Tạo nhóm Anh Tài Bí Ẩn
        Nhom nhomAnhTaiBiAn = new Nhom("Anh Tài Bí Ẩn", anhTaiBiAn, baiHatRieng4, baiHatChung4, 0, bangDiemCaNhanBiAn, dsAnhTaiBiAnLoai, null);
        // Nhóm Anh Tài Nham Thạch
        LinkedList<AnhTai> anhTaiNhamThach = new LinkedList<>();
        anhTaiNhamThach.add(binz);
        anhTaiNhamThach.add(rhymastic);
        anhTaiNhamThach.add(dinhTienDat);
        anhTaiNhamThach.add(haLe);
        // Bài hát trình diễn cá nhân
        BaiHat baiHat31 = new BaiHat("Men Cry", "Binz", "SlimV", null);
        BaiHat baiHat32 = new BaiHat("Lặng", "Rhymastic", "SlimV", null);
        BaiHat baiHat33 = new BaiHat("Tặng anh cho cô ấy", "Hứa Kim Tuyền, Hương Giang", "SlimV", null);
        BaiHat baiHat34 = new BaiHat("Quay lại giường đi em", "Khắc Hưng", "SlimV", null);
        // Bài hát chung
        BaiHat baiHatChung5 = new BaiHat("Khiến nó ngầu", "Rhymastic, Đinh Tiến Đạt, Binz", "SlimV", null);
        // Ghép bài hát cá nhân với các thành viên
        HashMap<AnhTai, BaiHat> baiHatRieng5 = new HashMap<>();
        baiHatRieng5.put(binz, baiHat31);
        baiHatRieng5.put(rhymastic, baiHat32);
        baiHatRieng5.put(dinhTienDat, baiHat33);
        baiHatRieng5.put(haLe, baiHat34);
        // Bảng điểm cá nhân
        HashMap<AnhTai, Integer> bangDiemCaNhanNhamThach = new HashMap<>();
        bangDiemCaNhanNhamThach.put(binz, 0);
        bangDiemCaNhanNhamThach.put(rhymastic, 0);
        bangDiemCaNhanNhamThach.put(dinhTienDat, 0);
        bangDiemCaNhanNhamThach.put(haLe, 0);
        // Danh sách thành viên bị loại
        ArrayList<AnhTai> dsAnhTaiNhamThachLoai = new ArrayList<>();
        // Tạo nhóm Anh Tài Nham Thạch
        Nhom nhomAnhTaiNhamThach = new Nhom("Anh Tài Nham Thạch", anhTaiNhamThach, baiHatRieng5, baiHatChung5, 0, bangDiemCaNhanNhamThach, dsAnhTaiNhamThachLoai, null);
        //Nhóm Thanh Xuân Học Đường
        LinkedList<AnhTai> thanhXuanHocDuong = new LinkedList<>();
        thanhXuanHocDuong.add(quocThien);
        thanhXuanHocDuong.add(phamKhanhHung);
        thanhXuanHocDuong.add(dangKhoi);
        // Bài hát trình diễn cá nhân
        BaiHat baiHatTX1 = new BaiHat("Hơn 1000 năm sau & Chia cách bình yên", "Trịnh Đình Quang, Tiên Cookie", "SlimV", null);
        BaiHat baiHatTX2 = new BaiHat("Biết làm sao để quên em & Không cần phải hứa đâu em", "Phạm Khánh Hưng", "SlimV", null);
        BaiHat baiHatTX3 = new BaiHat("Cô bé mùa đông & Thương thương yêu yêu", "Phạm Toàn Thắng, Lê Bá Vĩnh", "SlimV", null);
        // Bài hát chung
        BaiHat baiHatChungTX = new BaiHat("Sống tình", "Tuấn Khanh", "SlimV", null);
        // Ghép bài hát cá nhân với các thành viên
        HashMap<AnhTai, BaiHat> baiHatRiengTX = new HashMap<>();
        baiHatRiengTX.put(quocThien, baiHatTX1);
        baiHatRiengTX.put(phamKhanhHung, baiHatTX2);
        baiHatRiengTX.put(dangKhoi, baiHatTX3);
        // Bảng điểm cá nhân
        HashMap<AnhTai, Integer> bangDiemCaNhanTX = new HashMap<>();
        bangDiemCaNhanTX.put(quocThien, 0);
        bangDiemCaNhanTX.put(phamKhanhHung, 0);
        bangDiemCaNhanTX.put(dangKhoi, 0);
        // Danh sách thành viên bị loại
        ArrayList<AnhTai> dsAnhTaiTXLoai = new ArrayList<>();
        // Tạo nhóm Thanh Xuân Học Đường
        Nhom nhomThanhXuanHocDuong = new Nhom("Thanh Xuân Học Đường", thanhXuanHocDuong, baiHatRiengTX, baiHatChungTX, 0, bangDiemCaNhanTX, dsAnhTaiTXLoai, null);
        // Nhóm Anh Tài Đa Sắc
        LinkedList<AnhTai> anhTaiDaSac = new LinkedList<>();
        anhTaiDaSac.add(duyKhanh);
        anhTaiDaSac.add(tangPhuc);
        anhTaiDaSac.add(buiCongNam);
        anhTaiDaSac.add(huyR);
        anhTaiDaSac.add(junPham);
        anhTaiDaSac.add(thienMinh);
        // Bài hát trình diễn cá nhân
        BaiHat baiHatDS1 = new BaiHat("Think of You", "Thu Thủy, Pháo", "SlimV", null);
        BaiHat baiHatDS2 = new BaiHat("Đừng chờ anh nữa", "Huỳnh Quốc Huy, Tony Việt", "SlimV", null);
        BaiHat baiHatDS3 = new BaiHat("Chúa tể", "Bùi Công Nam", "SlimV", null);
        BaiHat baiHatDS4 = new BaiHat("Cô gái M52 & Anh thanh niên", "HuyR, Tùng Vũ", "SlimV", null);
        BaiHat baiHatDS5 = new BaiHat("Tản thời", "Huỳnh Hiền Năng", "SlimV", null);
        BaiHat baiHatDS6 = new BaiHat("Cho em đi & Đôi mắt", "Wanbi Tuấn Anh, Nguyễn Hải Phong", "SlimV", null);
        // Bài hát chung
        BaiHat baiHatChungDS = new BaiHat("Anh nhà ở đâu thế?", "Lynk Lee, B Ray", "SlimV", null);
        // Ghép bài hát cá nhân với các thành viên
        HashMap<AnhTai, BaiHat> baiHatRiengDS = new HashMap<>();
        baiHatRiengDS.put(duyKhanh, baiHatDS1);
        baiHatRiengDS.put(tangPhuc, baiHatDS2);
        baiHatRiengDS.put(buiCongNam, baiHatDS3);
        baiHatRiengDS.put(huyR, baiHatDS4);
        baiHatRiengDS.put(junPham, baiHatDS5);
        baiHatRiengDS.put(thienMinh, baiHatDS6);
        // Bảng điểm cá nhân
        HashMap<AnhTai, Integer> bangDiemCaNhanDS = new HashMap<>();
        bangDiemCaNhanDS.put(duyKhanh, 0);
        bangDiemCaNhanDS.put(tangPhuc, 0);
        bangDiemCaNhanDS.put(buiCongNam, 0);
        bangDiemCaNhanDS.put(huyR, 0);
        bangDiemCaNhanDS.put(junPham, 0);
        bangDiemCaNhanDS.put(thienMinh, 0);
        // Danh sách thành viên bị loại
        ArrayList<AnhTai> dsAnhTaiDSLoai = new ArrayList<>();
        // Tạo nhóm Anh Tài Đa Sắc
        Nhom nhomAnhTaiDaSac = new Nhom("Anh Tài Đa Sắc", anhTaiDaSac, baiHatRiengDS, baiHatChungDS, 0, bangDiemCaNhanDS, dsAnhTaiDSLoai, null);
        // Nhóm Quý Ông Đa Tình
        LinkedList<AnhTai> quyOngDaTinh = new LinkedList<>();
        quyOngDaTinh.add(truongTheVinh);
        quyOngDaTinh.add(lienBinhPhat);
        quyOngDaTinh.add(nguyenTranDuyNhat);
        // Bài hát trình diễn cá nhân
        BaiHat baiHatQT1 = new BaiHat("Cánh hoa rơi & Phận má hồng", "Phạm Việt Hoàng", "SlimV", null);
        BaiHat baiHatQT2 = new BaiHat("Từng yêu", "Nguyễn Đình Dũng", "SlimV", null);
        BaiHat baiHatQT3 = new BaiHat("Vì anh thương em (Vô cùng)", "Võ Hoài Phúc, Nguyễn Tuấn Anh", "SlimV", null);
        // Bài hát chung
        BaiHat baiHatChungQT = new BaiHat("Phía sau một cô gái", "Tiên Cookie", "SlimV", null);
        // Ghép bài hát cá nhân với các thành viên
        HashMap<AnhTai, BaiHat> baiHatRiengQT = new HashMap<>();
        baiHatRiengQT.put(truongTheVinh, baiHatQT1);
        baiHatRiengQT.put(lienBinhPhat, baiHatQT2);
        baiHatRiengQT.put(nguyenTranDuyNhat, baiHatQT3);
        // Bảng điểm cá nhân
        HashMap<AnhTai, Integer> bangDiemCaNhanQT = new HashMap<>();
        bangDiemCaNhanQT.put(truongTheVinh, 0);
        bangDiemCaNhanQT.put(lienBinhPhat, 0);
        bangDiemCaNhanQT.put(nguyenTranDuyNhat, 0);
        // Danh sách thành viên bị loại
        ArrayList<AnhTai> dsAnhTaiQTLoai = new ArrayList<>();
        // Tạo nhóm Quý Ông Đa Tình
        Nhom nhomQuyOngDaTinh = new Nhom("Quý Ông Đa Tình", quyOngDaTinh, baiHatRiengQT, baiHatChungQT, 0, bangDiemCaNhanQT, dsAnhTaiQTLoai, null);
//        System.out.println(anhTaiList);
        //CÔNG DIỄN 1
        LinkedList<AnhTai> dsAnhTaiBiLoai = new LinkedList<>();
        HashMap<String, Integer> bangDiemBinhChonCaNhan = new HashMap<>();
        HashMap<String, Integer> bangDiemHoaLucCaNhan = new HashMap<>();
        //Danh sách các nhóm
        ArrayList<Nhom> dsNhom = new ArrayList<>();
        dsNhom.add(nhomAnhTaiHuyenThoai);
        dsNhom.add(nhomAnhTaiBiAn);
        dsNhom.add(nhomAnhTaiDaSac);
        dsNhom.add(nhomAnhTaiSucSoi);
        dsNhom.add(nhomQuyOngDaTinh);
        dsNhom.add(nhomAnhTaiNhamThach);
        dsNhom.add(nhomThanhXuanHocDuong);
        dsNhom.add(nhomNamThanRucLua);
        CongDien raMatSanKhau = new CongDien("1", "Who Am I",dsNhom, "vote", dsAnhTaiBiLoai, bangDiemBinhChonCaNhan, bangDiemHoaLucCaNhan);
        bangKieu.setDiem(470,13);
        tuanHung.setDiem(1260, 18);
        soobin.setDiem(1190, 48);
        phanDinhTung.setDiem(1390,14);
        bbTran.setDiem(880,58);
        binz.setDiem(1290,41);
        quocThien.setDiem(1390, 24);
        junPham.setDiem(1170,55);
        tienLuat.setDiem(960,46);
        kayTran.setDiem(1100,52);
        cuongSeven.setDiem(440,23);
        lienBinhPhat.setDiem(680,25);
        duyKhanh.setDiem(710,44);
        stSonThach.setDiem(810,45);
        dinhTienDat.setDiem(340,21);
        rhymastic.setDiem(970,33);
        thanhDuy.setDiem(460, 25);
        vanTruong.setDiem(1000,52);
        giaHuy.setDiem(1128,52);
        thanhTrung.setDiem(1050,8);
        doHoangHiep.setDiem(520,10);
        huyR.setDiem(230,13);
        hongSon.setDiem(390,13);
        phamKhanhHung.setDiem(550,14);
        haLe.setDiem(330,16);
        tuLong.setDiem(830,16);
        tangPhuc.setDiem(480,19);
        nguyenTranDuyNhat.setDiem(440,20);
        buiCongNam.setDiem(460,22);
        dangKhoi.setDiem(1150,22);
        trongHieu.setDiem(300,23);
        kienUng.setDiem(230,26);
        nekoLe.setDiem(510,38);
        thienMinh.setDiem(470,26);
        truongTheVinh.setDiem(530,37);
        raMatSanKhau.themDiem(anhTaiList, dsNhom);
        System.out.println(dsNhom.size());
        System.out.println(anhTaiList);



    }
}
