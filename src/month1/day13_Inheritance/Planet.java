package month1.day13_Inheritance;

public class Planet extends CelestialBody{
    String rasi;

    Planet(String name, double mass, String rasi){
        super(name, mass);
        this.rasi = rasi;
    }


    @Override
    void emitEnergy(){
        System.out.println("The planet "+this.name+" influences the "+this.rasi+" rasi.");
    }

}
