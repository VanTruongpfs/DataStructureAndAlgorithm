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
}
