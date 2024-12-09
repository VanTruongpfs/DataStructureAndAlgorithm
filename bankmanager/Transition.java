package Exercise1.src.bankmanager;

public class Transition implements Comparable<Transition> {
    private String id;
    private String content;
    private String transitionType;
    private double amount;
    private boolean status;
    private String informationTransAccount;
    private int day;
    private int month;
    private int year;
    private String time;

    public Transition(String content, String id, String transitionType, double amount, boolean status, String informationTransAccount, int day, int month, int year, String time) {
        this.content = content;
        this.id = id;
        this.transitionType = transitionType;
        this.amount = amount;
        this.status = status;
        this.informationTransAccount = informationTransAccount;
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Transition{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", transitionType='" + transitionType + '\'' +
                ", amount=" + amount +
                ", status=" + status +
                ", informationTransAccount='" + informationTransAccount + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", time='" + time + '\'' +
                '}'+"\n";
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTransitionType() {
        return transitionType;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isStatus() {
        return status;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getInformationTransAccount() {
        return informationTransAccount;
    }

    public String getTime() {
        return time;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Transition o) {
        if(this.year!=o.year){
            return Integer.compare(this.year, o.year);
        }else{
            if(this.month!=o.month){
                return Integer.compare(this.month, o.month);
            }else{
                return Integer.compare(this.day, o.day);
            }
        }
    }
}
