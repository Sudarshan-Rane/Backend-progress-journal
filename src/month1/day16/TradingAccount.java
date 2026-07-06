package month1.day16;


public class TradingAccount{
    private String accountId;
    private double balance;
    private boolean isFrozen = false;

    TradingAccount(String accountId, double balance){
        this.accountId = accountId;
        this.balance = balance;
        this.isFrozen = false;
    }

    String getAccountId(){
        return this.accountId;
    }
    double getBalance(){
        return this.balance;
    }
    boolean isFrozen(){
        return this.isFrozen;
    }

    void setFrozen(boolean frozen){
        this.isFrozen = frozen;
    }

    void setBalance(double balance){

        if (isFrozen){
            System.out.println("ERROR: Account is frozen. Cannot modify balance.");
        } else if (balance < 0) {
            System.out.println("ERROR: Margin calls not allowed. Balance cannot be negative.");
        }
        else{
            this.balance = balance;
            System.out.println("SUCCESS: Balance updated.");
        }
    }


    public static void main(String[] args){
        TradingAccount acc = new TradingAccount("ACC-8899",1500.0);

        acc.setBalance(-500.0);
        acc.setFrozen(true);
        acc.setBalance(2000.0);


        System.out.println("Final Balance for "+ acc.getAccountId()+" is $"+acc.getBalance());
    }

}

