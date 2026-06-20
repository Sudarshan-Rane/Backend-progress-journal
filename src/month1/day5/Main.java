package month1.day5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

         /*       int age;
        boolean list;
        String day;
        int basecharge;

        System.out.print("Age: ");
        age = scanner.nextInt();

        System.out.print("Are you on the Guest List?: ");
        list = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Day of the week: ");
        day = scanner.nextLine();



        String entry = (age>=21) ? "Granted":"Denied";

        basecharge = switch (day){
            case "Monday", "Tuesday", "Wednesday" -> 5;
            case "Thursday", "Sunday" -> 10;
            case "Friday", "Saturday" -> 20;
            default -> 20;
        };


        int fee = (list) ? 0:basecharge;

        System.out.println("Entry: "+entry+"\nCover charge: $"+fee);

*/

        /*  int clearance;
        boolean compliant;
        boolean VPN;
        boolean iP;
        boolean flag;

        System.out.print("clearance: ");
        clearance = scanner.nextInt();

        System.out.print("compliant: ");
        compliant = scanner.nextBoolean();

        System.out.print("VPN: ");
        VPN = scanner.nextBoolean();

        System.out.print("iP: ");
        iP = scanner.nextBoolean();


        flag  =(!iP && compliant) && ((clearance == 5) || ((clearance==3 || clearance==4)&&(VPN)) );

        System.out.println("Access Granted: "+flag);*/

        /*        double stock;
        int win;
        boolean open;
        boolean voltile;
        boolean executeTrade = false;

        System.out.print("Stock: ");
        stock = scanner.nextDouble();

        System.out.print("Win: ");
        win = scanner.nextInt();

        System.out.print("Open: ");
        open = scanner.nextBoolean();

        System.out.print("Voltile: ");
        voltile = scanner.nextBoolean();

        executeTrade = ((open && stock > 0) && ((!voltile && win>=70) || (voltile && win>90 && stock <50)));

        System.out.println("Execute Trade: "+executeTrade);*/

        /*System.out.print("\n----ATM----\nEnter four digit pin: ");
        int range = scanner.nextInt();

        do {
            System.out.print("Enter range again: ");
            range = scanner.nextInt();
        }while(range.);
        System.out.print("GG");*/

        /*int secretpin;
        int guess=1234;
        int attempts=3;

        System.out.print("Enter your ATM pin: ");
        secretpin = scanner.nextInt();

        while(guess!=secretpin && attempts >= 1){
            System.out.println("INCORRECT PIN");
            System.out.println("You have "+attempts+" left");
            System.out.print("Enter your ATM pin again: ");
            secretpin = scanner.nextInt();
            attempts--;
        }
        if (attempts == 0 ){
            System.out.println("Account Locked. Too many failed attempts.");
        }
        else {
            System.out.println("Access Granted! Welcome to your account.");
        }*/


        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter number 1: ");
        int number = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();

        while(number <= 0 || number2 <= 0) {

            System.out.println("----Enter positive number for both----");

            System.out.print("Enter number 1: ");
            number = scanner.nextInt();

            System.out.print("Enter number 2: ");
            number2 = scanner.nextInt();
        }

        System.out.println("Sum = " +(number+number2));


        scanner.close();
    }
}
