package Exercise1.src.anhtraivuotnganchonggai;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<AnhTai> anhTaiList = new ArrayList<>();
        // Tạo đối tượng Bằng Kiều
        ArrayList<String> ngheNghiep1 = new ArrayList<>();
        ngheNghiep1.add("Ca sĩ"); AnhTai bangKieu = new AnhTai("Kieu the Idol", "Bằng Kiều", "1973", 35, ngheNghiep1, 0, 0, "");
        anhTaiList.add(bangKieu);
        // Tạo đối tượng Tự Long
        ArrayList<String> ngheNghiep2 = new ArrayList<>();
        ngheNghiep2.add("Nghệ sĩ chèo");ngheNghiep2.add("Diễn viên");
        AnhTai tuLong = new AnhTai("Long the Legend", "Tự Long", "1973", 25, ngheNghiep2, 0, 0, "");
        anhTaiList.add(tuLong);
        // Tạo đối tượng Đinh Tiến Đạt
        ArrayList<String> ngheNghiep3 = new ArrayList<>();
        ngheNghiep3.add("Rapper"); ngheNghiep3.add("Ca sĩ");
        ngheNghiep3.add("Vũ công"); ngheNghiep3.add("Doanh nhân");
        AnhTai dinhTienDat = new AnhTai("Dat RapMaster", "Đinh Tiến Đạt", "1981", 29, ngheNghiep3, 0, 0, "");
        anhTaiList.add(dinhTienDat);
        // Tạo đối tượng Tiến Luật
        ArrayList<String> ngheNghiep4 = new ArrayList<>();
        ngheNghiep4.add("Diễn viên");
        AnhTai tienLuat = new AnhTai("Law the Star", "Tiến Luật", "1982", 25, ngheNghiep4, 0, 0, ""); anhTaiList.add(tienLuat);
        // Tạo đối tượng Đỗ Hoàng Hiệp
        ArrayList<String> ngheNghiep5 = new ArrayList<>();
        ngheNghiep5.add("Ca sĩ"); ngheNghiep5.add("Nhạc sĩ");
        AnhTai doHoangHiep = new AnhTai("Hiep Melody", "Đỗ Hoàng Hiệp", "1986", 28, ngheNghiep5, 0, 0, "");
        anhTaiList.add(doHoangHiep);
        // Tạo đối tượng Thanh Duy
        ArrayList<String> ngheNghiep6 = new ArrayList<>();
        ngheNghiep6.add("Ca sĩ");
        AnhTai thanhDuy = new AnhTai("Duy Harmony", "Thanh Duy", "1986", 17, ngheNghiep6, 0, 0, ""); anhTaiList.add(thanhDuy);
        // Tạo đối tượng Quốc Thiên
        ArrayList<String> ngheNghiep7 = new ArrayList<>();
        ngheNghiep7.add("Ca sĩ");
        AnhTai quocThien = new AnhTai("Thien Vocalist", "Quốc Thiên", "1988", 16, ngheNghiep7, 0, 0, "");
        anhTaiList.add(quocThien);
        // Tạo đối tượng Binz
        ArrayList<String> ngheNghiep8 = new ArrayList<>();
        ngheNghiep8.add("Rapper"); ngheNghiep8.add("Ca sĩ"); ngheNghiep8.add("Nhạc sĩ");
        AnhTai binz = new AnhTai("Binz the Poet", "Binz", "1988", 14, ngheNghiep8, 0, 0, "");
        anhTaiList.add(binz);
        // Tạo đối tượng Cường Seven
        ArrayList<String> ngheNghiep9 = new ArrayList<>();
        ngheNghiep9.add("Ca sĩ"); ngheNghiep9.add("Diễn viên");
        AnhTai cuongSeven = new AnhTai("C7 Rockstar", "Cường Seven", "1989", 14, ngheNghiep9, 0, 0, "");
        anhTaiList.add(cuongSeven);
        // Tạo đối tượng Jun Phạm
        ArrayList<String> ngheNghiep10 = new ArrayList<>();
        ngheNghiep10.add("Ca sĩ"); ngheNghiep10.add("Diễn viên");
        ngheNghiep10.add("MC"); ngheNghiep10.add("Nhà văn");
        AnhTai junPham = new AnhTai("Jun Multitalent", "Jun Phạm", "1989", 14, ngheNghiep10, 0, 0, "");
        anhTaiList.add(junPham);
        // Tạo đối tượng BB Trần
        ArrayList<String> ngheNghiep11 = new ArrayList<>();
        ngheNghiep11.add("Diễn viên");
        AnhTai bbTran = new AnhTai("Tran Charisma", "BB Trần", "1990", 15, ngheNghiep11, 0, 0, "");
        anhTaiList.add(bbTran);
        // Tạo đối tượng S.T Sơn Thạch
        ArrayList<String> ngheNghiep12 = new ArrayList<>();
        ngheNghiep12.add("Ca sĩ"); ngheNghiep12.add("Diễn viên");
        ngheNghiep12.add("MC");
        AnhTai stSonThach = new AnhTai("ST the Performer", "S.T Sơn Thạch", "1990", 25, ngheNghiep12, 0, 0, "");
        anhTaiList.add(stSonThach);
        // Tạo đối tượng Rhymastic
        ArrayList<String> ngheNghiep13 = new ArrayList<>();
        ngheNghiep13.add("Nhạc sĩ"); ngheNghiep13.add("Ca sĩ");
        ngheNghiep13.add("Rapper");
        AnhTai rhymastic = new AnhTai("Rhyme Genius", "Rhymastic", "1991", 15, ngheNghiep13, 0, 0, "");
        anhTaiList.add(rhymastic);
        // Tạo đối tượng (S)TRONG Trọng Hiếu
        ArrayList<String> ngheNghiep14 = new ArrayList<>();
        ngheNghiep14.add("Ca sĩ"); ngheNghiep14.add("Vũ công");
        AnhTai trongHieu = new AnhTai("Hieu Dance King", "Trọng Hiếu", "1992", 9, ngheNghiep14, 0, 0, "");
        anhTaiList.add(trongHieu);
        // Tạo đối tượng Soobin
        ArrayList<String> ngheNghiep15 = new ArrayList<>();
        ngheNghiep15.add("Ca sĩ"); ngheNghiep15.add("Nhạc sĩ");
        ngheNghiep15.add("Nhà sản xuất âm nhạc");
        AnhTai soobin = new AnhTai("Soobin Prodigy", "Soobin Hoàng Sơn", "1992", 14, ngheNghiep15, 0, 0, "");
        anhTaiList.add(soobin);
        // Tạo đối tượng Kay Trần
        ArrayList<String> ngheNghiep16 = new ArrayList<>();
        ngheNghiep16.add("Ca sĩ"); ngheNghiep16.add("Rapper");
        ngheNghiep16.add("Vũ công");
        AnhTai kayTran = new AnhTai("Kay Dynamic", "Kay Trần", "1994", 10, ngheNghiep16, 0, 0, "");
        anhTaiList.add(kayTran);
        // Tạo đối tượng Bùi Công Nam
        ArrayList<String> ngheNghiep17 = new ArrayList<>();
        ngheNghiep17.add("Ca sĩ"); ngheNghiep17.add("Nhạc sĩ");
        AnhTai buiCongNam = new AnhTai("Nam Melodist", "Bùi Công Nam", "1994", 7, ngheNghiep17, 0, 0, "");
        anhTaiList.add(buiCongNam);
        // Phan Đình Tùng
        ArrayList<String> ngheNghiep18 = new ArrayList<>();
        ngheNghiep18.add("Ca sĩ"); ngheNghiep18.add("Nhạc sĩ");
        AnhTai phanDinhTung = new AnhTai("Tung Virtuoso", "Phan Đình Tùng", "1976", 25, ngheNghiep18, 0, 0, "");
        anhTaiList.add(phanDinhTung);
        // Tuân Hưng
        ArrayList<String> ngheNghiep19 = new ArrayList<>();
        ngheNghiep19.add("Ca sĩ");
        AnhTai tuanHung = new AnhTai("Hung Vocal Power", "Tuấn Hưng", "1978", 29, ngheNghiep19, 0, 0, "");
        anhTaiList.add(tuanHung);
        //Hale
        ArrayList<String> ngheNghiep20 = new ArrayList<>();
        ngheNghiep20.add("Ca sĩ");
        ngheNghiep20.add("Rapper"); ngheNghiep20.add("Vũ công");
        AnhTai haLe = new AnhTai("Le Versatile", "Hale", "1984", 20, ngheNghiep20, 0, 0, "");
        anhTaiList.add(haLe);
        //Thiên Minh
        ArrayList<String> ngheNghiep21 = new ArrayList<>();
        ngheNghiep21.add("Ca sĩ"); ngheNghiep21.add("Nhiếp ảnh gia");
        AnhTai thienMinh = new AnhTai("Minh the Artist", "Thiên Minh", "1990", 16, ngheNghiep21, 0, 0, "");
        anhTaiList.add(thienMinh);
        //Kiên Ưng
        ArrayList<String> ngheNghiep22 = new ArrayList<>();
        ngheNghiep22.add("Giám đốc sáng tạo"); ngheNghiep22.add("Đạo diễn");
        AnhTai kienUng = new AnhTai("Kien Visionary", "Kiên Ứng", "1992", 14, ngheNghiep22, 0, 0, "");
        anhTaiList.add(kienUng);
        //Duy Khanh
        ArrayList<String> ngheNghiep23 = new ArrayList<>();
        ngheNghiep23.add("Diễn viên"); ngheNghiep23.add("MC");
        AnhTai duyKhanh = new AnhTai("Khanh the Entertainer", "Duy Khánh", "1995",16, ngheNghiep23, 0, 0, "");
        anhTaiList.add(duyKhanh);

        // Trương Thế Vinh
        ArrayList<String> ngheNghiep24 = new ArrayList<>();
        ngheNghiep24.add("Ca sĩ"); ngheNghiep24.add("Diễn viên");
        AnhTai truongTheVinh = new AnhTai("Vinh Performer", "Trương Thế Vinh", "1984", 22, ngheNghiep24, 0, 0, "");
        anhTaiList.add(truongTheVinh);
        // Tăng Phúc
        ArrayList<String> ngheNghiep25 = new ArrayList<>();
        ngheNghiep25.add("Ca sĩ");
        AnhTai tangPhuc = new AnhTai("Phuc Smooth", "Tăng Phúc", "1990", 7, ngheNghiep25, 0, 0, "");
        anhTaiList.add(tangPhuc);
        // Liên Bỉnh Phát
        ArrayList<String> ngheNghiep26 = new ArrayList<>();
        ngheNghiep26.add("Diễn viên");
        AnhTai lienBinhPhat = new AnhTai("Phat the Bold", "Liên Bỉnh Phát", "1990", 7, ngheNghiep26, 0, 0, ""); anhTaiList.add(lienBinhPhat);
        // Phạm Khánh Hưng
        ArrayList<String> ngheNghiep27 = new ArrayList<>();
        ngheNghiep27.add("Ca sĩ"); ngheNghiep27.add("Nhạc sĩ");
        AnhTai phamKhanhHung = new AnhTai("Hung the Composer", "Phạm Khánh Hưng", "1982", 25, ngheNghiep27, 0, 0, "");
        anhTaiList.add(phamKhanhHung);
        //Đăng Khôi
         ArrayList<String> ngheNghiep28 = new ArrayList<>();
         ngheNghiep28.add("Ca sĩ");
         AnhTai dangKhoi = new AnhTai("Khoi Vocal Star", "Đăng Khôi", "1983", 20, ngheNghiep28, 0, 0, "");
         anhTaiList.add(dangKhoi);
         // Nguyễn Trần Duy Nhất
         ArrayList<String> ngheNghiep29 = new ArrayList<>();
         ngheNghiep29.add("Võ sĩ muay Thái");
         AnhTai nguyenTranDuyNhat = new AnhTai("Nhut the Warrior", "Nguyễn Trần Duy Nhất", "1989", 29, ngheNghiep29, 0, 0, "");
         anhTaiList.add(nguyenTranDuyNhat);
         // Neko Lê
         ArrayList<String> ngheNghiep30 = new ArrayList<>();
         ngheNghiep30.add("Đạo diễn"); ngheNghiep30.add("Rapper");
         AnhTai nekoLe = new AnhTai("Neko Creative", "Neko Lê", "1990", 15, ngheNghiep30, 0, 0, "");
         anhTaiList.add(nekoLe);
         // Hồng Sơn
         ArrayList<String> ngheNghiep31 = new ArrayList<>();
         ngheNghiep31.add("Cầu thủ bóng đá");
         AnhTai hongSon = new AnhTai("Son the Legend", "Hồng Sơn", "1970", 35, ngheNghiep31, 0, 0, "");
         anhTaiList.add(hongSon);
         // Thành Trung
         ArrayList<String> ngheNghiep32 = new ArrayList<>();
         ngheNghiep32.add("MC"); ngheNghiep32.add("Diễn viên");
         AnhTai thanhTrung = new AnhTai("Trung the Host", "Thành Trung", "1983", 21, ngheNghiep32, 0, 0, "");
         anhTaiList.add(thanhTrung);
         //HuyR
         ArrayList<String> ngheNghiep33 = new ArrayList<>();
         ngheNghiep33.add("Ca sĩ"); ngheNghiep33.add("Nhạc sĩ");
         AnhTai huyR = new AnhTai("HuyR the Melody Maker", "HuyR", "1995", 9, ngheNghiep33, 0, 0, "");
         anhTaiList.add(huyR);

    }
}
