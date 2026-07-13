package month1.day17_Associations;

public class CryptoWallet {

    String name;

    CryptoWallet(String name){
        this.name = name;
    }

    void created(){
        System.out.println("[+] CryptoWallet "+this.name+" created on the blockchain.");
    }
}

class BankAccount{
    String name;

    BankAccount(String name){
        this.name = name;
    }

}

class UserProfile{

    String user;
    BankAccount acc1;
    CryptoWallet cw;

    UserProfile(String user, CryptoWallet cw){
        this.user = user;
        this.acc1 = new BankAccount("BankACC");
        this.cw = cw;
    }

    void merged(){
        System.out.println("[+] Secure "+this.acc1.name+" generated internally. Profile for "+this.user+" is active with both accounts.");
    }




}
