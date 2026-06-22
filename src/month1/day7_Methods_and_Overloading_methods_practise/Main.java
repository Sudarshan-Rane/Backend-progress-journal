package month1.day7_Methods_and_Overloading_methods_practise;

import java.util.Scanner;
import java.util.Random;

public class Main {

/*    public static void main (String[]args){

        Scanner scanner =  new Scanner(System.in);

        String weapon;
        int base;
        double damage;

        System.out.print("Weapon name: ");
        weapon = scanner.nextLine();

        System.out.print("Base Damage: ");
        base = scanner.nextInt();

        System.out.print("Damage Multiplier: ");
        damage = scanner.nextDouble();

        int d = calculateDamage(base, damage);
        printReceipt(weapon,d);

        scanner.close();

    }
    public static int calculateDamage(int baseAttack, double multiplier){
        return (int)(baseAttack*multiplier);
    }

    public static void printReceipt(String weaponName, int finalDamage){
        System.out.printf("%n--- CRAFTING COMPLETE ---%nWeapon: %s%nTotal Damage: %d", weaponName, finalDamage);
    }*/

    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int code = random.nextInt(1,101);
        int attempts = 5;

        while(attempts>=1){
            System.out.print("You have "+attempts+" attempts left. Enter code (1-100):");
            int guess = scanner.nextInt();

            if (guess == code) {
                System.out.println("OVERRIDE ACCEPTED. Meltdown averted!");
                break;
            }
            else{
                if (guess>code){
                    System.out.println("Access Denied. Target code is LOWER");
                }
                else {
                    System.out.println("Access Denied. Target code is HIGHER");
                }

            }
            attempts--;

        }

        if (attempts==0) {
            System.out.println("SYSTEM LOCKDOWN. Meltdown initiated. The code was: "+code);
        }
        scanner.close();






    }


}
