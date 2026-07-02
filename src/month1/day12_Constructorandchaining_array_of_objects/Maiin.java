package month1.day12_Constructorandchaining_array_of_objects;

public class Maiin {

    public static void main(String[] args){
        GuildMember[] mem = new GuildMember[3];
        mem[0] = new GuildMember("Arthur", "Paladin", 50);
        mem[1] = new GuildMember("Bob");
        mem[2] = new GuildMember();

        for (int i = 0; i < mem.length; i++) {
            System.out.println("Slot "+i+": "+mem[i].name+" (Level "+mem[i].level+" "+mem[i].role+")");
        }
    }
}

class GuildMember {
    String name;
    String role;
    int level;

    GuildMember(){
        this("NPC","villager",1);
//        this.name = "NPC";
//        this.role = "Villager";
//        this.level = 1;
    }

    GuildMember(String name){
        this(name,"Recruit",1);
//        this.name = name;
//        this.role = "Recruit";
//        this.level = 1;
    }

    GuildMember(String name, String role, int level){
        this.name = name;
        this.role = role;
        this.level = level;
    }
}
