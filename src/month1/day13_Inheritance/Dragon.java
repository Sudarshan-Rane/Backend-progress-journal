package month1.day13_Inheritance;

public class Dragon extends Entity implements Flyable{

    Dragon(String name, int health){
        super(name, health);
    }

    @Override
    public void basicAttack(){
        System.out.println(this.name+" breathes scorching fire!");
    }

    @Override
    public void fly() {
        System.out.println(this.name+" launches into the sky with massive wings!");
    }
}
