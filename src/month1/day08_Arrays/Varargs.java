package month1.day08_Arrays;

import java.util.Scanner;

public class Varargs {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        printRoster("Justice League", "Batman", "Superman", "Wonder Woman");
        printRoster("The Lone Wolf"); // Passing 0 players!


        int topScore = findHighestScore(15, 99, 42, 7, 88);
        System.out.println("The highest score was: " + topScore);

        int noScore = findHighestScore(); // Passing 0 scores!
        System.out.println("Highest score of empty game: " + noScore);

    }

    public static void printRoster(String teamName, String... players){

        System.out.println("--- Team: " + teamName + " ---");
        if (players.length == 0) {
            System.out.println("No players joined.");
        }
        else {
            for (String player : players){
                System.out.println(player);
            }
        }

    }
    public static int findHighestScore(int... scores){
        int highest = 0;
        if (scores.length == 0) {
            return 0;
        }
        else {

            for (int score : scores){
                if (score>highest) {
                    highest = score;
                }
            }
        }
        return highest;
    }
}
