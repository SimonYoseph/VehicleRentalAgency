/*
 Simon Yoseph
 Program 4: Vehicle Rental Agency System - Backend
 Fall 2022
 COSC 237-003
 */

 public class Vehicles {

    private Vehicle[] vehs = new Vehicle [100];
    private int current;
  
  
     public void add(Vehicle v){  // adds a new vehicle to the collection
      for (int i= 0; i < vehs.length; i++){
          if(vehs[i] == null){
            vehs[i] = v;
              break;
         }
        }
       }

       public Vehicle nextVehicle() {
        Vehicle v = vehs[current];
        current++;
        return v;
	}
  
  
    public Vehicle getVehicle(String VIN) throws VINNotFoundException { 
      reset();
      while(hasNext()){
          Vehicle v = nextVehicle();
            if (v.getVIN().equals(VIN)){
                return v;
            }
        }
        throw new VINNotFoundException();
    }
   
    
     public void reset(){   // resets to first vehicle in list
      current = 0;
    }
  
     public boolean hasNext(){  // returns true if more vehicles in list to retrieve
       return (current < vehs.length);
       }
  
    public Vehicle getNext(){   // returns next vehicle in list
      Vehicle v =  vehs[current];
      current++;
        return v;
      }
}
