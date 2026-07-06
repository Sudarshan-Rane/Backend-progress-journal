package month1.day08_Arrays;

public class ArrayMastery {


    public static void main(String[]args){

        int[] threat = {14, 55, 12, 99, 3};
        System.out.println("Max Threat: " + findMaxThreat(threat));
        System.out.println();

        int[] score = {10, -2, 30, -99, 50};
        sanitizeScores(score);
        System.out.println();
        System.out.println("Fixed Scores: " + java.util.Arrays.toString(score));
        System.out.println();

        String[] vips = {"Bruce", "Diana", "Arthur"};
        System.out.println("Is Clark VIP? " + isVip(vips, "Clark"));
        System.out.println("Is BRUCE VIP? " + isVip(vips, "BRUCE"));
        System.out.println();

        printGuild("Justice League", "Batman", "Wonder Woman", "Flash");
        printGuild("Solo Leveling"); // 0 members

    }

    public static int findMaxThreat(int[] threats){
        int highest=0;
        if (threats.length==0) {
            return 0;
        }
        for (int threat : threats){
            if (threat > highest) {
                highest = threat;
            } else {
                continue;
            }// lemme know if this else statement is necessary or not
        }

        return highest;
    }

    public static void sanitizeScores(int[] scores){

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]<0){
                scores[i]=0;
            }
            System.out.print(scores[i]+" ");

        }



    }

    public static boolean isVip(String[] guestList, String targetName){
        boolean checker = false;
        for (String guest : guestList){
            checker=guest.equalsIgnoreCase(targetName);
            if (checker){
                break;
            }
        }
        return checker;
    }

    public static void printGuild(String guildName, String... members){

        if (members.length==0){
            System.out.println("\nGuild is empty.");
        }
        else {
            System.out.println("--- Guild: "+guildName+" ---");
            System.out.println("Total Members: "+members.length);
            int i = (members.length-1);
            String lastMember = members[i];
            System.out.println("Newest Member: "+lastMember);
        }



    }



}


