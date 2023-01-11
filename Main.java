/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args){
    // Declare and populate vehicles collection 
    Vehicles vehs = new Vehicles(); 
    populate(vehs);
    Scanner input = new Scanner(System.in);

    // Init
    boolean quit = false;
    
    // Command loop
     while(!quit){
        try {
        displayMenu();
            int option = input.nextInt();
            switch(option){
            case 1: displayAllVehicles(vehs); break; 
            case 2: displayAvailVehicles(vehs); break;
            case 3: reserveVehicle(vehs); break;
            case 4: displayReservation(vehs); break;
            case 5: cancelReservation(vehs); break;
            case 6: addVehicle(vehs); break;
            case 7: quit = true;
            }
         }
    catch (ReservedVehicleException e) { 
        System.out.println("* Vehicle Already Reserved *");
    }
    catch (UnreservedVehicleException e) {
    System.out.println("* No Reservation for Vehicle Found *"); 
}
    }
}

    private static void displayMenu() {
        System.out.println("\n**************************");
        System.out.println("<<< MAIN MENU >>>");
        System.out.println("**************************");
            System.out.println("1 - Display All Vehicles");
            System.out.println("2 - Display Available Vehicles");
            System.out.println("3 - Reserve a Vehicle");
            System.out.println("4 - Display Reservation");
            System.out.println("5 - Cancel a Reservation");
            System.out.println("6 - Add a Vehicle");
            System.out.println("7 - Quit" + "\n");
        System.out.println("Enter Numeric Input Below:\t");
      }
    
      //case 1
        public static void displayAllVehicles(Vehicles vehs){
            vehs.reset();
        System.out.println("*********************************");
        System.out.println("All Vehicles are displayed Below");
        System.out.println("*********************************" + "\n");
            while(vehs.hasNext()){
      
          Vehicle temp = vehs.getNext();
                if (temp != null){
            System.out.println(temp);
          }
            }
        System.out.println("\n");
        }

     //case 2
  public static void displayAvailVehicles(Vehicles vehs){
    System.out.println("Car (1), SUVs(2), or Trucks (3)" + "\n");
  }

    //case 3
    public static void reserveVehicle(Vehicles vehs) throws ReservedVehicleException{
    // prompt user for vin
    // prompt for customer name
    // prompt for credit card num
    // prompt for how many days, weeks or months (and create TimeSpan object) // prompt for daily insurance option

    int count = 0;
    Scanner input = new Scanner(System.in);  // Reading from System.in
		System.out.println("Please enter the VIN");
		String VIN = input.next();
		
		try {
     System.out.println("Please enter name:"); // prompt for customer name
       String cust_name = input.next();

     System.out.println("Please enter credit card number:"); // prompt for credit card num
      String credit_card = input.next();

			Vehicle v = vehs.getVehicle(VIN);
			
			System.out.println(v.getDescription());

      System.out.println("Input either you want to reserve for D (Day(s)), W (Week(s)), or M (Month(s))");
      char timeUnit = input.next().charAt(0); // prompt for how many days, weeks or months (and create TimeSpan object)

      System.out.println("Enter numeric value of how long you want it: "); // prompt for how many days, weeks or months (and create TimeSpan object)
      int numUnits = input.nextInt();
    
      TimeSpan timeSpan = new TimeSpan(timeUnit, numUnits);  // TimeSpan object

      System.out.println("Insurance?: ");    // prompt for daily insurance option
     String insur_selected = input.next();

     Reservation resv = new Reservation (cust_name, credit_card, timeSpan, insur_selected);
     vehs.reset();
      Vehicle temp;
    while(vehs.hasNext()){
        temp = vehs.getNext();
            if(temp.getVIN().equals(VIN)){
                temp.reserve(resv);
            }
        }
    } catch (VINNotFoundException e) {
        System.out.println("VIN " + VIN + " Not Found"); 
    }
  }

  // case 4
  public static void displayReservation(Vehicles vehs) throws UnreservedVehicleException{
    vehs.reset();
    Vehicle temp;
    while(vehs.hasNext()){
    temp = vehs.getNext();
      if(temp.getReservation() != null){
        System.out.println(temp);
      }
    }
  }

  //case 5
  public static void cancelReservation(Vehicles vehs) throws UnreservedVehicleException{
    vehs.reset();
    Vehicle temp;
    String vin = "";
    while(vehs.hasNext()){
    temp = vehs.getNext();
      if(temp.getVIN().equals(vin) && temp.getReservation() != null){
        temp.cancelReservation();
      }
    }
  }

   //case 6
   public static void addVehicle(Vehicles vehs){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Vehicle Description: " + "\n");
    String v = input.nextLine();
  }

      //case 7
  public static void quit(Vehicles vehs){
    System.out.println("Exiting Program..." + "\n");
    System.exit(0);
  }
  
  public static void populate(Vehicles vehs) {

    vehs.add(new Car("Chevrolet Camaro - 2019,", "MPG: 30,", "Seating: 2,", "VIN: KH4GM4564GQ"));
    vehs.add(new Car("Ford Fusion - 2018,", "MPG: 34,", "Seating: 4,", "VIN: AB4FG5689GM"));
    vehs.add(new Car("Ford Fusion Hybrid,", "MPG: 32,", "Seating: 4,", "VIN: KV4EG3245RV"));
    vehs.add(new Car("Chevrolet Impala - 2018,", "MPG: 32,", "Seating: 4,", "VIN: RK3MB3266YH"));

    vehs.add(new SUV("Honda Odyssey - 2020,", "MPG: 28,", "Seating: 7,", "Cargo: 6 cubic ft.,", "VIN: VM9RE2635TD"));
    vehs.add(new SUV("Dodge Caravan - 2019,", "MPG: 25,", "Seating: 5,", "Cargo: 4 cubic ft.,", "VIN: QK3FT4273NE"));
    vehs.add(new SUV("Ford Expedition - 2019,", "MPG: 21,", "Seating: 5,", "Cargo: 3 cubic ft.,", "VIN: JK2HL8364HY"));

    vehs.add(new Truck("Ten-Foot,", "MPG: 12,", "Load Capacity: 2810 lbs.,", "VIN: EJ5KU2437BD"));
    vehs.add(new Truck("Eighteen-Foot,", "MPG: 10,", "Load Capacity: 5960 lbs.,", "VIN: KG4ND5372RK"));
    vehs.add(new Truck("Twenty-Four-Foot,", "MPG: 8,", "Load Capacity: 6500 lbs.,", "VIN: EB2WR3082OB"));
    vehs.add(new Truck("Twenty-Four-Foot,", "MPG: 8,", "Load Capacity: 6510 lbs.,", "VIN: TV3GH4390EK"));
  }
}