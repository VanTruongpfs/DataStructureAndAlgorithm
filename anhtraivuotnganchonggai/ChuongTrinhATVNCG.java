package Exercise1.src.anhtraivuotnganchonggai;

import java.util.HashMap;
import java.util.LinkedList;

public class ChuongTrinhATVNCG {
    private int lanToChuc;
    private LinkedList<AnhTai> dsAnhTaiThamGia = new LinkedList<>();
    private LinkedList<AnhTai> dsGiaTocToanNang = new LinkedList<>();
    private LinkedList<AnhTai> top23AnhTaiNgoaiGiaToc = new LinkedList<>();
    private HashMap<AnhTai, Integer> dsAnhTaiBiLoaiVaThuTuDemCongDien = new HashMap<>();
    private HashMap<String, AnhTai> tenGiaiThuongVaTenAnhTai = new HashMap<>();

    public ChuongTrinhATVNCG(int lanToChuc, LinkedList<AnhTai> dsAnhTaiThamGia, LinkedList<AnhTai> dsGiaTocToanNang, LinkedList<AnhTai> top23AnhTaiNgoaiGiaToc, HashMap<AnhTai, Integer> dsAnhTaiBiLoaiVaThuTuDemCongDien, HashMap<String, AnhTai> tenGiaiThuongVaTenAnhTai) {
        this.lanToChuc = lanToChuc;
        this.dsAnhTaiThamGia = dsAnhTaiThamGia;
        this.dsGiaTocToanNang = dsGiaTocToanNang;
        this.top23AnhTaiNgoaiGiaToc = top23AnhTaiNgoaiGiaToc;
        this.dsAnhTaiBiLoaiVaThuTuDemCongDien = dsAnhTaiBiLoaiVaThuTuDemCongDien;
        this.tenGiaiThuongVaTenAnhTai = tenGiaiThuongVaTenAnhTai;
    }

}
