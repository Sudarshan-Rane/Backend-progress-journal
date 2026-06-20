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


        Scanner scanner = new Scanner(System.in);

        int clearance;
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

        System.out.println("Access Granted: "+flag);

        scanner.close();
    }
}
