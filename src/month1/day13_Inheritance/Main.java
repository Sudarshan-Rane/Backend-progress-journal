package month1.day13_Inheritance;

public class Main {


    public static void main(String[] args){

/*        Planet planet  =  new Planet("Jupiter",1.898,"Meena");
        Star star = new Star("Sun",1.989,5000);

        planet.emitEnergy();
        star.emitEnergy();*/

        Dragon dragon = new Dragon("Smaug", 1000);
        Orc orc = new Orc("Garrosh", 500);

        dragon.displayStatus();
        orc.displayStatus();

        dragon.basicAttack();
        orc.basicAttack();

        dragon.fly();

    }
}
