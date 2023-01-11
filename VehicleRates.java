/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public abstract class VehicleRates {
	private double daily_rate;
	private double weekly_rate;
	private double monthly_rate;
	private double mileage_chrg;
	private double daily_insur_rate;

//Constructor
public VehicleRates(double daily_rate, double weekly_rate, double monthly_rate, double mileage_chrg, double daily_insur_rate){
	this.daily_rate = daily_rate;
	this.weekly_rate = weekly_rate;
    this.monthly_rate = monthly_rate;
    this.mileage_chrg = mileage_chrg;
    this.daily_insur_rate = daily_insur_rate;    
}	
  
	public double getDailyRate(){       // cost per day
		return daily_rate;
	}

	public double getWeeklyRate(){      // cost per week
		return weekly_rate;
	}
	
	public double getMonthlyRate(){     // cost per month 
		return monthly_rate;
	}

	public double getMileageChrg(){      // cost per mile, based on vehicle type 
		return mileage_chrg;
	}       
	public double getDailyInsurRate(){      // insurance cost (per day)
		return daily_insur_rate;
	}    
	public abstract String toString();     // forces subclasses to provde an appropriate toString method
}										


