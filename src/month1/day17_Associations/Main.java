package month1.day17_Associations;

public class Main {

    public static void main(String[] args){


/*        LaserRifle rifle = new LaserRifle("Plasma-V2");
        Mech mech = new Mech("Titan", rifle);

        System.out.println("--- ENEMY MISSILE STRIKE ---");
        mech = null;
        System.out.println("Mech destroyed!");
        System.out.println("Does the weapon still exist? Yes, the " + rifle.modelName + " is on the ground.");*/


/*
        Driver d1 = new Driver("Ronny");
        Car c1 = new Car("Mazzerati",d1);

        c1.details();
        d1.driverdetails();
*/

        CryptoWallet c = new CryptoWallet("0xABCD123");
        UserProfile u = new UserProfile("Bruce Wayne",c);

        c.created();
        u.merged();

        u = null;

        System.out.println("--- USER DELETING ACCOUNT --- Profile destroyed.");
        System.out.println("Audit Check: Does the CryptoWallet still exist? Yes, wallet "+c.name+" is still secure.");

    }
}
