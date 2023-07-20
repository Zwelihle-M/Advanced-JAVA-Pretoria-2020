/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zwelihle
 */

public class Account {
    
    
    private String accountNumber;
     private String fullName;
      private String openDate;
        private double balance;
        
        public Account(String accNumber, String fullname, String Date,double accBalance)
        {
            
            this.accountNumber = accNumber;
            this.fullName = fullname;
            this.openDate = Date;
            this.balance = accBalance;
        }
        
        public void withdraw(double amount)
        {
        this.balance = this.balance - amount;
        }
        
         public void deposit(double amount)
        {
        this.balance = this.balance + amount;
        }
         
         
         public void transfer(Account a,double amount)
        {
        this.withdraw (amount);
        a.deposit(amount);
        }
         
         //get methods
         public String getAccountNumber()
         
         {  return this.accountNumber;
         
         }
         
          public String getOpenDate()
         
         {  return this.openDate;
         
         }
          
           public String getFullName()
         
         {  return this.fullName;
         
         }
           
          
          public double getBalance()
          
          {
              return this.balance;
          
          
          }
         
        
         
        @Override
        public String toString()
        {
            return this.accountNumber;
        }
         
         
       
    
    
    
}
