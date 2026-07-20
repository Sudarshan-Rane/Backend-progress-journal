package month1.day20_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter your 4-digit PIN: ");
            int pin = scanner.nextInt();
            System.out.println("Access Granted for PIN: "+pin);
        }
        catch (InputMismatchException e){
            System.out.println("SECURITY ALERT: You must enter numbers only! Access Denied.");
        }
        finally {
            System.out.println("--- System Connection Closed ---");
            scanner.close();
        }
    }
}
