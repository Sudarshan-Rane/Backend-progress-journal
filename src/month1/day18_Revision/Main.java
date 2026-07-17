package month1.day18_Revision;

public class Main {

    public static void main(String[] args){

        GuildMaster master = new GuildMaster("Arthur");
        Guild guild = new Guild(master);

        Paladin p1 = new Paladin("Uther",10);
        Paladin p2 = new Paladin("Tirion",15);
        guild.addHero(p1);
        guild.addHero(p2);
        System.out.println("--- DEPLOYING GUILD ---");

        for (Hero guil : guild.roster){
            System.out.println(guil);
            guil.startQuest();
        }


    }
}
