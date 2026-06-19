package month1.day3_condiitional_Statements;
import java.util.Scanner;


public class Main {

   public static void main(String[] args){

        /*Scanner scanner = new Scanner(System.in);
        // started at 45min yt
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        boolean isGender;
        String gender;

        System.out.print("What's your gender (M=true/F=false): ");
        isGender = scanner.nextBoolean();

        if (isGender){
            gender = "Male";
        }
        else {
            gender  = "female";
        }

        System.out.print("So according to you provided details this are your details: ");
        System.out.println("Your name is "+name+".Your are "+age+" years old and you are a "+gender+".");


        scanner.close();*/

       /*String adjective1;
       String noun1;
       String noun2;
       String verb1;
       int number;

       System.out.print("Enter your first adjective: ");
       adjective1 = scanner.nextLine();

       System.out.print("Enter a number: ");
       number = scanner.nextInt();

       scanner.nextLine();
       System.out.print("Enter your first noun: ");
       noun1 = scanner.nextLine();

       System.out.print("Enter your second noun: ");
       noun2 = scanner.nextLine();

       System.out.print("Enter your verb: ");
       verb1 = scanner.nextLine();

       System.out.println("So here's your sentence in completed form: ");
       System.out.println("One day, a extremely "+adjective1+" "+noun1+" decided to learn Java.");
       System.out.println("They drank "+number+" cups of coffee and coded for hours.");
       System.out.println("Eventually, they successfully built a "+noun2+" that could "+verb1+"!");*/

       /*System.out.print("What item are you buying?: ");
       String item = scanner.nextLine();

       System.out.print("What is the price for one?: ");
       double price = scanner.nextDouble();

       System.out.print("How many do you want?: ");
       int quantity = scanner.nextInt();


       double total = price * quantity;
       double tax = total*0.05;

       double totalprice = total+tax;
       System.out.println("\n--- RECEIPT ---\n");
       System.out.println("You are buying "+quantity+" "+item+"(s).\nYour total amount is $"+totalprice+" with taxes included");*/

       Scanner scanner = new Scanner(System.in);

       double cartTotal;
       boolean premium_member;
       boolean int_shipment;
       double total;
       double extra = 0;


       System.out.print("Enter your cart total: ");
       cartTotal = scanner.nextDouble();

       if (cartTotal <= 0.0){
           System.out.println("Error: Cart is empty. Cannot process order.");
       }
       else {
           System.out.print("Do you have premium membership? (true for 'yes' and false for 'no'): ");
           premium_member = scanner.nextBoolean();

           System.out.print("Is this an international shipment? (true for 'yes' and false for 'no'): ");
           int_shipment = scanner.nextBoolean();


           if (int_shipment){
               if (premium_member){
                   total = cartTotal+10;
                   extra = 10;
               }
               else {
                   total = cartTotal+20;
                   extra = 20;
               }
           }
           else {
               if (premium_member){
                   total = cartTotal;
               }
               else if (cartTotal>=100) {
                   total = cartTotal;
               }
               else {
                   total = cartTotal+5;
                   extra = 5;
               }
           }

           System.out.println("Your shipping is $"+extra+". Your final total is $"+total);
       }



        scanner.close();


    }


}
