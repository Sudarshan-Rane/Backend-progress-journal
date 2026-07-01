package month1.day12;

public class ConstructorChaining {
}

class Laptop{
    String brand;
    double price;

    Laptop(String brand, double price){
        this.brand = brand;
        this.price = price;

        System.out.println("Laptop created");
    }

    Laptop(){
        this("Generic");
    }

    Laptop(String name){
        this(name,500);
    }
}
