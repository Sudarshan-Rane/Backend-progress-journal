package month1.day20_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;




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

        /*        String path = "C:\\Users\\sudar\\Downloads\\mission_log.txt";

        File myfile =  new File(path);
        try(Scanner scanner1 = new Scanner(myfile)){
            while (scanner1.hasNextLine()){
                System.out.println(scanner1.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("ALERT: Classified file not found!");
        }*/

        /*LocalDateTime newone = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");

        String receiptTime = newone.format(myFormat);

        System.out.println("Transaction successful on: "+receiptTime);

        LocalDate date1 = LocalDate.now();

        System.out.print("Enter the your birth year: ");
        int y = scanner.nextInt();
        System.out.print("Enter the your birth month: ");
        int m = scanner.nextInt();
        System.out.print("Enter the your birth day: ");
        int d = scanner.nextInt();

        LocalDate date2 = LocalDate.of(y,m,d);

        Period age = Period.between(date2,date1);
        System.out.println("I am exactly "+age.getYears()+" years and "+age.getMonths()+" months old.");

        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter newf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");

        System.out.println("Current time in Tokyo: " + tokyoTime.format(newf));

        scanner.close();*/

        Gadget newGadget = new Gadget();
        newGadget.activate();

        Gadget spyWatch = new Gadget(){
            @Override
            void activate(){
                System.out.println("Spy Watch lasers firing! 🔴");
            }
        };

        spyWatch.activate();


    }
}
