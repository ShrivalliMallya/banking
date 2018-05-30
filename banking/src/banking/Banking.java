package banking;
import java.util.Scanner;

public class Banking{
    
    String name;
    double balance;
    int acc_no;
    
    void deposit(double amt)
    {
        balance+=amt;
    }
    
    
    void withdraw(double amt)
    {
        if(balance>amt)
            balance-=amt;
        else
            System.out.println("Insufficient Balance!");    
    }
    
    void balenq()
    {
        
         System.out.println("Balance=" +balance);
    }
    
    public static void main(String[] args){
        
        Scanner inp=new Scanner(System.in);
        Banking[] a= new Banking[20];
        int i,c=0;
        int acc;
        for(i=0; i<a.length; i++)
        {
            a[i]=new Banking();
        }
        
        exit:
        while(true)
        {
           System.out.println("Enter 1.Create 2.Deposit 3.Withdraw 4.Transfer 5.Total amount 6.Richest person 7.Exit");
           int ch= inp.nextInt();
           switch(ch)
           {
               case 1: {
                         System.out.println("Enter the account number:");
                         acc=inp.nextInt();
                         boolean found=false;
                         for(i=0; i<a.length; i++)
                         {
                             if(a[i].acc_no==acc)
                             {
                                 System.out.println("Account already exists!");
                                 found=true;
                                 break;
                             }
                          }
                         
                         if(found==false)
                         {
                             System.out.println("Enter the name:");
                             a[c].name=inp.next();
                             a[c].acc_no=acc;
                             System.out.println("Enter the initial amount:");
                             double amt=inp.nextDouble();
                             a[c].balance=amt;
                             c++;
                         }
                         break;
                     }
                     
               case 2: {
                            System.out.println("Enter the account number:");
                            acc=inp.nextInt();
                            for(i=0; i<a.length; i++)
                            {
                                if(a[i].acc_no==acc)
                                {
                                    System.out.println("Enter the amount to be deposited:");
                                    double damt=inp.nextDouble();
                                    a[i].deposit(damt);
                                    a[i].balenq();
                                    break;
                                }
                                    
                            }
                            
                            if(i==a.length)
                                   System.out.println("Account does not exist!");
                            
                            break;
                        }
               case 3:  {
                            System.out.println("Enter the account number:");
                            acc=inp.nextInt();
                            for(i=0; i<a.length; i++)
                            {
                                if(a[i].acc_no==acc)
                                {
                                    System.out.println("Enter the amount to be withdrawn:");
                                    double wamt=inp.nextDouble();
                                    a[i].withdraw(wamt);
                                    a[i].balenq();
                                    break;
                                }
                                    
                            }
                            
                            if(i==a.length)
                                   System.out.println("Account does not exist!");
                            
                            break;
                        }
               case 4:
                        {
                             double amt;
                             System.out.println("Enter the account number from which the money is to be transferred:");
                             int acc1=inp.nextInt();
                             System.out.println("Enter the account number to which the money is to be transferred:");
                             int acc2=inp.nextInt();
                             System.out.println("Enter the amount to be transferred:");
                             amt=inp.nextDouble();
                             
                             for(i=0; i<a.length; i++)
                            {
                                if(a[i].acc_no==acc1)
                                {
                                    
                                    a[i].withdraw(amt);
                                    a[i].balenq();
                                    break;
                                }
                             } 
                             if(i==a.length)
                             {
                                 System.out.println("Account does not exist!");
                                 break;
                             }
                             
                             for(i=0; i<a.length; i++)
                            {
                                if(a[i].acc_no==acc2)
                                {
                                    a[i].deposit(amt);
                                    a[i].balenq();
                                    break;
                                }
                             } 
                             if(i==a.length)
                             {
                                 System.out.println("Account does not exist!");
                                 break;
                             }
                             break;
                        }
                      
               case 5:
                        {
                             double tamt=0;
                             
                             for(i=0; i<a.length; i++)
                             {
                                 tamt+=a[i].balance;
                             }
                             
                             System.out.println("Total amount in the bank:" +tamt);
                             break;
                        }
                        
               case 6:{
                            double h = a[0].balance;
                            int j=0;
                            for(i=0; i<a.length; i++)
                            {
                                if(a[i].balance>h)
                                {
                                    h=a[i].balance;
                                    j=i;
                                }
                            }
                           
                            
                            System.out.println("The richest person is:" +a[j].name);
                            break;
                       }
               
               case 7: break exit;
              
               }
           }
    }
}