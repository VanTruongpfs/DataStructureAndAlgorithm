package Exercise1.src.vietlot;

import java.util.ArrayList;

public class AResult {
    private String date;
    private String[] specialPrize;
    private String[] firstPrize;
    private String[] secondPrize;
    public AResult(String date, String[] specialPrize, String[] firstPrize, String[] secondPrize) {
        this.date = date;
        this.specialPrize = specialPrize;
        this.firstPrize = firstPrize;
        this.secondPrize = secondPrize;
    }
    public String getDate() {
        return date;
    }
    public String[] getSpecialPrize() {
        return specialPrize;
    }
    public String[] getFirstPrize() {
        return firstPrize;
    }
    public String[] getSecondPrize() {
        return secondPrize;
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
        return result;
    }
    @Override
    public String toString() {
        return "{" +
                "date='" + date + '\'' +
                ", specialPrize: " + display(specialPrize) +
                ", firstPrize: " + display(firstPrize) +
                ", secondPrize: " + display(secondPrize) +
                '}';
    }
}
