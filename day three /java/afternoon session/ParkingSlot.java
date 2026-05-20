
public class ParkingSlot{
    public static String CheckParkingSlot(int[] parkingSpace){

    String statusOne ="empty";
    String statusTwo = "open";

  for (int i = 0; i < parkingSpace.length-1; i++){
        if(parkingSpace[i] == 0)
        return "empty";
      if(parkingSpace[i] == 1)   
    return "occupied";
    }     
}


    public static String parking(int[] parkingSpace){
    
         for (int i = 0; i < 20; i++){
             if(parkingSpace[i] == 0){
            return "this is a free slot";
         }else{
            return "occupied";
          }
      }      return "occupied";
}  

        public static CarLeavingSlot(int parkingSpace ){
       for (int i = 0; i < 20; i++){
             if(parkingSpace[i].pop()){
            return "car has left the parking space"
        }
    }
   
}        
