package month1.day07_Methods_and_Overloading_methods_practise;
import java.util.Scanner;
import java.util.Random;
public class Methods_practise {

    static Scanner scanner = new Scanner(System.in);

    static Random random = new Random();


    public static void main(String[] args) {
        String firstName = "";
        String lastName = "";
        int id = 0;


        int age = 0;
        boolean isMember = false;
        boolean holdsGoldenTicket = false;

        int secretcode = random.nextInt();

        double grandtotal = 0.0;


        System.out.println(generateEmail(firstName,lastName,id));
        System.out.println(qualifiesForVip(age,isMember,holdsGoldenTicket));
        vaultTerminal(secretcode);

        while(true){
            System.out.print("Enter item price (or type 0 to checkout): ");
            double price = scanner.nextDouble();

            if (price<=0) {
                break;
            }
            else{
                grandtotal += price;
            }
        }

        System.out.print("Your final total with tax is: $"+applyTax(grandtotal));


    }


    public static String generateEmail(String firstName, String lastName, int id){

        System.out.print("Enter your Firstname: ");
        firstName = scanner.nextLine().toLowerCase();

        System.out.print("Enter your Lastname: ");
        lastName = scanner.nextLine().toLowerCase();

        System.out.print("Enter your id: ");
        id = scanner.nextInt();

        String all = firstName.charAt(0) + lastName + id + "@corp.com";

        return all;

    }

    public static boolean qualifiesForVip(int age, boolean isMember, boolean holdsGoldenTicket){

        // Skipped the scanner input since it was taking too long to code since this is just an exercise so ignore this

        boolean result = ((holdsGoldenTicket)||(age>=18&&isMember)) ? true : false;
        return result;
    }

    public static void vaultTerminal(int secretCode){
        int attempts = 3;
        while(attempts>=1){
            System.out.print("Enter 4-digit code: ");
            int guess = scanner.nextInt();

            if (guess==secretCode){
                System.out.println("Vault Opened.");
                break;
            }
            else{
                System.out.println("Access Denied.");
            }
            attempts--;
        }
        if (attempts==0)
        {
            System.out.println("SYSTEM LOCKDOWN.");
        }

    }

    public static double applyTax(double subtotal){
        return subtotal*1.08;
    }

}

