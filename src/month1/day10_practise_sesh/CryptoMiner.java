package month1.day10_practise_sesh;

import java.util.Random;
import java.util.Scanner;

public class CryptoMiner {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int balance = 0;
        System.out.println("--- BLOCKCHAIN NODE SETUP ---");

        boolean powertru;
        boolean daytru;
        int power;
        int day;
        int reward;


        do {
            System.out.print("Enter hash power (1-100): ");
            power = scanner.nextInt();
            scanner.nextLine();

            if (power < 0 || power > 100) {
                System.out.println("Invalid hash power.");
                powertru = true;
            } else {
                powertru = false;
            }
        } while (powertru);


        do {
            System.out.print("Enter days to simulate: ");
            day = scanner.nextInt();

            if (day == 0 || day < 0) {
                System.out.println("Invalid timeframe.");
                daytru = true;
            } else {
                daytru = false;
            }
        } while (daytru);

        int[] ledger = new int[day];

        for (int i = 0; i < day; i++) {
//            balance += mineBlock(power);
            reward = mineBlock(power);
            balance += reward;
            ledger[i] = reward;
        }

        System.out.println("\n--- SIMULATION COMPLETE ---");

        System.out.println("Final Balance: "+balance);
        System.out.println(ledger.length);
        System.out.print("Ledger: ");
        for (int i = 0; i < ledger.length; i++) {
            System.out.print(ledger[i]+" ");
        }
        System.out.println("\nLongest Dry Spell: "+findLongestDrySpell(ledger)+" days");





    }

    public static int mineBlock(int hashPower){

        int ran = random.nextInt(1,101);
        if(ran<=hashPower){
            return 50;
        }
        else {
            return 0;
        }

    }

    public static int findLongestDrySpell(int[] ledger){
        int counter=0;
        int highest=0;
        for (int i = 0; i <ledger.length ; i++) {
            if (ledger[i]==0) {
                counter++;
                if (counter>highest) {
                    highest=counter;
                }
            }
            else {
                if (counter>highest) {
                    highest=counter;
                }

                counter=0;
            }
        }
        return highest;
    }



}
