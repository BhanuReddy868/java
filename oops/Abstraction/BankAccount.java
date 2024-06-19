
public interface BankAccount{
    void diposit(double amount);
    void withdraw(double amount);
    double getmoney();

} 
public class CheckingAccount implements  Interfaces1 {
    private double balance;
    @Override
    public void diposit(double amount){
        balance+=amount;

    }
    @override
    public  void withdraw(double ammount){
        if(amount<balance){
            balance-=amount;
        }
        else
        System.out.println("Insufficient Fund");
    }

    
}
