package Exercise1.src.vietlot;

import java.util.ArrayList;

public class LotteryMega4 extends ADigitalLottery {
    public LotteryMega4(String date, String qrCode, String idSaleAgent, String[] numberString){
        super(date, qrCode, idSaleAgent, numberString);
    }
    public String isType() {
        return "mega4";
    }
}
