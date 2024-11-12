package Exercise1.src.vietlot;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class SaleAgent {
    private String id;
    private String address;
    private ArrayList<ADigitalLottery> listLottery = new ArrayList<>();

    /**
     *
     * @param id
     * @param address
     * @param listLottery
     * ve so 6 cap 01-45: 6_45
     * ve so 6 cap 01-55: 6_55
     * ve so mega 4 cap 0-9: mega4
     */
    public SaleAgent(String id, String address, ArrayList<ADigitalLottery> listLottery) {
        this.id = id;
        this.address = address;
        this.listLottery = listLottery;
    }
    //create random numberString
    public static String[] createRandomNumberString(String type) {
        Random rd = new Random();
        String[] result = type == "6_45" ? new String[6] : type == "6_55" ? new String[6] : new String[4]; //loai ve 4 hay 6
        for (int i = 0; i < result.length; i++) {
            int index = type == "6_45" ? rd.nextInt(46) : type == "6_55" ? rd.nextInt(55) : rd.nextInt(10);
            if (result.length > 4) {//kiem tra ve 4 hay 6
                result[i] = index < 10 ? "0" + index : index + "";
            } else {
                result[i] = index + "";
            }
        }
        return result;
    }
    // create a digital random lottery
    public ADigitalLottery createRandomLottery() {
        Random rd = new Random();
        String[] listLottery = {"6_45", "6_55","mega4"};// những loại vé số
        String type = listLottery[rd.nextInt(listLottery.length)];
        String[] numberString =createRandomNumberString(type); // number String
        Date date = new Date();
        String today = "date: " +date.toString().substring(0,10)+" 2024\n";// date
        String qrCode = "QR code: #"+type+ rd.nextInt(99)+rd.nextInt(99)+"\n"; // QR Code
        String idSaleAgent = "ID SaleAgent: "+getId()+"\n";
        ADigitalLottery veSo;
        if(type.equals("6_45")) {
            veSo = new Lottery6_45(today, qrCode, idSaleAgent, numberString);
        }else if(type.equals("6_55")) {
            veSo = new Lottery6_55(today, qrCode, idSaleAgent, numberString);
        }else{
            veSo = new LotteryMega4(today, qrCode, idSaleAgent, numberString);
        }
        return veSo;
    }
    //print customer request
    public ADigitalLottery printCustomerRequest(String type, String[] numberString) {
        Random rd = new Random();
        Date date = new Date();
        String today = "date: " +date.toString().substring(0,10)+" 2024\n";// date
        String qrCode = "QR code: #"+type+ rd.nextInt(99)+rd.nextInt(99)+"\n"; // QR Code
        String idSaleAgent = "ID SaleAgent: "+getId()+"\n";
        ADigitalLottery veSo;
        if(type.equals("6_45")) {
            veSo = new Lottery6_45(today, qrCode, idSaleAgent, numberString);
        }else if(type.equals("6_55")) {
            veSo = new Lottery6_55(today, qrCode, idSaleAgent, numberString);
        }else{
            veSo = new LotteryMega4(today, qrCode, idSaleAgent, numberString);
        }
        return veSo;
    }

    public String getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
    public ArrayList<ADigitalLottery> getListLottery() {
        return listLottery;
    }
    public String toString(SaleAgent saleAgent) {
//        String listTicks ="";
//        int counter = 1;
//        for (ADigitalLottery d : saleAgent.getListLottery()) {
//            listTicks += counter+"."+d.toString(d)+"\n";
//            counter++;
//        }
        return saleAgent.getId()+" "+saleAgent.getAddress()+"\nlist:\n"+ getListLottery();
    }
    public String display(String[] array) {
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

    public static void main(String[] args) {
        ArrayList<ADigitalLottery> listLottery = new ArrayList<>();
        SaleAgent agent =  new SaleAgent("123", "Thu Duc", listLottery);
        // in ve ngau nhien
        System.out.println("in ve ngau nhien");
        ADigitalLottery veSo1 = agent.createRandomLottery();
        ADigitalLottery veSo2 = agent.createRandomLottery();
        ADigitalLottery veSo3 = agent.createRandomLottery();
        agent.getListLottery().add(veSo1);
        agent.getListLottery().add(veSo2);
        agent.getListLottery().add(veSo3);
        System.out.println(agent.toString(agent));
        // in ve theo yeu cau
        String[] numberString = {"1,3,4,2"};
        ADigitalLottery veSo4 = agent.printCustomerRequest("mega4", numberString);
        System.out.println("in ve theo yeu cau: \n"+ veSo4);
    }
}
