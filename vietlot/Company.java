package Exercise1.src.vietlot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Company {
    private ArrayList<SaleAgent> listSaleAgents = new ArrayList<>();
    private ArrayList<APrize> listOfPrizes = new ArrayList<>();
    public Company(ArrayList<SaleAgent> listSaleAgents, ArrayList<APrize> listOfPrizes) {
        this.listSaleAgents = listSaleAgents;
        this.listOfPrizes = listOfPrizes;
    }
    public ArrayList<SaleAgent> getListSaleAgents() {
        return listSaleAgents;
    }
    public ArrayList<APrize> getListOfPrizes() {
        return listOfPrizes;
    }
    public APrize getResultPrizeByDate(String date, String type) {
        APrize prize = null;
        for (APrize aPrize : listOfPrizes) {
            if (aPrize.isType().equals(type)) {
                for (AResult result : aPrize.getListOfResult()) {
                    if (result.getDate().equals(date)) {
                        prize = aPrize;
                    }
                }
            }
        }
        return prize;
    }
    public APrize createResultPrize(String type) {
        ArrayList<AResult> listResult= new ArrayList<>();
        Random rd = new Random();
        Date date = new Date();
//tao ket qua ve 6_45
        if(type.equals("6_45")) {
            String today = date.toString().substring(0,10)+" 2024";
            // tao giai dac biet
            String[] specialPrizes = new String[6];
            for (int j = 0; j < 6; j++) {
                int randomNumber = rd.nextInt(46);
                String number = randomNumber >=10? randomNumber+"":"0"+randomNumber;
                specialPrizes[j] = number;
            }
            // tao giai nhat
           String[] firstPrize = new String[6];
            for (int j = 0; j < 6; j++) {
                int randomNumber = rd.nextInt(46);
                String number = randomNumber >=10? randomNumber+"":"0"+randomNumber;
                firstPrize[j] = number;
            }
            // tao giai nhi
            String[] secondPrize = new String[6];
            for (int j = 0; j < 6; j++) {
                int randomNumber = rd.nextInt(46);
                String number = randomNumber >=10? randomNumber+"":"0"+randomNumber;
                secondPrize[j] = number;
            }
            AResult result = new AResult(today, specialPrizes, firstPrize, secondPrize);
            listResult.add(result);
        }
        // tao ve 6_55
       if(type.equals("6_55")) {
            String today = date.toString().substring(0,10)+" 2024";
            // tao giai dac biet
            String[] specialPrizes = new String[6];
            for (int j = 0; j < 6; j++) {
                int randomNumber = rd.nextInt(56);
                String number = randomNumber >=10? randomNumber+"":"0"+randomNumber;
                specialPrizes[j] = number;
            }
            // tao giai nhat
           String[] firstPrize = new String[6];
            for (int j = 0; j < 6; j++) {
                int randomNumber = rd.nextInt(56);
                String number = randomNumber >=10? randomNumber+"":"0"+randomNumber;
                firstPrize[j] = number;
            }
            // tao giai nhi
            String[] secondPrize = new String[6];
            for (int j = 0; j < 6; j++) {
                int randomNumber = rd.nextInt(56);
                String number = randomNumber >=10? randomNumber+"":"0"+randomNumber;
                secondPrize[j] = number;
            }
            AResult result = new AResult(today, specialPrizes, firstPrize, secondPrize);
            listResult.add(result);
        }

        //tao ket qua ve mega4
        if(type.equals("mega4")) {
            String today = date.toString().substring(0,10)+" 2024";
            // tao giai dac biet
            String[] specialPrizes = new String[4];
            for (int j = 0; j < 4; j++) {
                int randomNumber = rd.nextInt(10);
                String number = ""+randomNumber;
                specialPrizes[j] = number;
            }
            // tao giai nhat
            String[] firstPrize = new String[4];
            for (int j = 0; j < 4; j++) {
                int randomNumber = rd.nextInt(10);
                String number = ""+randomNumber;
                firstPrize[j] = number;
            }
            // tao giai nhi
            String[] secondPrize = new String[4];
            for (int j = 0; j < 4; j++) {
                int randomNumber = rd.nextInt(10);
                String number = ""+randomNumber;
                secondPrize[j]=number;
            }
            AResult result = new AResult(today, specialPrizes, firstPrize, secondPrize);
            listResult.add(result);
        }
        // so giai thuong
        int amount = 0;
        for (AResult item : listResult) {
            amount++;
        }
        String name = type; // ten giai thuong
        String rule = "Same is Win";
        APrize aPrize;
        // tao giai thuong tương ứng
        if(type.equals("6_45")) {
             aPrize = new Prize6_45(amount, name, rule, listResult);
        }else if(type.equals("6_55")) {
            aPrize = new Prize6_55(amount, name, rule, listResult);
        }else{
            aPrize = new PrizeMega4(amount, name, rule, listResult);
        }
        return aPrize;
    }
    //do ve so
    public ADigitalLottery checkPrize(ArrayList<SaleAgent> listSaleAgents , ArrayList<APrize> listOfPrizes, String type) {
        ADigitalLottery result = null;
        APrize aPrize = null;
        //lay ra giai thuong cung loai
        for (APrize prize : listOfPrizes) {
            if (prize.isType().equals(type)) {
                aPrize = prize;
            }
        }
        //lay danh sach ve cung loai
        ArrayList<ADigitalLottery> listTickAsType = new ArrayList<>();
        for (SaleAgent agent : listSaleAgents) {
            for (ADigitalLottery tick : agent.getListLottery()){
                if(tick.isType().equals(type)){
                    listTickAsType.add(tick);
                }
            }
        }
        //so sanh
       for (AResult ketqua : aPrize.getListOfResult()) {
           for (ADigitalLottery tick : listTickAsType) {
               if(Arrays.equals(tick.getNumberString(), ketqua.getFirstPrize()) // so sanh ve dai li da ban voi ket qua
                       || Arrays.equals(tick.getNumberString(), ketqua.getSecondPrize())
                            || Arrays.equals(tick.getNumberString(), ketqua.getSecondPrize())){
                   result = tick;
               }
           }
       }
        return result;
    }

    public static void main(String[] args) {
        //dai li
        ArrayList<ADigitalLottery> listLottery1 = new ArrayList<>();
        ArrayList<ADigitalLottery> listLottery2 = new ArrayList<>();
        SaleAgent agent1 =  new SaleAgent("123", "Thu Duc", listLottery1);
        SaleAgent agent2 =  new SaleAgent("456", "Dong Nai", listLottery2);
        // in ve ngau nhien
        System.out.println("In so ngau nhien: \n"+ agent1.createRandomLottery());
        System.out.println("/////////////////////////");
        ADigitalLottery veSo1 = agent1.createRandomLottery();
        ADigitalLottery veSo2 = agent1.createRandomLottery();
        ADigitalLottery veSo3 = agent2.createRandomLottery();
        agent1.getListLottery().add(veSo1);
        agent1.getListLottery().add(veSo2);
        agent2.getListLottery().add(veSo3);
        // in ve theo yeu cau
        String[] numberString = {"1,3,4,2"};
        ADigitalLottery veSo4 = agent2.printCustomerRequest("mega4", numberString);
        System.out.println("in theo yeu cau: \n"+agent2.printCustomerRequest("mega4", numberString));
        agent2.getListLottery().add(veSo4);
        System.out.println("/////////////////////////");
        //Giai thuong
        ArrayList<SaleAgent> listSaleAgents = new ArrayList<>();
        listSaleAgents.add(agent1);
        listSaleAgents.add(agent2);
        ArrayList<APrize> listOfPrizes = new ArrayList<>();
        //cong ty
        Company company = new Company(listSaleAgents, listOfPrizes);
        APrize aPrize6_45 = company.createResultPrize("6_45");
        APrize aPrize6_55 = company.createResultPrize("6_55");
        APrize aPrizeMega4 = company.createResultPrize("mega4");
        company.getListOfPrizes().add(aPrize6_45);
        company.getListOfPrizes().add(aPrize6_55);
        company.getListOfPrizes().add(aPrizeMega4);
//        System.out.println("result of prize lottery 6_45: \n"+company.createResultPrize("6_45"));
//        System.out.println("result of prize lottery 6_55: \n"+company.createResultPrize("6_55"));
//        System.out.println("result of prize lottery mega4: "+company.createResultPrize("mega4"));
        System.out.println("lay ra giai thuong bang Date: \n"+company.getResultPrizeByDate("Tue Nov 12 2024", "mega4"));
        System.out.println("Do ve so: ");
        System.out.println(company.checkPrize(listSaleAgents, listOfPrizes, "mega4")==null?"khong co ve nao trung":"chuc mung: "+company.checkPrize(listSaleAgents, listOfPrizes, "mega4"));
    }

}
