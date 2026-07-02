package month1.day13_Inheritance;

public class CelestialBody {

    String name;
    double mass;

    CelestialBody(String name, double mass){
        this.name = name;
        this.mass = mass;
    }

    void emitEnergy(){
        System.out.println(this.name+" radiates generic cosmic energy.");
    }
}
