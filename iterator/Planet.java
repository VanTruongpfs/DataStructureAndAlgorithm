package Exercise1.src.iterator;

public class Planet {
    private String nameInVN;
    private String name;
    private double period;
    private double acreage;
    private double mass;
    public Planet(String nameInVN, String name, double period, double acreage, double mass) {
        this.nameInVN = nameInVN;
        this.name = name;
        this.period = period;
        this.acreage = acreage;
        this.mass = mass;
    }
    public String getNameInVN() {
        return nameInVN;
    }
    public String getName() {
        return name;
    }
    public double getPeriod() {
        return period;
    }
    public double getAcreage() {
        return acreage;
    }
    public double getMass() {
        return mass;
    }
    public static String toStringPlanet(Planet planet) {
        String output = "VietSub: "+ planet.getNameInVN()+", Name: "+planet.getName()+", Period: "+planet.getPeriod()+", Acreage: "+planet.getAcreage()+", Mass: "+planet.getMass();
        return output;
    }

}
