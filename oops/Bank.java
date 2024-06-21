 class BankAccount {
     static double balance;
     public BankAccount(double balance) {
         this.balance = balance;
     }
     public double getbalance() {
         return balance;
     }

     void diposit(double amount) {
         balance += amount;

     }

     public void withdraw(double amount) {
         if (balance >= amount) {
             balance -= amount;
         } else {
             System.out.println("Insufficient Balance");
         }
     }
 }

 class SavingAccount extends BankAccount {
        private double interest;

        public SavingAccount(double balance, double interest) {
            super(balance);
            this.interest = interest;
        }

        @Override
        public void diposit(double amount) {
            super.diposit(amount);
            balance += (amount * interest / 100);
        }
    }

    public class Bank {
        public static void main(String args[]) {
            BankAccount b = new BankAccount(1000);
            b.diposit(2000);
            System.out.println("Balance after deposited   :"+b.getbalance());
            b.withdraw(300);
            System.out.println("Balance after withdraw   :"+b.getbalance());

            SavingAccount sa = new SavingAccount(1000, 5);
            sa.diposit(500);
            System.out.println("balance after diposit :"+sa.getbalance());
            sa.withdraw(300);
            System.out.println("balance after withdraw :"+sa.getbalance());
        }
    }