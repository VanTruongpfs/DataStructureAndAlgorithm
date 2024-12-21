package Exercise1.src.anhtraivuotnganchonggai;

import java.util.HashMap;
import java.util.LinkedList;

public class ChuongTrinhATVNCG {
    private int lanToChuc;
    private LinkedList<AnhTai> dsAnhTaiThamGia;
    private LinkedList<AnhTai> dsGiaTocToanNang;
    private LinkedList<AnhTai> top23AnhTaiNgoaiGiaToc;
    private HashMap<AnhTai, Integer> dsAnhTaiBiLoaiVaThuTuDemCongDien;
    private HashMap<String, AnhTai> tenGiaiThuongVaTenAnhTai;

    public ChuongTrinhATVNCG(int lanToChuc) {
        this.lanToChuc = lanToChuc;
        this.dsAnhTaiThamGia = new LinkedList<>(); ;
        this.dsGiaTocToanNang = new LinkedList<>();
        this.top23AnhTaiNgoaiGiaToc = new LinkedList<>();
        this.dsAnhTaiBiLoaiVaThuTuDemCongDien = new HashMap<>();
        this.tenGiaiThuongVaTenAnhTai = new HashMap<>();
    }
    public void setDsAnhTaiThamGia(LinkedList<AnhTai> dsAnhTaiThamGia) {
        this.dsAnhTaiThamGia = dsAnhTaiThamGia;
    }
}
