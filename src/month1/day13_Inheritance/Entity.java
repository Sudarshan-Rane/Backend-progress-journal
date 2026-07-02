package month1.day13_Inheritance;

public abstract class Entity {

    String name;
    int health;

    Entity(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void displayStatus(){
        System.out.println(this.name+" has "+this.health+" HP.");
    }

    public abstract void basicAttack();


}
