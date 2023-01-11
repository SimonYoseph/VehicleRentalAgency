/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class Account{

  //instance variables
private String creditcard_num;
private String company_name;
private boolean prime_customer;

// Constructor
public Account(String creditcard_num, String company_name, boolean prime_customer){
    this.creditcard_num = creditcard_num;
    this.company_name = company_name;
    this.prime_customer = prime_customer ;
}

//Getter Methods
public String getCreditCardNum() {
return creditcard_num;
}

public String getCompany_name(){
    return company_name;
}

public boolean getPrimeCustomer() { 
return prime_customer;
}

 public String toString(){
     if (prime_customer == true){
         return ("Account number: " + getCreditCardNum() + " " + "Company name: " + getCompany_name() + " " + "Prime customer? Yes");
     }
     else{
          return ("Account number: " + getCreditCardNum() + " " + "Company name: " + getCompany_name() + " " + "Prime customer? No");
     }  
  } 
}