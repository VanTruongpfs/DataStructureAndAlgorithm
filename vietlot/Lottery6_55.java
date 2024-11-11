package Exercise1.src.vietlot;

import java.util.ArrayList;

public class Lottery6_55 extends ADigitalLottery{
    public Lottery6_55(String date, String qrCode, String idSaleAgent, String[] numberString) {
        super(date, qrCode, idSaleAgent, numberString);
    }
    public String isType() {
        return "6_55";
    }
}
