package month1.day7_Methods;

import java.util.Scanner;

public class Main {

    public static void main (String[]args){

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
    }


}
