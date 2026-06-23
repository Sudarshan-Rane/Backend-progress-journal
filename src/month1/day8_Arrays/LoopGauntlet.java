//9:30
package month1.day8_Arrays;




public class LoopGauntlet {
    public static void main (String[] args){

        // Phase 1 Tests
        String[] farmA = {"ONLINE", "ONLINE", "ONLINE"};
        String[] farmB = {"ONLINE", "OFFLINE", "ONLINE"}; // The Trap!
        System.out.println("Farm A Stable? " + isSystemStable(farmA)); // Should be true
        System.out.println("Farm B Stable? " + isSystemStable(farmB)); // Should be false

        // Phase 2 Tests
        int[] logA = {80, 443, 8080, 999, 21};
        int[] logB = {80, 443, 21};
        System.out.println("Critical Port Index (Log A): " + findCriticalPort(logA)); // Should be 3
        System.out.println("Critical Port Index (Log B): " + findCriticalPort(logB)); // Should be -1

        // Phase 3 Tests
        double[] serverTemps = {45.5, 90.2, 88.0, 95.1, 40.0};
        System.out.println("Overheating Servers: " + countOverheating(serverTemps, 85.0)); // Should be 3

    }

    public static boolean isSystemStable(String[] statuses){
        boolean check=false;

        for (String status : statuses) {
            if (status.equals("OFFLINE")) {
                check = false;
                break;
            } else {
                check = true;
            }

        }

        return check;
    }

    public static int findCriticalPort(int[] ports){
        for (int i = 0; i < ports.length; i++) {
            if (ports[i]==999){
                int loc = i;
                return loc;
            }
        }
        return -1;
    }

    public static int countOverheating(double[] temps, double threshold){
        int counter=0;
        for (double temp : temps) {
            if (temp > threshold) {
                counter++;
            }
        }
        return counter;

    }


}
