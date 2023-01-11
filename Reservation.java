/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class Reservation { 
    private String companyName;             
    private String creditCardNum;  
    private TimeSpan rentalPeriod;
    private String insuranceSelected;
  
  
  // Constructor
    public Reservation(String companyName, String creditCardNum, TimeSpan rentalPeriod, String insuranceSelected) {
        this.companyName = companyName;              
        this.creditCardNum = creditCardNum;
        this.rentalPeriod = rentalPeriod;
        this.insuranceSelected = insuranceSelected;
    }
    
    //Getter Methods
    public String getComp_Name(){   // customer name
      return companyName;
    }
  
    public String getCCN(){   // credit card number on file for company account
      return creditCardNum;
    }
  
    public TimeSpan getRentPeriod(){   // e.g., TimeSpan type stores number of days, weeks or months
      return rentalPeriod;
    }
  
    public boolean getInsuranceSelected(String option){   // set to true if optional daily insurance wanted// indicates if optional daily insurance wanted
    option = "Yes";
  if (insuranceSelected == option){
    return true;
  }    
      else{
        return false;
      }  
    }
  
    public String toString(){
      return "Name: " + getComp_Name() + " " + "Credit Card Num: " + getCCN() + " " + "Rent Period: " + getRentPeriod() + " ";
    }
  }