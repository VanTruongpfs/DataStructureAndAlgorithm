package Exercise1.src.anhtraivuotnganchonggai;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CongDien {
    private String id;
    private String chuDe;
    private ArrayList<Nhom> dsNhom;
    private String cachTinhDiem;
    private LinkedList<AnhTai> dsAnhTaiBiLoai = new LinkedList<>();
    private HashMap<String, Integer> bangDiemBinhChonCaNhan = new HashMap<>();
    private HashMap<String, Integer> bangDiemHoaLucCaNhan = new HashMap<>();

    public CongDien(String id, String chuDe, ArrayList<Nhom> dsNhom, String cachTinhDiem, LinkedList<AnhTai> dsAnhTaiBiLoai, HashMap<String, Integer> bangDiemBinhChonCaNhan, HashMap<String, Integer> bangDiemHoaLucCaNhan) {
        this.id = id;
        this.chuDe = chuDe;
        this.dsNhom = dsNhom;
        this.cachTinhDiem = cachTinhDiem;
        this.dsAnhTaiBiLoai = dsAnhTaiBiLoai;
        this.bangDiemBinhChonCaNhan = bangDiemBinhChonCaNhan;
        this.bangDiemHoaLucCaNhan = bangDiemHoaLucCaNhan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChuDe() {
        return chuDe;
    }

    public void setChuDe(String chuDe) {
        this.chuDe = chuDe;
    }

    public ArrayList<Nhom> getDsNhom() {
        return dsNhom;
    }

    public void setDsNhom(ArrayList<Nhom> dsNhom) {
        this.dsNhom = dsNhom;
    }

    public String getCachTinhDiem() {
        return cachTinhDiem;
    }

    public void setCachTinhDiem(String cachTinhDiem) {
        this.cachTinhDiem = cachTinhDiem;
    }

    public LinkedList<AnhTai> getDsAnhTaiBiLoai() {
        return dsAnhTaiBiLoai;
    }

    public void setDsAnhTaiBiLoai(LinkedList<AnhTai> dsAnhTaiBiLoai) {
        this.dsAnhTaiBiLoai = dsAnhTaiBiLoai;
    }

    public HashMap<String, Integer> getBangDiemBinhChonCaNhan() {
        return bangDiemBinhChonCaNhan;
    }

    public void setBangDiemBinhChonCaNhan(HashMap<String, Integer> bangDiemBinhChonCaNhan) {
        this.bangDiemBinhChonCaNhan = bangDiemBinhChonCaNhan;
    }

    public HashMap<String, Integer> getBangDiemHoaLucCaNhan() {
        return bangDiemHoaLucCaNhan;
    }

    public void setBangDiemHoaLucCaNhan(HashMap<String, Integer> bangDiemHoaLucCaNhan) {
        this.bangDiemHoaLucCaNhan = bangDiemHoaLucCaNhan;
    }
    //loại thành viên

}
