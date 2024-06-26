interface BankAccount{
    void diposit(double amount);
    void withdraw(double amount);
    double getmoney();

}
class CheckingAccount implements BankAccount {
    private double balance;
    @Override
    public void diposit(double amount){
        balance+=amount;

    }

    public  void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient Fund");

        }
    }

    public double getmoney(){
        return balance;


    }

}
public class Interfaces{
    public static void main(String args[]){
        BankAccount b=new CheckingAccount();
        b.diposit(100);
        System.out.println("amount diposited  "+ b.getmoney());
        b.withdraw(50);
        System.out.println("After withdraw "+ b.getmoney());

    }
}