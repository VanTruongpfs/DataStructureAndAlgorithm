package Exercise1.src.anhtraivuotnganchonggai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Nhom {
    private String tenNhom;
    private LinkedList<AnhTai> dsAnhTai = new LinkedList<>();
    private HashMap<AnhTai, BaiHat> baiHatRieng;
    private BaiHat baiHatChung;
    private int diemBinhChon;
    private HashMap<AnhTai, Integer> bangDiemBinhChonThanhVien = new HashMap<>();
    private ArrayList<AnhTai> dsThanhVienBiLoai = new ArrayList<>();
    private AnhTai truongNhom;
    public Nhom(String tenNhom, LinkedList<AnhTai> dsAnhTai, HashMap<AnhTai, BaiHat> baiHatRieng, BaiHat baiHatChung, int diemBinhChon, HashMap<AnhTai, Integer> bangDiemBinhChonThanhVien, ArrayList<AnhTai> dsThanhVienBiLoai, AnhTai truongNhom) {
        this.tenNhom = tenNhom;
        this.dsAnhTai = dsAnhTai;
        this.baiHatRieng = baiHatRieng;
        this.baiHatChung = baiHatChung;
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
    public HashMap<AnhTai, BaiHat> getBaiHat() {
        return baiHatRieng;
    }
    public int getDiemBinhChon() {
        return diemBinhChon;
    }
    public HashMap<AnhTai, Integer> getBangDiemBinhChonThanhVien() {
        return bangDiemBinhChonThanhVien;
    }
    public ArrayList<AnhTai> getDsThanhVienBiLoai() {
        return dsThanhVienBiLoai;
    }
    public AnhTai getTruongNhom() {
        return truongNhom;
    }
    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public void setDsAnhTai(LinkedList<AnhTai> dsAnhTai) {
        this.dsAnhTai = dsAnhTai;
    }

    public void setBaiHatRieng(HashMap<AnhTai, BaiHat> baiHatRieng) {
        this.baiHatRieng = baiHatRieng;
    }

    public void setBaiHatChung(BaiHat baiHatChung) {
        this.baiHatChung = baiHatChung;
    }

    public void setDiemBinhChon(int diemBinhChon) {
        this.diemBinhChon = diemBinhChon;
    }

    public void setBangDiemBinhChonThanhVien(HashMap<AnhTai, Integer> bangDiemBinhChonThanhVien) {
        this.bangDiemBinhChonThanhVien = bangDiemBinhChonThanhVien;
    }

    public void setDsThanhVienBiLoai(ArrayList<AnhTai> dsThanhVienBiLoai) {
        this.dsThanhVienBiLoai = dsThanhVienBiLoai;
    }

    public void setTruongNhom(AnhTai truongNhom) {
        this.truongNhom = truongNhom;
    }
    //loại thành viên
    public void loaiThanhVien(LinkedList<AnhTai> dsThanhVienBiLoai, ArrayList<AnhTai> dsThanhVien, AnhTai anhTaiBiLoai) {
        for (AnhTai anhTai : dsThanhVien) {
          if(anhTai.equals(anhTaiBiLoai)) {
              dsThanhVien.remove(anhTai);
              dsThanhVienBiLoai.add(anhTai);
          }
        }
    }
    //thêm thành viên
    public void themThanhVien(AnhTai anhTai, LinkedList<AnhTai> dsAnhTai) {
        if(!dsAnhTai.contains(anhTai)) {
            dsAnhTai.add(anhTai);
        }
    }
}
