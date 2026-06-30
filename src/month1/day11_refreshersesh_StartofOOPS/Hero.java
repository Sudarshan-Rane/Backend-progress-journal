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

    public Hero(String name1, int health1, int stamina1){
        this.name = name1;
        this.health = health1;
        this.stamina = stamina1;

        System.out.println("--> SPUN UP NEW HERO: "+name);
    }
}

class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Batman",100,50);
        Hero hero2 = new Hero("Superman",500,100);

        hero1.fight();

        hero2.heal(50);

    }
}