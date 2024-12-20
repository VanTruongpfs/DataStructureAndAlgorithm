package Exercise1.src.anhtraivuotnganchonggai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Nhom {
    private String tenNhom;
    private LinkedList<AnhTai> dsAnhTai = new LinkedList<>();
    private String baiHat;
    private int diemBinhChon;
    private HashMap<String, Integer> bangDiemBinhChonThanhVien = new HashMap<>();
    private ArrayList<AnhTai> dsThanhVienBiLoai = new ArrayList<>();
    private AnhTai truongNhom;

    public Nhom(String tenNhom, LinkedList<AnhTai> dsAnhTai, String baiHat, int diemBinhChon, HashMap<String, Integer> bangDiemBinhChonThanhVien, ArrayList<AnhTai> dsThanhVienBiLoai, AnhTai truongNhom) {
        this.tenNhom = tenNhom;
        this.dsAnhTai = dsAnhTai;
        this.baiHat = baiHat;
        this.diemBinhChon = diemBinhChon;
        this.bangDiemBinhChonThanhVien = bangDiemBinhChonThanhVien;
        this.dsThanhVienBiLoai = dsThanhVienBiLoai;
        this.truongNhom = truongNhom;
    }
    public String getTenNhom() {
        return tenNhom;
    }
    public LinkedList<AnhTai> getDsAnhTai() {
        return dsAnhTai;
    }
    public String getBaiHat() {
        return baiHat;
    }
    public int getDiemBinhChon() {
        return diemBinhChon;
    }
    public HashMap<String, Integer> getBangDiemBinhChonThanhVien() {
        return bangDiemBinhChonThanhVien;
    }
    public ArrayList<AnhTai> getDsThanhVienBiLoai() {
        return dsThanhVienBiLoai;
    }
    public AnhTai getTruongNhom() {
        return truongNhom;
    }
    //loại thành viên
    public void loaiThanhVien(LinkedList<AnhTai> dsThanhVienBiLoai, ArrayList<AnhTai> dsThanhVien, AnhTai anhTai) {

    }

}
