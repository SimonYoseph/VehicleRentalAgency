
/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

public abstract class Vehicle{
    private String description;  // stores make-model-year for cars and SUVs, stores length for trucks
    private String mpg;           // miles per gallon rating
    private String vin;            // unique vehicle identification number
    private Reservation resv;       // reservation information (a null value means vehicle not reserved)
    private VehicleRates quoted_rates;     // only assigned when vehicle reserved
  
  // Constructor
    public Vehicle(String description, String mpg, String vin){
      this.description = description;
      this.mpg = mpg;
      this.vin = vin;
      resv = null;              // init as “no reservation”
      quoted_rates = null;      // used to hold rates quoated at the time of the reservation
    }

    // Getter Methods
    public String getDescription(){
    return description;
  }
    public String getMPG(){
    return mpg;
  }
    public String getVIN(){
    return vin;
  }

  public abstract String toString();   
    
  
      public Reservation getReservation() throws UnreservedVehicleException{
        if (resv == null)
        {
          throw new UnreservedVehicleException();
          } else {
              return resv;
          }
      }
      
      public boolean isReserved(){
        if(resv != null){
          return true;
        }
        else {
          return false;
          }
      }

     public void reserve(Reservation r) throws ReservedVehicleException{
       if(r != resv){
       throw new ReservedVehicleException();
      } else{
      resv = r;
      }
    }
       
    public void cancelReservation() throws UnreservedVehicleException {
      if(!isReserved()) {
          throw new UnreservedVehicleException();
      } else {
          resv = null;
      }
  }

      public VehicleRates getQuotedRates(){
        return quoted_rates;
      }
       
      public void setQuotedRates(VehicleRates cost){ 
        quoted_rates = cost;
      }
    }
    
