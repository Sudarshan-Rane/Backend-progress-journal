package month1.day11_refreshersesh_StartofOOPS;

class Hero {

    String name;
    int health;
    int stamina;

    void heal(int amount){
        health += amount;
        System.out.println(name+" heals for "+amount+"! Health is now "+health);
    }

    void fight(){
        stamina -= 10;
        System.out.println(name+" attacks! Stamina drops to "+stamina+".");

    }
}

class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        Hero hero2 = new Hero();

        hero1.name= "Batman";
        hero1.health= 100;
        hero1.stamina = 30;

        hero2.name= "Superman";
        hero2.health= 500;
        hero2.stamina = 100;

        hero1.fight();
        hero1.fight();

        hero2.heal(50);

    }
}