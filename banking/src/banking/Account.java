
package banking;

public class Account {
    
    double balance;
    int acc_no;
    public static int count=0;
    
    Account(int acc,double bal)
    {
        acc_no=acc;
        balance=bal;
        count++;
    }
    
    void deposit(double amt)
    {
        balance+=amt;
    }
    
    void withdraw(double amt)
    {
        if(balance-amt>500)
            balance-=amt;
        else
            System.out.println("Insufficient Balance!");
    }
}
