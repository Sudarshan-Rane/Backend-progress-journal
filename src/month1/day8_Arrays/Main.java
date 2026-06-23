package month1.day8_Arrays;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        String[] inventory = {"Iron Sword", "Health Potion", "Map", "Shield"};
//        int length = inventory.length;

//        System.out.println(inventory[0]);
//        System.out.println(inventory[length-1]);

//        for (String inv : inventory){
//            System.out.println(inv);
//        }
        System.out.println("--- FULL INVENTORY ---");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Slot "+i+" : "+inventory[i]);
        }

    }

}

