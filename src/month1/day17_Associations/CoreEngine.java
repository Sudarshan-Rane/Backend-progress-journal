package month1.day17_Associations;

class CoreEngine {

    CoreEngine(){
        System.out.println("[+] Core Engine installed and online");
    }
}


class LaserRifle {
    String modelName;

    LaserRifle(String modelName){
        this.modelName = modelName;
        System.out.println("[+] Laser Rifle forged: "+this.modelName);
    }

}

class Mech {
    String callsign;
    CoreEngine engine;
    LaserRifle weapon;


    Mech(String callsign, LaserRifle weapon){
        this.engine = new CoreEngine();
        this.weapon = weapon;
    }
}
