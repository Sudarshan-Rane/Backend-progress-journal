package month1.day02_syntaxandpractise;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
//        System.out.println("Java is a great language and its greatly used in FINTECH companies widely");

        /*int id = 10;
        double percentage = 99.64;
        char sign = '%';
        boolean isEligible =true;
        if (isEligible){
            System.out.println("Student with the id "+id+" has achieved a total percentage of "+percentage+sign+" and is the class topper.");
        }

        String tower = "odosfkmdasdfsako tower";
        System.out.println("The tower name is "+tower+ "this tower is the height of "+percentage+" meters talls. Making it one of the most tallest towers in Tokyo");
*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("welkommen "+name);

        scanner.close();
    }
}
