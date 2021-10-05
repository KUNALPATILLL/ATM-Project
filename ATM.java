package ATMProject;

import java.util.*;
import java.util.Scanner;  
    
    public class ATM{ 
        public static void main(String args[] ) {  
            int balance = 0, withdraw, deposit;  
            Scanner sc = new Scanner(System.in);  
            
            HashMap <Integer, Integer> data = new HashMap<>();
            data.put(98574634, 1234);
            data.put(78325494, 8756);
            data.put(43264326, 1506);
            
            int accNo , pin;
            System.out.println("Enter the account Number ");
            accNo = sc.nextInt();
            System.out.println("Enter the pin ");
            pin = sc.nextInt();
              
            
//         // Get the iterator over the HashMap
            Iterator<Map.Entry<Integer, Integer>>iterator = data.entrySet().iterator();
            while (iterator.hasNext()) {          	  
                // Get the entry at this iteration
            Map.Entry<Integer, Integer> entry = iterator.next();
      
            if (accNo == entry.getKey()) {
            
            while(true) {  
                System.out.println("ATM Machine\n");  
                System.out.println("Choose 1 for Withdraw");  
                System.out.println("Choose 2 for Deposit");  
                System.out.println("Choose 3 for Check Balance");  
                System.out.println("Choose 4 for EXIT\n");  
                System.out.print("Choose the operation:");  
                   
            int choice = sc.nextInt();  
            switch(choice)  {
            
            case 1:  
            System.out.print("Enter money to be withdrawn:");  
                          
            withdraw = sc.nextInt();                  
            //check whether the balance is greater than or equal to the withdrawal amount  
            if(balance >= withdraw){  
                //remove the withdrawl amount from the total balance  
                balance = balance - withdraw;  
                System.out.println("Please collect your money");  
            }  
            else {  
                //show custom error message   
                System.out.println("Insufficient Balance");  
            }  
            System.out.println("");  
            break;  
       
            case 2:  
            System.out.print("Enter money to be deposited:");                          
            //get deposite amount from te user  
            deposit = sc.nextInt();  
            //add the deposit amount to the total balanace  
            balance = balance + deposit;  
            System.out.println("Your Money has been successfully depsited");  
            System.out.println("");  
            break;  
       
            case 3:  
            //displaying the total balance of the user  
            System.out.println("Balance : "+balance);  
            System.out.println("");  
            break;  
       
            case 4:  
            //exit from the menu  
            System.exit(0);  
              }
            }
            }
            else {
            	System.out.println("Please enter valid Account Number / Pin");
            }
            
            }  
        }  
    }  
	

