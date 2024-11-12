package Exercise1.src.vietlot;

import java.util.ArrayList;
import java.util.Random;

public abstract class ADigitalLottery {
    protected String date;
    protected String qrCode;
    protected String idSaleAgent;
    protected String[] numberString;
    public ADigitalLottery(String date, String qrCode, String idSaleAgent, String[] numberString) {
        this.date = date;
        this.qrCode = qrCode;
        this.idSaleAgent = idSaleAgent;
        this.numberString = numberString;
    }
    public abstract String isType();
    public String getDate() {
        return date;
    }
    public String getQrCode() {
        return qrCode;
    }
    public String getIdSaleAgent() {
        return idSaleAgent;
    }
    public String[] getNumberString() {
        return numberString;
    }
    public static String display(String[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1) {
                result+= array[i]+"]";
            }else {
                result+= array[i] +",";
            }
        }
        return "Mã số: "+result;
    }
    public String toString(){
        return getDate() +""+getQrCode()+""+getIdSaleAgent()+""+display(getNumberString());
    }
    public static void main(String[] args) {

    }
}
