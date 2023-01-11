/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class Truck extends Vehicle{
    private String load_capacity;
    
      public Truck(String description, String mpg, String load_capacity, String vin){
        
        super(description, mpg, vin);
        this.load_capacity = load_capacity;
      }
    
      public String getLoad(){
        return load_capacity;
      }
      
     public String toString(){
      return "Truck: " + getDescription() + " " + getMPG() + " " + getLoad() + " " + getVIN() + " ";
    }
    }
