package month1.day13_Inheritance;

public class Star extends CelestialBody{

    int luminosity;

    Star(String name, double mass, int luminosity){
        super(name,mass);
        this.luminosity = luminosity;
    }

    @Override
    void emitEnergy(){
        System.out.println("The star "+this.name+" burns with "+this.luminosity+" luminosity!");
    }
}
