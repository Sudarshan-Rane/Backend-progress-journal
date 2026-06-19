package month1.day4_nested_if_statements_and_substring;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

       /* Random random = new Random();

        boolean number = random.nextBoolean();
        if (number){
            System.out.println("HEADS");
        }
        else {
            System.out.println("FALSE");
        }*/

        /*double result = 10/3;
        System.out.println(result);*/

        /*Scanner scanner = new Scanner(System.in);

        double curren_cd;
        double target_cd;
        double multiplier;
        double abs_distance;
        double thrust;
        double fuel;


        System.out.print("Current X-Coordinate: ");
        curren_cd = scanner.nextDouble();

        System.out.print("Target X-Coordinate: ");
        target_cd = scanner.nextDouble();

        System.out.print("Base Engine Multiplier: ");
        multiplier = scanner.nextDouble();

        abs_distance = Math.abs(curren_cd - target_cd);
        thrust = Math.pow(abs_distance,  multiplier);
        fuel = Math.ceil(thrust/100.0);

        System.out.println("%n--- NAVIGATION COMPUTER ---%n");
        System.out.println("Absolute Distance: "+abs_distance+".%nThrust Required: "+thrust+".%nFuel Tanks Needed: "+fuel+".");




        scanner.close();*/

       /* String clientName = "Wayne Enterprises";
        int sharesOwned = 2500000;
        double sharePrice = 14.2;
        double totalValue = sharesOwned * sharePrice;

        System.out.printf("%n--- CLIENT LEDGER ---%nClient: %s%nShares: %,d%nPrice: $%.2f%nTotal Value: $%,.2f%n---------------------",clientName,sharesOwned,sharePrice,totalValue);
*/

        /*double p;
        double r;
        int n;
        int t;
        double final_amount;

        System.out.print("Enter principal amount: ");
        p = scanner.nextDouble();

        System.out.print("Enter interest rate (in %): ");
        r = scanner.nextDouble();

        System.out.print("Enter # of times compounded per year: ");
        n = scanner.nextInt();

        System.out.print("Enter # of years: ");
        t = scanner.nextInt();

        double div_rate = r/100;
        double base_of_exponent = 1.0+div_rate/n;
        int nt = n*t;
        double mul = Math.pow(base_of_exponent, nt);
        final_amount = p*mul;

        System.out.printf("The amount after %d years is: $%,.2f",t,final_amount);*/

        /*       double wind;
        int tier;
        boolean isEngine;
        boolean isOverride;

        System.out.print("Wind: ");
        wind = scanner.nextDouble();

        System.out.print("Tier: ");
        tier = scanner.nextInt();

        System.out.print("Engine: ");
        isEngine = scanner.nextBoolean();

        System.out.print("Override: ");
        isOverride = scanner.nextBoolean();

        if(wind<=0){
            System.out.println("Action: SYSTEM ERROR - Invalid Wind Speed.");
        }
        else if (tier == 3){
            if (wind>40 || !isEngine){
                System.out.println("Action: ABORT - Life Safety Risk.");
            }
            else {
                System.out.println("Action: CLEARED FOR MANNED LAUNCH.");
            }
        }
        else if (tier==2){
            if (wind>60){
                System.out.println("Action: ABORT - Wind limit exceeded.");
            }
            else {
                if (isEngine){
                    System.out.println("Action: CLEARED FOR SATELLITE LAUNCH.");
                }
                else {
                    if (isOverride){
                        System.out.println("Action: CLEARED WITH OVERRIDE.");
                    }
                    else {
                        System.out.println("Action: ABORT - Engine Suboptimal.");
                    }
                }
            }
        }
        else if (tier==1) {
            if (isOverride) {
                System.out.println("Action: CLEARED WITH OVERRIDE.");
            }
            else {
                if (wind<80 && isEngine) {
                    System.out.println("Action: CLEARED FOR CARGO LAUNCH.");
                }
                else {
                    System.out.println("Action: ABORT - Standard protocols failed.");
                }
            }

        }
        else {
            System.out.println("Action: SYSTEM ERROR - Unknown Mission Tier.");
        }
        */

        /*System.out.print("Enter your ID: ");
        String name = scanner.nextLine().trim();

        int length = name.length();

        if (length<5) {
            System.out.println("Error: ID too short.");
        }
        else if (name.equalsIgnoreCase("admin")){
            System.out.println("ALERT: Admin login attempt.");
        }
        else {
            String uppercase = name.toUpperCase();
            char first = name.charAt(0);
            String replaced = uppercase.replace('A', '@');
            System.out.printf("\n--- DATABASE ENTRY ---\nOriginal ID: %s%nLength: %d%nFirst Letter: %c%nFormatted ID: %s",name,length,first,replaced);

        }*/

        Scanner scanner = new Scanner (System.in);

        String dept;
        String year;
        String code;

        System.out.print("Scan Barcode: ");
        String barcode = scanner.nextLine().trim();

        if (barcode.length() != 13) {
            System.out.println("SYSTEM ERROR: Invalid Barcode Format.");
        }
        else {
            int startdash = barcode.indexOf("-");
            int lastdash = barcode.lastIndexOf("-");


            dept = barcode.substring(0, startdash);
            year = barcode.substring(startdash+1, lastdash);
            code = barcode.substring(lastdash+1);

            System.out.printf("%n--- DECODED SCAN ---%nDepartment: %s%nFIN Year: %s%nProduct Code: %s%n",dept,year,code);
        }

        scanner.close();

    }


}
