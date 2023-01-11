/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class SUV extends Vehicle{

    //instance variables
    private String cargo_capacity;
    private String seating; 
  
  //constructors
  public SUV(String description, String mpg, String seating, String cargo_capacity, String vin){
    super(description, mpg, vin);
      this.seating = seating;
      this.cargo_capacity = cargo_capacity;  
  }
  
    //Getters
  public String getCargoCapacity(){
    return cargo_capacity;
  }
  public String getSeating() {
          return seating;
      } 
    
  public String toString(){
    return "SUV: " + getDescription() + " " + getMPG() + " " + getSeating() + " " + getCargoCapacity() + " " + getVIN() + " ";
  }
}