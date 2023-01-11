/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class Transaction {
    
//instance variables
private String creditcard_num;
private String company_name;
private String vehicle_type; // car, SUV or Truck
private String rental_period; // days, week, months
private String miles_driven;
private String rental_cost;


// Constructor
public Transaction(String creditcard_num, String company_name, String vehicle_type, String rental_period, String rental_cost, String miles_driven){
    this.creditcard_num = creditcard_num;
    this.company_name = company_name;
    this.vehicle_type = vehicle_type;
    this.rental_period = rental_period;
    this.miles_driven = miles_driven;
    this.rental_cost = rental_cost;
}


// Getter Methods
public String getCreditCardNum(){
    return creditcard_num;
}

public String getCompany_name(){
    return company_name;
}

public String getVehicle_type(){
    return vehicle_type;
    }

public String getRentalPeriod(){
    return rental_period;
}

public String getMilesDriven(){
        return miles_driven;
    }

public String getRentalCost(){
            return rental_cost;
}

public String toString(){
    return "Acct Num: " + getCreditCardNum() + "\n " + "Company Name: " + getCompany_name() + ", " +
    "Vehicle Type: " + getVehicle_type() + ", " + "Rental Period: " + getRentalPeriod()+ ", " + 
    "Miles Driven: " + getMilesDriven() + ", " + "Rental Cost: " + getRentalCost() + ", ";
  }
}