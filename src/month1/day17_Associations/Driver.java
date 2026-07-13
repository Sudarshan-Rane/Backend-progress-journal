package month1.day17_Associations;

public class Driver {
    String name;

    Driver(String name){
        this.name = name;
    }

    void driverdetails(){
        System.out.println("Your driver is "+name);
    }

}


class Car{
    Driver d1;
    String carname;

    Car(String carname, Driver d1){
        this.carname = carname;
        this.d1 = d1;
    }

    void details(){
        System.out.println("The car model is "+this.carname+" and the driver driving this car is "+d1.name);
    }
}
