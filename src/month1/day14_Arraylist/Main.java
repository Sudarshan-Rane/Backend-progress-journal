package month1.day14_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ArrayList<String> playlist = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        playlist.add("Bohemian Rhapsody");
        playlist.add("Hotel California");
        playlist.add("Stairway to Heaven");

        playlist.add(1, "Perfect");

        playlist.remove(0);

        System.out.println("Total Tracks: "+playlist.size());

        System.out.println("--- CURRENT PLAYLIST ---");

        for (String play: playlist){

            System.out.println("Track: "+play);
        }

        System.out.println();

        System.out.print("Write in the name of the song you want to remove: ");
        String song = scanner.nextLine();

        System.out.println();

        playlist.remove(song);


        System.out.println("Total Tracks: "+playlist.size());

        System.out.println("--- CURRENT PLAYLIST ---");

        for (String play: playlist){

            System.out.println("Track: "+play);
        }


        scanner.close();


    }


}
