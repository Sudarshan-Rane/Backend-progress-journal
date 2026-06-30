package month1.day11_refreshersesh_StartofOOPS;

import java.util.Scanner;

public class FraudMonitor {

    public static void main(String[] args){

        Scanner scanner =  new Scanner (System.in);

        double balance = 500.0;
        double[] history = new double[5];

        System.out.println("--- FINTECH FRAUD MONITOR ---");
        System.out.println("Starting Balance: $"+balance);

        for (int i = 1; i <= history.length; i++) {

            System.out.print("Day "+i+" - Enter transaction amount:");
            double transx = scanner.nextDouble();

            double method1 = processTransaction(balance,transx);

            if (method1 == -1){
                System.out.println("Declined: Insufficient Funds.");
                history[i-1] = 0;
            }
            else {
                balance = method1;
                System.out.println("Approved. New Balance: $"+balance);
                history[i-1] = transx;
            }



        }

        /*for(double his : history){
            System.out.print(his+" ");
        }*/

        System.out.println("--- ANALYSIS COMPLETE ---");
        System.out.println("Longest Spending Spree (>$100): "+findLongestSpendingSpree(history)+" days");

    }

    public static double processTransaction(double currentBalance, double transactionAmount){
        if (transactionAmount>currentBalance) {
            return -1;
        }
        else {
            currentBalance -= transactionAmount;
            return currentBalance;
        }
    }

    public static int findLongestSpendingSpree(double[] history){
        int counter = 0;
        int highest = 0;

        for (double his : history){
            if (his > 100) {
                counter++;
                if (counter>highest){
                    highest = counter;
                }
            }
            else {
                if (counter>highest){
                    highest = counter;
                }
                counter = 0;
            }
        }
        return highest;
    }





}
