package month1.day15_Practise;

public class Trade {

    String ticker;
    double price;
    int shares;

    Trade(String ticker, double price, int shares){
        this.ticker =ticker;
        this.price = price;
        this.shares = shares;
    }

    public double getTradeValue(){
        double total = this.price * this.shares;
        return total;
    }
}
