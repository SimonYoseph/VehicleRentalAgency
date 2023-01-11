/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class Car extends Vehicle{
  
    private String seating;
  
    public Car (String description, String mpg, String seating, String vin){
  
      super(description, mpg, vin);
      this.seating = seating;
    }
  
    public String getSeating(){
      return seating;
    }
  
    public String toString(){
    return "Car: " + getDescription() + " " + getMPG() + " " + getSeating() + " " + getVIN() + " ";
  }
}