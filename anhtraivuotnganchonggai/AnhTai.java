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

    public int getDiemHoaLuc() {
        return diemHoaLuc;
    }

    public String getNgheDanh() {
        return ngheDanh;
    }

    public String getTenAnhTai() {
        return tenAnhTai;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public int getSoNamHoatDong() {
        return soNamHoatDong;
    }

    public ArrayList<String> getDsNgheNghiep() {
        return dsNgheNghiep;
    }

    public int getDiemBinhChon() {
        return diemBinhChon;
    }

    public String getVongBiLoai() {
        return vongBiLoai;
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public void setTenAnhTai(String tenAnhTai) {
        this.tenAnhTai = tenAnhTai;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void setSoNamHoatDong(int soNamHoatDong) {
        this.soNamHoatDong = soNamHoatDong;
    }

    public void setDsNgheNghiep(ArrayList<String> dsNgheNghiep) {
        this.dsNgheNghiep = dsNgheNghiep;
    }

    public void setDiem(int diemBinhChon, int diemHoaLuc) {
        this.diemBinhChon = diemBinhChon;
        this.diemHoaLuc = diemHoaLuc;
    }



    public void setVongBiLoai(String vongBiLoai) {
        this.vongBiLoai = vongBiLoai;
    }
    @Override
    public String toString() {
        return
                "ngheDanh='" + ngheDanh + '\'' +
                ", tenAnhTai='" + tenAnhTai + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", soNamHoatDong=" + soNamHoatDong +
                ", dsNgheNghiep=" + dsNgheNghiep +
                ", diemBinhChon=" + diemBinhChon +
                ", diemHoaLuc=" + diemHoaLuc +
                ", vongBiLoai='" + vongBiLoai + '\''
                +"\n";
    }
}
