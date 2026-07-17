package month1.day18_Revision;

import java.util.ArrayList;

public class Guild {

    GuildHall hall;
    GuildMaster master;
    ArrayList<Hero> roster;


    Guild(GuildMaster master){
        this.hall = new GuildHall();
        this.master = master;
        this.roster = new ArrayList<>();

    }

    public void addHero(Hero h){
        roster.add(h);
        System.out.println("Added to roster: "+h.getName());
    }
}

class Paladin extends Hero {

    Paladin(String name, int level){
        super(name, level);
    }


    @Override
    public void startQuest() {
        System.out.println(this.getName()+ " raises their shield and charges into the dungeon!");
    }
}

class GuildHall{

    GuildHall(){
        System.out.println("[+] A new Guild Hall was constructed.");
    }

}

class GuildMaster{

    String name;

    GuildMaster(String name){
        this.name = name;
        System.out.println("[+] Guild Master "+this.name+" has arrived.");
    }


}

