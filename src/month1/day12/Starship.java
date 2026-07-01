package month1.day12;

class Starship {
    String name;
    String captain;
    double warpspeed;

    static int totalships = 0;

    Starship(){
        this("Drone",1.0,"AI");
    }

    Starship(String name, String captain){
        this(name,2.5,captain);
    }
    Starship(String name,double warpspeed, String captain){
        this.name = name;
        this.warpspeed = warpspeed;
        this.captain = captain;
        totalships++;
    }

    void upgradeDrive(double speed){
        warpspeed += speed;
    }


}

class maiin{
    public static void main (String[] args){
            Starship[] ship = new Starship[3];
            ship[0] = new Starship("Enterprise", 9.9, "Picard");
            ship[1] = new Starship("Falcon","Solo");
            ship[2] = new Starship();

            ship[1].upgradeDrive(8);
            System.out.println();

        System.out.println("Fastest Ship: "+findFastestShip(ship)+"\nTotal active ships: "+Starship.totalships);

    }
    public static String findFastestShip(Starship[] star){

        double counter = 0;
        double highest = 0;
        String na = "";
        
        for (int i = 0; i < star.length; i++) {
            counter = star[i].warpspeed;
            if (counter>highest){
                highest = counter;
                na = star[i].name;
            }

        }
        return na;
    }
}