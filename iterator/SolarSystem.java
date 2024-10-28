package Exercise1.src.iterator;

import java.util.*;

public class SolarSystem {
    private ListIterator<Planet> planetIterator;
    public SolarSystem(ArrayList<Planet> planets) {
        this.planetIterator = planets.listIterator();
    }
    public static void refesh(ListIterator<Planet> planetIterator) {
        while (planetIterator.hasPrevious()) {
            planetIterator.previous();
        }
    }
    public static String display(ListIterator<Planet> planetIterator) {
        String result="";
        while (planetIterator.hasNext()) {
           result+=planetIterator.next().getName()+" | ";
        }
        return result;
    }
    public static String getPlanetMassMax(ListIterator<Planet> planetIterator) {
        refesh(planetIterator);
        Planet planetMax = planetIterator.next();
        while (planetIterator.hasNext()) {
            if(planetMax.getMass()<planetIterator.next().getMass()) {
                planetMax = planetIterator.previous();
            }
        }
        return planetMax.getName();
    }
    public static String getPlanetAcreageMax(ListIterator<Planet> planetIterator) {
        refesh(planetIterator);
        Planet planetMax = planetIterator.next();
        while (planetIterator.hasNext()) {
            if(planetMax.getAcreage()<planetIterator.next().getAcreage()) {
                planetMax = planetIterator.previous();
            }
        }
        return planetMax.getName();

    }
    public static String getPlanetPeriodMax(ListIterator<Planet> planetIterator) {
        refesh(planetIterator);
        Planet planetMax = planetIterator.next();
        while (planetIterator.hasNext()) {
            if(planetMax.getPeriod()<planetIterator.next().getPeriod()) {
                planetMax = planetIterator.previous();
            }
        }
        return planetMax.getName();
    }
    public static Planet lookForPlanetByName(ListIterator<Planet> planetIterator, String name) {
        refesh(planetIterator);
        Planet  result = null;
        while (planetIterator.hasNext()) {
            Planet planet = planetIterator.next();
            if(planet.getName().equals(name) || planet.getNameInVN().equals(name)) {
                result = planet;
                break;
            }
        }
        return result;
    }
    public static Planet randomPlanet(ListIterator<Planet> planetIterator) {
        refesh(planetIterator);
        Planet  result = null;
        Random rand = new Random();
        int count=0;
        while (planetIterator.hasNext()) {
            planetIterator.next();
            count++;
        }
        refesh(planetIterator);
        int index = rand.nextInt(1, count+1);
        while (planetIterator.hasNext()) {
            planetIterator.next();
            if(planetIterator.nextIndex()==index) {
                result = planetIterator.previous();
                break;
            }
        }
        return result;
    }
    public static String comparePeriod( Planet planet1, Planet planet2) {
        String result= planet1.getPeriod()>planet2.getPeriod()?planet1.getName()+" has a greater period than "+planet2.getName():planet1.getName()+" has a less period than "+planet2.getName();
        return result;
    }
    public static void main(String[] args) {
        Planet mercury = new Planet("Sao Thuy", "Mercury", 87.97, 7.48*Math.pow(10,9), 0.330*Math.pow(10,24));
        Planet venus = new Planet("Sao Kim", "Venus", 224.70, 4.6*Math.pow(10,9), 4.869*Math.pow(10,24));
        Planet earth = new Planet("Trai Đat", "Earth", 365.25, 5.1*Math.pow(10,9), 5.972*Math.pow(10,24));
        Planet mars = new Planet("Sao Hoa", "Mars", 687, 1.442*Math.pow(10,9), 6.39*Math.pow(10,24));
        Planet jupiter = new Planet("Sao Moc", "Jupiter", 4333, 6.142*Math.pow(10,9), 1.898*Math.pow(10,24));
        Planet saturn = new Planet("Sao Tho", "Saturn", 10759, 4.27*Math.pow(10,9), 5.683*Math.pow(10,24));
        Planet uranus = new Planet("Sao Thien Vuong", "Uranus", 30687, 8.083*Math.pow(10,9), 8.681*Math.pow(10,24));
        ArrayList<Planet> list = new ArrayList<>();
        list.add(mercury);
        list.add(venus);
        list.add(earth);
        list.add(mars);
        list.add(jupiter);
        list.add(saturn);
        list.add(uranus);
        SolarSystem solarSystem = new SolarSystem(list);
        System.out.println("solar System: " +display(solarSystem.planetIterator));
        System.out.println("Planet has the best acreage: "+getPlanetAcreageMax(solarSystem.planetIterator));
        System.out.println("Planet has the best mass: "+getPlanetAcreageMax(solarSystem.planetIterator));
        System.out.println("Planet has the best period: "+getPlanetAcreageMax(solarSystem.planetIterator));
        System.out.println("Information of planed which we are look for: "+Planet.toStringPlanet(lookForPlanetByName(solarSystem.planetIterator, "Mars")));
        System.out.println("Planet random: "+Planet.toStringPlanet(randomPlanet(solarSystem.planetIterator)));
        System.out.println(comparePeriod(earth, mercury));
    }
}
