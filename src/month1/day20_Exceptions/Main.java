package month1.day20_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

       /* try{
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
        }*/


        /*String filepath = "C:\\Users\\sudar\\Downloads\\mission_log.txt";
        String text = "Agent 007 Status Report\nThe target has been secured.";

        try(FileWriter writer = new FileWriter(filepath,true)){
            writer.write(text);
            writer.close();
            System.out.println("Log successfully written to hard drive.");
        }
        catch (IOException e){
            System.out.println("SYSTEM ERROR: Hard drive write failed.");
            e.printStackTrace();
        }*/

        String path = "C:\\Users\\sudar\\Downloads\\mission_log.txt";

        File myfile =  new File(path);
        try(Scanner scanner1 = new Scanner(myfile)){
            while (scanner1.hasNextLine()){
                System.out.println(scanner1.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("ALERT: Classified file not found!");
        }

    }
}
