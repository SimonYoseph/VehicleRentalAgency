/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class TruckRates extends VehicleRates{

	private double daily_rate = 36.95;
	private double weekly_rate = 224.95;
	private double monthly_rate = 687.95;
	private double mileage_chrg = 0.26;
	private double daily_insur_rate = 21.95;
  
	public TruckRates(double daily_rate, double weekly_rate, double monthly_rate, double mileage_chrg, double daily_insur_rate){
	  super(daily_rate,weekly_rate, monthly_rate, mileage_chrg, daily_insur_rate);
	}

	public String toString(){
	  return "Truck rates: \nDaily Rate: " + daily_rate + "\nWeeklyRate: " + weekly_rate + "\nMonthly Rate: " + monthly_rate + "\nMileage Rate: " + mileage_chrg+ "\nDaily Insurance Rate: " + daily_insur_rate;
	}
  }