/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public class SUVRates extends VehicleRates{

	public SUVRates(double daily_rate, double weekly_rate, double monthly_rate, double mileage_rate, double daily_insur_rate){
		super(daily_rate, weekly_rate, monthly_rate, mileage_chrg, daily_insur_rate);
	  }
	private double daily_rate = 29.95;
	private double weekly_rate = 189.95;
	private double monthly_rate = 679.95;
	private static  double mileage_chrg = 0.16;
	private double daily_insur_rate = 14.95;

	
	public String toString(){
	  return "SUV Rates: \nDaily Rate: " + daily_rate + " \nWeekly Rate: " + weekly_rate + " \nMonthly Rate: " + monthly_rate + " \nMileage Rate: " + mileage_chrg+ " \nDaily Insurance Rate: " + daily_insur_rate;
	}
  }