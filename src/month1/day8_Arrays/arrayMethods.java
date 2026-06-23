package month1.day8_Arrays;

import java.util.Scanner;

public class arrayMethods {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        String[] inventory = {"Iron Sword", "Health Potion", "Map", "Shield"};
        String targetitem = "Health Potion";

        if (findItem(inventory,targetitem)==-1) {
            System.out.println("You do not have a Health Potion!");
        }
        else {
            System.out.println("Health Potion found in Slot: " +findItem(inventory,targetitem));
        }

    }

    public static int findItem(String[] bag, String targetItem){

        for (int i = 0; i < bag.length; i++) {
            if (bag[i].equalsIgnoreCase(targetItem)) {
                return i;
            }
        }

        return -1;
    }
}
