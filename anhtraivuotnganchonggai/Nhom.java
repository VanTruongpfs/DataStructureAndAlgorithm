package anhtraivuotnganchonggai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Nhom {
    private String tenNhom;
    private LinkedList<AnhTai> dsAnhTai = new LinkedList<>();
    private HashMap<AnhTai, BaiHat> baiHatRieng;
    private ArrayList<BaiHat> baiHatChung;
    private int diemBinhChon;
    private HashMap<AnhTai, Integer> bangDiemBinhChonThanhVien;
    private ArrayList<AnhTai> dsThanhVienBiLoai;
    private AnhTai truongNhom;
    public Nhom(String tenNhom, LinkedList<AnhTai> dsAnhTai, ArrayList<BaiHat> baiHatChung, int diemBinhChon, HashMap<AnhTai, Integer> bangDiemBinhChonThanhVien, AnhTai truongNhom) {
        this.tenNhom = tenNhom;
        this.dsAnhTai = dsAnhTai;
        this.baiHatRieng = new HashMap<AnhTai, BaiHat>();
        this.baiHatChung = baiHatChung;
        this.diemBinhChon = diemBinhChon;
        this.bangDiemBinhChonThanhVien = bangDiemBinhChonThanhVien;
        this.dsThanhVienBiLoai = new ArrayList<AnhTai>();
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
    public HashMap<AnhTai, BaiHat> getBaiHatRieng() {
		return baiHatRieng;
	}
	public ArrayList<BaiHat> getBaiHatChung() {
		return baiHatChung;
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

    public void setBaiHatChung(ArrayList<BaiHat> baiHatChung) {
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
    public void loaiThanhVien(AnhTai anhTaiBiLoai) {
        if(this.dsAnhTai.contains(anhTaiBiLoai)) {
        	dsAnhTai.remove(anhTaiBiLoai);
        	dsThanhVienBiLoai.add(anhTaiBiLoai);
        }
    }
    //thêm thành viên
    public void themThanhVien(AnhTai anhTai, LinkedList<AnhTai> dsAnhTai) {
        if(!dsAnhTai.contains(anhTai)) {
            dsAnhTai.add(anhTai);
        }
    }
}
