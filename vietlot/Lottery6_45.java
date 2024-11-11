package Exercise1.src.vietlot;

import java.util.ArrayList;

public class Lottery6_45 extends ADigitalLottery{
    public Lottery6_45(String date, String qrCode, String idSaleAgent, String[] numberString) {
        super(date, qrCode, idSaleAgent, numberString);
    }

    @Override
    public String isType() {
        return "6_45";
    }

}
