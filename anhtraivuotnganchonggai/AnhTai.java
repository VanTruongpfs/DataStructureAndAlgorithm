package Exercise1.src.anhtraivuotnganchonggai;

import java.util.ArrayList;
import java.util.TreeSet;

public class AnhTai implements Comparable<AnhTai>{
    private String ngheDanh;
    private String tenAnhTai;
    private String namSinh;
    private int soNamHoatDong;
    private ArrayList<String> dsNgheNghiep = new ArrayList<>();
    private int diemBinhChon;
    private int soPhieuBau;
    private int diemHoaLuc;
    private String vongBiLoai;

    public AnhTai(String ngheDanh, String tenAnhTai, String namSinh, int soNamHoatDong, ArrayList<String> dsNgheNghiep, int diemBinhChon,int soPhieuBau, int diemHoaLuc, String vongBiLoai) {
        this.ngheDanh = ngheDanh;
        this.tenAnhTai = tenAnhTai;
        this.namSinh = namSinh;
        this.soNamHoatDong = soNamHoatDong;
        this.dsNgheNghiep = dsNgheNghiep;
        this.diemBinhChon = diemBinhChon;
        this.soPhieuBau = soPhieuBau;
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
    public int getSoPhieuBau() {
        return soPhieuBau;
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
    public void setDiemBinhChon(int diemBinhChon) {
        this.diemBinhChon = diemBinhChon;
    }
    public void setSoPhieuBau(int soPhieuBau) {
        this.soPhieuBau = soPhieuBau;
    }
    public void setDiemHoaLuc(int diemHoaLuc) {
        this.diemHoaLuc += diemHoaLuc;
    }
    public void setDiem(int diemBinhChon, int soPhieuBau) {
        this.diemBinhChon = diemBinhChon;
        this.soPhieuBau = soPhieuBau;
        this.diemHoaLuc += soPhieuBau*10;
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

    @Override
    public int compareTo(AnhTai o) {
        return Integer.compare(o.getDiemBinhChon(),this.getDiemBinhChon());
    }
}
