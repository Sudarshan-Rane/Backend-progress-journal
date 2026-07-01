package month1.day12;

class CyberPet{
    String name;
    int hunger;
    int battery;

    public CyberPet(String name, int hunger, int battery){
        this.name = name;
        this.hunger = hunger;
        this.battery = battery;
        System.out.println("*** BOOTING UP: "+this.name+" ***");
    }
    void feed(int foodamount){

        this.hunger -= foodamount;
        System.out.println(this.name+" ate! Hunger decreased to "+this.hunger);
    }

    void play(){
        this.battery -= 20;
        this.hunger += 10;
        System.out.println(this.name+" is playing! Battery: "+this.battery+" | Hunger: "+this.hunger+".");
    }
}


public class Main {
    public static void main (String[] args){

        CyberPet pet1 = new CyberPet("RoboDog", 50, 100);
        CyberPet pet2 = new CyberPet("MechaCat", 80, 50);

        pet1.play();
        pet1.play();

        pet2.feed(30);

    }

}




