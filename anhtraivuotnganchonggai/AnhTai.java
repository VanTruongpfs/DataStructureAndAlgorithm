package Exercise1.src.anhtraivuotnganchonggai;

import java.util.ArrayList;

public class AnhTai {
    private String ngheDanh;
    private String tenAnhTai;
    private String namSinh;
    private int soNamHoatDong;
    private ArrayList<String> dsNgheNghiep = new ArrayList<>();
    private int diemBinhChon;
    private int diemHoaLuc;
    private String vongBiLoai;


    public AnhTai(String ngheDanh, String tenAnhTai, String namSinh, int soNamHoatDong, ArrayList<String> dsNgheNghiep, int diemBinhChon, int diemHoaLuc, String vongBiLoai) {
        this.ngheDanh = ngheDanh;
        this.tenAnhTai = tenAnhTai;
        this.namSinh = namSinh;
        this.soNamHoatDong = soNamHoatDong;
        this.dsNgheNghiep = dsNgheNghiep;
        this.diemBinhChon = diemBinhChon;
        this.diemHoaLuc = diemHoaLuc;
        this.vongBiLoai = vongBiLoai;
    }
}
