package anhtraivuotnganchonggai;


import java.lang.classfile.instruction.SwitchCase;
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
        ArrayList<BaiHat> dsBaiHatChung1 = new ArrayList<BaiHat>();
        dsBaiHatChung1.add(baiHatChung1);
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

        Nhom nhomAnhTaiHuyenThoai = new Nhom("Anh Tai Huyen Thoai", anhTaiHuyenThoai,dsBaiHatChung1, 0, bangDiemCaNhanHuyenThoai, null);
        nhomAnhTaiHuyenThoai.setBaiHatRieng(baiHatRieng1);
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
        ArrayList<BaiHat> dsBaiHatChung2 = new ArrayList<BaiHat>();
        dsBaiHatChung2.add(baiHatChung2);
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
       
        Nhom nhomNamThanRucLua= new Nhom("NamThanRucLua",namThanRucLua,dsBaiHatChung2,0,bangDiemCaNhanRucLua,  null);
        nhomNamThanRucLua.setBaiHatRieng(baiHatRieng2);
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
        ArrayList<BaiHat> dsBaiHatChung3 = new ArrayList<BaiHat>();
        dsBaiHatChung3.add(baiHatChung3);
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
        
        // Tạo nhóm Anh Tài Sục Sôi
        Nhom nhomAnhTaiSucSoi = new Nhom("Anh Tài Sục Sôi", anhTaiSucSoi, dsBaiHatChung3, 0, bangDiemCaNhanSucSoi, null);
        nhomAnhTaiSucSoi.setBaiHatRieng(baiHatRieng3);
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
        ArrayList<BaiHat> dsBaiHatChung4 = new ArrayList<BaiHat>();
        dsBaiHatChung4.add(baiHatChung4);
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
 
        // Tạo nhóm Anh Tài Bí Ẩn
        Nhom nhomAnhTaiBiAn = new Nhom("Anh Tài Bí Ẩn", anhTaiBiAn, dsBaiHatChung4, 0, bangDiemCaNhanBiAn, null);
        nhomAnhTaiBiAn.setBaiHatRieng(baiHatRieng4);
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
        ArrayList<BaiHat> dsBaiHatChung5 = new ArrayList<BaiHat>();
        dsBaiHatChung5.add(baiHatChung5);
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
  
        // Tạo nhóm Anh Tài Nham Thạch
        Nhom nhomAnhTaiNhamThach = new Nhom("Anh Tài Nham Thạch", anhTaiNhamThach, dsBaiHatChung5, 0, bangDiemCaNhanNhamThach,  null);
        nhomAnhTaiNhamThach.setBaiHatRieng(baiHatRieng5);
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
        ArrayList<BaiHat> dsBaiHatChungTX = new ArrayList<BaiHat>();
        dsBaiHatChungTX.add(baiHatChungTX);
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
        // Tạo nhóm Thanh Xuân Học Đường
        Nhom nhomThanhXuanHocDuong = new Nhom("Thanh Xuân Học Đường", thanhXuanHocDuong, dsBaiHatChungTX, 0, bangDiemCaNhanTX, null);
        nhomThanhXuanHocDuong.setBaiHatRieng(baiHatRiengTX);
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
        ArrayList<BaiHat> dsBaiHatChungDS = new ArrayList<BaiHat>();
        dsBaiHatChungDS.add(baiHatChungDS);
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
   
        // Tạo nhóm Anh Tài Đa Sắc
        Nhom nhomAnhTaiDaSac = new Nhom("Anh Tài Đa Sắc", anhTaiDaSac, dsBaiHatChungDS, 0, bangDiemCaNhanDS, null);
        nhomAnhTaiDaSac.setBaiHatRieng(baiHatRiengDS);
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
        ArrayList<BaiHat> dsBaiHatChung = new ArrayList<BaiHat>();
        dsBaiHatChung.add(baiHatChungQT);
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
        // Tạo nhóm Quý Ông Đa Tình
        Nhom nhomQuyOngDaTinh = new Nhom("Quý Ông Đa Tình", quyOngDaTinh, dsBaiHatChung, 0, bangDiemCaNhanQT, null);
        nhomQuyOngDaTinh.setBaiHatRieng(baiHatRiengQT);
        //CÔNG DIỄN RA MẮT
        HashMap<String, Integer> bangDiemBinhChonCaNhan = new HashMap<>();
        for (AnhTai anhtai : anhTaiList) {
        	bangDiemBinhChonCaNhan.put(anhtai.getTenAnhTai(),anhtai.getDiemBinhChon());
        }
        HashMap<String, Integer> bangDiemHoaLucCaNhan = new HashMap<>();
        for (AnhTai anhtai : anhTaiList) {
        	bangDiemBinhChonCaNhan.put(anhtai.getTenAnhTai(),anhtai.getDiemHoaLuc());
        }
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
        CongDien raMatSanKhau = new CongDien("0", "Who Am I",dsNhom, "vote", bangDiemBinhChonCaNhan, bangDiemHoaLucCaNhan);
        bangKieu.setDiem(470,13);
        tuanHung.setDiem(1260, 48);
        soobin.setDiem(1190, 78);
        phanDinhTung.setDiem(1390,44);
        bbTran.setDiem(880,88);
        binz.setDiem(1290,71);
        quocThien.setDiem(1390, 54);
        junPham.setDiem(1170,85);
        tienLuat.setDiem(960,76);
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
        System.out.println("////////////////////////VÒNG RA MẮT///////////////////////////");
        System.out.printf("%-20s | %-15s | %-20s%n", "Tên Anh Tài", "Điểm Bình Chọn", "Điểm Hỏa Lực Cá Nhân");
        System.out.println("--------------------------------------------------------------");

     
        for (AnhTai anhtai : anhTaiList) {
            System.out.printf("%-20s | %-15d | %-20d%n",
                anhtai.getTenAnhTai(),
                anhtai.getDiemBinhChon(),
                anhtai.getDiemHoaLuc()
            );
        }
     
        //CÔNG DIỄN 1
        
        System.out.println("////////////////////////CÔNG DIỄN 1///////////////////////////");
        	//Nhà Đam Mê
        	LinkedList<AnhTai> dsDamMe = new LinkedList<AnhTai>();
        	dsDamMe.add(tuanHung);
        	dsDamMe.add(nguyenTranDuyNhat);
        	dsDamMe.add(lienBinhPhat);
        	dsDamMe.add(trongHieu);
        	BaiHat baiHatDM = new BaiHat("Ba kể con nghe & Dưới ánh đèn sân khấu", "Nguyễn Hải Phong, Hứa Kim Tuyền, Charles, Trọng Hiếu", "SlimV", null);
        	ArrayList<BaiHat> dsBaiHatChungDM = new ArrayList<BaiHat>();
        	dsBaiHatChungDM.add(baiHatDM);
        	HashMap<AnhTai, Integer> bangDiemCaNhanDM = new HashMap<>();
			for (AnhTai anhtai : dsDamMe){
        		bangDiemCaNhanDM.put(anhtai, anhtai.getDiemHoaLuc());
        	}
	
        	Nhom nhaDamMe = new Nhom("Đam Mê", dsDamMe, dsBaiHatChungDM, 2330, bangDiemCaNhanDM, trongHieu);
        	// Nhà Hát
        	LinkedList<AnhTai> dsHat = new LinkedList<AnhTai>();
        	dsHat.add(thanhTrung);
        	dsHat.add(haLe);
        	dsHat.add(doHoangHiep);
        	dsHat.add(quocThien);
        	dsHat.add(kienUng);
        	BaiHat baiHatHat = new BaiHat("Một lần dang dở & Đi qua cầu vồng", "Nhật Ngân, Mặc Thế Nhân, Phúc Bồ, Rick, Hà Lê, Đỗ Hoàng Hiệp, Kiên Ưng", "SlimV", null);
        	ArrayList<BaiHat> dsBaiHatChungHat = new ArrayList<BaiHat>();
        	dsBaiHatChungHat.add(baiHatHat);
        	HashMap<AnhTai, Integer> bangDiemCaNhanHat = new HashMap<>();
        	for (AnhTai anhtai : dsHat){
        	    bangDiemCaNhanHat.put(anhtai, anhtai.getDiemHoaLuc());
        	}
        	Nhom nhaHat = new Nhom("Hát", dsHat, dsBaiHatChungHat, 1970, bangDiemCaNhanHat, thanhTrung);

        	// Nhà Ngũ Hành
        	LinkedList<AnhTai> dsNguHanh = new LinkedList<AnhTai>();
        	dsNguHanh.add(phamKhanhHung);
        	dsNguHanh.add(truongTheVinh);
        	dsNguHanh.add(junPham);
        	dsNguHanh.add(bbTran);
        	dsNguHanh.add(huyR);
        	BaiHat baiHatNguHanh = new BaiHat("Vợ người ta & Chuyện ba người", "Phan Mạnh Quỳnh, Quốc Dũng, HuyR", "SlimV", null);
        	ArrayList<BaiHat> dsBaiHatChungNguHanh = new ArrayList<BaiHat>();
        	dsBaiHatChungNguHanh.add(baiHatNguHanh);
        	HashMap<AnhTai, Integer> bangDiemCaNhanNguHanh = new HashMap<>();
        	for (AnhTai anhtai : dsNguHanh){
        	    bangDiemCaNhanNguHanh.put(anhtai, anhtai.getDiemHoaLuc());
        	}
        	Nhom nhaNguHanh = new Nhom("Ngũ Hành", dsNguHanh, dsBaiHatChungNguHanh, 2470, bangDiemCaNhanNguHanh, junPham);

        	// Nhà Tái Sinh
        	LinkedList<AnhTai> dsTaiSinh = new LinkedList<AnhTai>();
        	dsTaiSinh.add(dinhTienDat);
        	dsTaiSinh.add(tienLuat);
        	dsTaiSinh.add(rhymastic);
        	dsTaiSinh.add(tuLong);
        	BaiHat baiHatTaiSinh = new BaiHat("Lột xác & Chuyện nhỏ", "Nguyễn Hải Phong, Tuấn Khanh, Rhymastic", "SlimV", null);
        	ArrayList<BaiHat> dsBaiHatChungTaiSinh = new ArrayList<BaiHat>();
        	dsBaiHatChungTaiSinh.add(baiHatTaiSinh);
        	HashMap<AnhTai, Integer> bangDiemCaNhanTaiSinh = new HashMap<>();
        	for (AnhTai anhtai : dsTaiSinh){
        	    bangDiemCaNhanTaiSinh.put(anhtai, anhtai.getDiemHoaLuc());
        	}
        	Nhom nhaTaiSinh = new Nhom("Tái Sinh", dsTaiSinh, dsBaiHatChungTaiSinh, 1580, bangDiemCaNhanTaiSinh, dinhTienDat);

        	// Nhà Sao Sáng
        	LinkedList<AnhTai> dsSaoSang = new LinkedList<AnhTai>();
        	dsSaoSang.add(cuongSeven);
        	dsSaoSang.add(soobin);
        	dsSaoSang.add(hongSon);
        	BaiHat baiHatSaoSang = new BaiHat("Trống cơm", "Dân ca Bắc Bộ, Charles, APJ, Soobin", "SlimV", null);
        	ArrayList<BaiHat> dsBaiHatChungSaoSang = new ArrayList<BaiHat>();
        	dsBaiHatChungSaoSang.add(baiHatSaoSang);
        	HashMap<AnhTai, Integer> bangDiemCaNhanSaoSang = new HashMap<>();
        	for (AnhTai anhtai : dsSaoSang){
        	    bangDiemCaNhanSaoSang.put(anhtai, anhtai.getDiemHoaLuc());
        	}
        	Nhom nhaSaoSang = new Nhom("Sao Sáng", dsSaoSang, dsBaiHatChungSaoSang, 1860, bangDiemCaNhanSaoSang, cuongSeven);

        	// Nhà Xuân Hạ Thu Đông
        	LinkedList<AnhTai> dsXuanHaThuDong = new LinkedList<AnhTai>();
        	dsXuanHaThuDong.add(bangKieu);
        	dsXuanHaThuDong.add(binz);
        	dsXuanHaThuDong.add(stSonThach);
        	BaiHat baiHatXuanHaThuDong = new BaiHat("Tỉnh thức sau giấc ngủ đông", "Kai Đinh, Grey D, Binz", "SlimV", null);
        	ArrayList<BaiHat> dsBaiHatChungXuanHaThuDong = new ArrayList<BaiHat>();
        	dsBaiHatChungXuanHaThuDong.add(baiHatXuanHaThuDong);
        	HashMap<AnhTai, Integer> bangDiemCaNhanXuanHaThuDong = new HashMap<>();
        	for (AnhTai anhtai : dsXuanHaThuDong){
        	    bangDiemCaNhanXuanHaThuDong.put(anhtai, anhtai.getDiemHoaLuc());
        	}
        	Nhom nhaXuanHaThuDong = new Nhom("Xuân Hạ Thu Đông", dsXuanHaThuDong, dsBaiHatChungXuanHaThuDong, 1830, bangDiemCaNhanXuanHaThuDong, bangKieu);

        	// Nhà KK
        	LinkedList<AnhTai> dsKK = new LinkedList<AnhTai>();
        	dsKK.add(phanDinhTung);
        	dsKK.add(dangKhoi);
        	dsKK.add(nekoLe);
        	dsKK.add(tangPhuc);
        	dsKK.add(kayTran);
        	BaiHat baiHatKK = new BaiHat("Dịu dàng đến từng phút giây & Bước đến bên em", "Lương Bằng Quang, Khắc Hưng, Neko Lê, Kay Trần", "SlimV", null);
        	ArrayList<BaiHat> dsBaiHatChungKK = new ArrayList<BaiHat>();
        	dsBaiHatChungKK.add(baiHatKK);
        	HashMap<AnhTai, Integer> bangDiemCaNhanKK = new HashMap<>();
        	for (AnhTai anhtai : dsKK){
        	    bangDiemCaNhanKK.put(anhtai, anhtai.getDiemHoaLuc());
        	}
        	Nhom nhaKK = new Nhom("KK", dsKK, dsBaiHatChungKK, 1260, bangDiemCaNhanKK, phanDinhTung);

        	// Nhà Xương Rồng
        	LinkedList<AnhTai> dsXuongRong = new LinkedList<AnhTai>();
        	dsXuongRong.add(thienMinh);
        	dsXuongRong.add(thanhDuy);
        	dsXuongRong.add(buiCongNam);
        	dsXuongRong.add(duyKhanh);
        	BaiHat baiHatXuongRong = new BaiHat("Áo mùa đông & Trở về", "Đỗ Nhuận, Dương Thụ, Bùi Công Nam", "SlimV", null);
        	ArrayList<BaiHat> dsBaiHatChungXuongRong = new ArrayList<BaiHat>();
        	dsBaiHatChungXuongRong.add(baiHatXuongRong);
        	HashMap<AnhTai, Integer> bangDiemCaNhanXuongRong = new HashMap<>();
        	for (AnhTai anhtai : dsXuongRong){
        	    bangDiemCaNhanXuongRong.put(anhtai, anhtai.getDiemHoaLuc());
        	}
        	Nhom nhaXuongRong = new Nhom("Xương Rồng", dsXuongRong, dsBaiHatChungXuongRong, 1600, bangDiemCaNhanXuongRong, duyKhanh);
        	ArrayList<Nhom> dsNhaCD1 = new ArrayList<Nhom>();
        	dsNhaCD1.add(nhaDamMe);
        	dsNhaCD1.add(nhaHat);
        	dsNhaCD1.add(nhaKK);
        	dsNhaCD1.add(nhaNguHanh);
        	dsNhaCD1.add(nhaSaoSang);
        	dsNhaCD1.add(nhaTaiSinh);
        	dsNhaCD1.add(nhaXuanHaThuDong);
        	dsNhaCD1.add(nhaXuongRong);
        	CongDien CongDien1 = new CongDien("1", "Người thiếu niên thuở nào",dsNhaCD1, "vote", bangDiemBinhChonCaNhan, bangDiemHoaLucCaNhan);
        	System.out.printf("| %-15s | %-105s | %-50s | %-12s | %-12s |\n", "Tên nhà", "Bài hát biểu diễn (Tác giả)", "Thành viên", "Điểm ban đầu", "Điểm cuối cùng");
        	for(Nhom nha : dsNhaCD1) {
        		int diemCuoiCung= 0;
        		for (AnhTai anhtai : nha.getDsAnhTai()) {
        			int diemBanDau = nha.getDiemBinhChon();
        		
        		
        			switch (nha.getTenNhom()){
        				case "Đam mê":
	        				diemCuoiCung = 760;
	        				break;
        				case "Hát":
        					diemCuoiCung = 650;
        					break;
        				case "KK":
        					diemCuoiCung = 1060;
        					break;
        				case "Ngũ Hành":
        					diemCuoiCung = 1660;
        					break;
        				case "Sao Sáng":
        					diemCuoiCung = 1490;
        					break;
        				case "Tái Sinh":
        					diemCuoiCung = 900;
        					break;
        				case "Xuân Hạ Thu Đông":
        					diemCuoiCung = 1680;
        					break;
        				case "Xương Rồng":
        					diemCuoiCung = 1750;
        					break;
        			}
        			System.out.printf("| %-15s | %-60s | %-50s | %-12d | %-14d |\n",
                            nha.getTenNhom(),
                            nha.getBaiHatChung(),
                            anhtai.getTenAnhTai(),
                            diemBanDau,
                            diemCuoiCung);
        		}
				nha.setDiemBinhChon(diemCuoiCung);
        	}

    }
}
