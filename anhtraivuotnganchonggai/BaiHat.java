package Exercise1.src.anhtraivuotnganchonggai;

public class BaiHat {
    private String tenBaiHat;
    private String nhacSi;
    private String hoaAmPhoiKhi;
    private String yeuCau;
    public BaiHat(String tenBaiHat, String nhacSi, String hoaAmPhoiKhi, String yeuCau) {
        this.tenBaiHat = tenBaiHat;
        this.nhacSi = nhacSi;
        this.hoaAmPhoiKhi = hoaAmPhoiKhi;
        this.yeuCau = yeuCau;
    }

    public String getTenBaiHat() {

        return tenBaiHat;
    }
    public String getNhacSi() {
        return nhacSi;
    }
    public String getHoaAmPhoiKhi() {
        return hoaAmPhoiKhi;
    }
    public String getYeuCau() {
        return yeuCau;
    }

    @Override
    public String toString() {
        return "BaiHat";
    }
}
