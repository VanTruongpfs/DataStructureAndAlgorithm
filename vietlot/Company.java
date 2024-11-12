package Exercise1.src.vietlot;

import java.util.*;

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
        listOfPrizes.add(aPrize);
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
                            || Arrays.equals(tick.getNumberString(), ketqua.getSpecialPrize())){
                   result = tick;
               }
           }
       }
        return result;
    }

    //Tim dai ly co nhieu ve trung
    public HashMap<SaleAgent, Integer> getAgentsWithHighWinningCount(String ticketType) {
        HashMap<SaleAgent, Integer> winningAgentsMap = new HashMap<>();

        for (SaleAgent agent : listSaleAgents) {
            int winningCount = 0;

            for (ADigitalLottery ticket : agent.getListLottery()) {
                if (ticket.isType().equals(ticketType)) {
                    for (APrize prize : listOfPrizes) {
                        if (prize.isType().equals(ticketType)) {
                            for (AResult result : prize.getListOfResult()) {
                                if (Arrays.equals(ticket.getNumberString(), result.getFirstPrize()) ||
                                        Arrays.equals(ticket.getNumberString(), result.getSecondPrize()) ||
                                        Arrays.equals(ticket.getNumberString(), result.getSpecialPrize())) {

                                    winningCount++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            if (winningCount > 1) {
                winningAgentsMap.put(agent, winningCount);
            }
        }

        return winningAgentsMap;
    }
}
