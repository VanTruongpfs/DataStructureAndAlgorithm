package Exercise1.src.vietlot;

import java.util.ArrayList;
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
    public AResult getResultPrizeByDate(String date, String type) {
        AResult prize = null;
        for (APrize aPrize : listOfPrizes) {
            if (aPrize.isType().equals(type)) {
                for (AResult result : aPrize.getListOfResult()) {
                    if (result.getDate().equals(date)) {
                        prize = result;
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
                ArrayList<String> specialPrizes = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    int randomNumber = rd.nextInt(46);
                    String number = randomNumber >10? randomNumber+"":"0"+randomNumber;
                    specialPrizes.add(number);
                }
                // tao giai nhat
                ArrayList<String> firstPrize = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    int randomNumber = rd.nextInt(46);
                    String number = randomNumber >10? randomNumber+"":"0"+randomNumber;
                    firstPrize.add(number);
                }
                // tao giai nhi
                ArrayList<String> secondPrize = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    int randomNumber = rd.nextInt(46);
                    String number = randomNumber >10? randomNumber+"":"0"+randomNumber;
                    secondPrize.add(number);
                }
                AResult result = new AResult(today, secondPrize, firstPrize, secondPrize);
                listResult.add(result);
        }
        //tao ket qua ve 6_55
        if(type.equals("6_55")) {
                String today = date.toString().substring(0,10)+" 2024";
                // tao giai dac biet
                ArrayList<String> specialPrizes = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    int randomNumber = rd.nextInt(56);
                    String number = randomNumber >10? randomNumber+"":"0"+randomNumber;
                    specialPrizes.add(number);
                }
                // tao giai nhat
                ArrayList<String> firstPrize = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    int randomNumber = rd.nextInt(56);
                    String number = randomNumber >10? randomNumber+"":"0"+randomNumber;
                    firstPrize.add(number);
                }
                // tao giai nhi
                ArrayList<String> secondPrize = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    int randomNumber = rd.nextInt(56);
                    String number = randomNumber >10? randomNumber+"":"0"+randomNumber;
                    secondPrize.add(number);
                }
                AResult result = new AResult(today, secondPrize, firstPrize, secondPrize);
                listResult.add(result);
        }
        //tao ket qua ve mega4
        if(type.equals("mega4")) {
                String today = date.toString().substring(0,10)+" 2024";
                // tao giai dac biet
                ArrayList<String> specialPrizes = new ArrayList<>();
                for (int j = 0; j < 4; j++) {
                    int randomNumber = rd.nextInt(10);
                    String number = ""+randomNumber;
                    specialPrizes.add(number);
                }
                // tao giai nhat
                ArrayList<String> firstPrize = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    int randomNumber = rd.nextInt(10);
                    String number = ""+randomNumber;
                    firstPrize.add(number);
                }
                // tao giai nhi
                ArrayList<String> secondPrize = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    int randomNumber = rd.nextInt(10);
                    String number = ""+randomNumber;
                    secondPrize.add(number);
                }
                AResult result = new AResult(today, secondPrize, firstPrize, secondPrize);
                listResult.add(result);
        }
        // so giai thuong
        int amount = 0;
        for (AResult item : listResult) {
            amount++;
        }
        String name = type;
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

    public static void main(String[] args) {
        //dai li
        ArrayList<ADigitalLottery> listLottery1 = new ArrayList<>();
        ArrayList<ADigitalLottery> listLottery2 = new ArrayList<>();
        SaleAgent agent1 =  new SaleAgent("123", "Thu Duc", listLottery1);
        SaleAgent agent2 =  new SaleAgent("456", "Dong Nai", listLottery2);
        // in ve ngau nhien
        ADigitalLottery veSo1 = agent1.createRandomLottery();
        ADigitalLottery veSo2 = agent1.createRandomLottery();
        ADigitalLottery veSo3 = agent2.createRandomLottery();
        agent1.getListLottery().add(veSo1);
        agent1.getListLottery().add(veSo2);
        agent2.getListLottery().add(veSo3);
        // in ve theo yeu cau
        String[] numberString = {"1,3,4,2"};
        ADigitalLottery veSo4 = agent2.printCustomerRequest("mega4", numberString);
        agent2.getListLottery().add(veSo4);
        ////////////////////////////////
        //Giai thuong
        ArrayList<SaleAgent> listSaleAgents = new ArrayList<>();
        listSaleAgents.add(agent1);
        listSaleAgents.add(agent2);
        ArrayList<APrize> listOfPrizes = new ArrayList<>();
        Company company = new Company(listSaleAgents, listOfPrizes);
        System.out.println(company.createResultPrize("6_45"));


    }

}
