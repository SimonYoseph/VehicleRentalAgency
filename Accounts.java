/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */


import java.util.ArrayList;


public class Accounts {
  
   private ArrayList<Account> accts;
   private int current;

 public Accounts(ArrayList<Account> accts){
  accts = new ArrayList<Account>(accts); 
        current = 0; 
 }

 public void addAccount(Account item){
  accts.add(item);
}

 public Account getAccount(String CreditCardNum) throws InvalidCreditCardException, AcctNumberNotFoundException{

   for(Account item : accts)
    if(item.getCreditCardNum() == CreditCardNum)
      return item;
       else{

   System.out.println("Account not found");
   }
   return null;
 }

 //iterator methods
 public void reset(){   // resets to first vehicle in list
  current = 0;
}

 public boolean hasNext(){  // returns true if more vehicles in list to retrieve
    return (current < accts.size());
   }

 public Accounts getNext(){   // returns next vehicle in list
  if(hasNext() == true)
        current++; 
        return null;
  }
}