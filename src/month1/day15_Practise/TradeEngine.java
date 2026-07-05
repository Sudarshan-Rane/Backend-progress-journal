package month1.day15_Practise;

import java.util.ArrayList;

public class TradeEngine {
    public static void main(String[] args){

        ArrayList<Trade> dailyTrades = new ArrayList<>();

        dailyTrades.add(new Trade("AAPL", 150.0, 10));
        dailyTrades.add(new Trade("TSLA", 200.0, 50));
        dailyTrades.add(new Trade("MSFT", 300.0, 5));
        dailyTrades.add(new Trade("TSLA", 205.0, 100));

        System.out.println("Total Daily Volume: $"+calculateTotalVolume(dailyTrades));
        printHighValueTrades(dailyTrades,9000);
    }


    public static double calculateTotalVolume(ArrayList<Trade> dailyTrades){
        double total = 0;
        for (Trade daily : dailyTrades){
            total += daily.getTradeValue();
        }
        return total;
    }

    public static void printHighValueTrades(ArrayList<Trade> portfolio, double threshold){

        for (Trade port : portfolio){
            if(port.getTradeValue()>threshold){
                System.out.println("ALERT: Large trade detected - "+port.ticker);
            }
        }

    }


}
