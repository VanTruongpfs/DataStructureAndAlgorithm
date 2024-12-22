package anhtraivuotnganchonggai;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class CongDien {
    private String id;
    private String chuDe;
    private ArrayList<Nhom> dsNhom;
    private String cachTinhDiem;
    private LinkedList<AnhTai> dsAnhTaiBiLoai = new LinkedList<>();
    private HashMap<String, Integer> bangDiemBinhChonCaNhan = new HashMap<>();
    private HashMap<String, Integer> bangDiemHoaLucCaNhan = new HashMap<>();

    public CongDien(String id, String chuDe, ArrayList<Nhom> dsNhom, String cachTinhDiem, HashMap<String, Integer> bangDiemBinhChonCaNhan, HashMap<String, Integer> bangDiemHoaLucCaNhan) {
        this.id = id;
        this.chuDe = chuDe;
        this.dsNhom = dsNhom;
        this.cachTinhDiem = cachTinhDiem;
        this.dsAnhTaiBiLoai = new LinkedList<AnhTai>();
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
    //them danh sach cac nhom
    public void themNhom(Nhom nhom, ArrayList<Nhom> dsNhom) {
        if(!dsNhom.contains(nhom)) {
            dsNhom.add(nhom);
        }
    }
    //danh sach anh tai co diem cao nhat
    public ArrayList<AnhTai> getAnhTaiDiemCaoNhatCuaMoiNhom(ArrayList<Nhom> dsNhom) {
        TreeSet<AnhTai> dsAnhTaiDaSort = new TreeSet<>();
        ArrayList<AnhTai> dsAnhTaiDiemCaoNhatMoiNhom = new ArrayList<>();
        for (Nhom nhom : dsNhom) {
            for (AnhTai anhTai : nhom.getDsAnhTai()) {
                dsAnhTaiDaSort.add(anhTai);
            }
            dsAnhTaiDiemCaoNhatMoiNhom.add(dsAnhTaiDaSort.first());
            dsAnhTaiDaSort.clear();
        }
        return dsAnhTaiDiemCaoNhatMoiNhom;
    }
    //cong diem hoa luc cho anh tai co diem cao cua nhat moi nhom
    public void themDiem(LinkedList<AnhTai> dsAnhTai, ArrayList<Nhom> dsNhom) {
        for(AnhTai anhTai : dsAnhTai){
            if(getAnhTaiDiemCaoNhatCuaMoiNhom(dsNhom).contains(anhTai)) {
                anhTai.setDiemHoaLuc(300);
            }
        }
    }

}
