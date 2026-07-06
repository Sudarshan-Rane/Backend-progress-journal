package month1.day16_Polymorphism_encapsulation_aggregation_composition;

class Planet {
    String name;
    double degree;

    Planet(String name, double degree){
        this.name = name;
        this.degree = degree;
    }
    public void printLocation(){

        System.out.printf("%s is currently at %.2f degrees", this.name,this.degree);
    }
}

public class TransitObserver {
    String observerName;
    Planet targetPlanet;

    TransitObserver(String observerName,Planet targetPlanet ){
        this.observerName = observerName;
        this.targetPlanet = targetPlanet;
    }

    public void runAnalysis(){
        System.out.println(this.observerName+" is looking through the telescope...");
        targetPlanet.printLocation();
    }

    public static void main(String[] args){
        Planet planet = new Planet("Moon", 351.57);
        TransitObserver obv = new TransitObserver("Telescope Alpha", planet);

        obv.runAnalysis();
        obv = null;
        System.out.println();
        System.out.println("--- OBSERVER DESTROYED ---");
        planet.printLocation();
    }
}
