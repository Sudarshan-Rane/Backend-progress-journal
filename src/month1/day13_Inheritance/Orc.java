package month1.day13_Inheritance;

public class Orc extends Entity{

    Orc(String name, int health){
        super(name, health);
    }

    @Override
    public void basicAttack() {
        System.out.println(this.name+" smashes with a club!");
    }
}
