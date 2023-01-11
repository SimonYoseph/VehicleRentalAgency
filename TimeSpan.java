/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class TimeSpan {
    private char timeUnit;
    private int numUnits;

   // Constructor
  public TimeSpan (char tU, int nU){
      timeUnit = tU;          // ‘D’ (day), ‘W’ (week), ‘M’ (month)
      numUnits = nU;          // num of days, weeks or months
  }

  // Getter Methods
    public char getTimeUnit(){
      return timeUnit;
        }

    public int getNumUnits(){
       return numUnits;
        }
        
    public String toString(){
        return numUnits + " " + timeUnit;
        }
}
