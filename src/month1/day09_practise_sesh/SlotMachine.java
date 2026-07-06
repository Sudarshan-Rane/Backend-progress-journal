package month1.day09_practise_sesh;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        String play = "Y";
        System.out.println("Welcome to the Casino! Starting Balance: $"+balance);
        do{

            System.out.print("Enter your bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet<=0 || bet>balance) {
                System.out.println("Invalid bet");
            }

            else {
                balance -= bet;
                String[] spin = spinReels();
                System.out.println();
                int update = calculatePayout(spin,bet);
                balance += update;
                if (balance <= 0){
                    System.out.println("You are out of money! Game Over.");
                    break;
                }
                System.out.println("\nCurrent Balance: $"+balance);

                System.out.print("\nPlay again? (Y/N): ");
                play = scanner.next().toUpperCase();



            }

        }while(play.equals("Y"));
        if (play.equals("N")){
            System.out.println("Cashing out... Final Balance: $"+balance);
        }
    }

    public static String[] spinReels(){
        Random random = new Random();

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] chosen = new String[3];

        for (int i = 0; i < 3; i++) {
            int ran = random.nextInt(5);
            chosen[i] = symbols[ran];
            System.out.print(chosen[i]);
        }
        return chosen;

    }

    public static int calculatePayout(String[] reels, int betAmount){

        if (reels[0].equals(reels[1]) && reels[1].equals(reels[2])) {
            betAmount *= 10;
            System.out.println("JACKPOT! Payout: $"+betAmount);
            return betAmount;
        }
        else if (reels[0].equals(reels[1]) ||  reels[1].equals(reels[2]) || reels[0].equals(reels[2])){

            System.out.print("Minor Win! Payout: $"+(betAmount *= 2));
            return betAmount;
        }
        else {
            System.out.println("Loss! Payout: $0");
            return 0;

        }

    }
}
