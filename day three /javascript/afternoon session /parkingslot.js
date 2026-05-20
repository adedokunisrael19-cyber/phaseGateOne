function CheckParkingSlot([] parkingSpace[]){
  for (let i = 0; i < parkingSpace.length-1; i++){
        if(parkingSpace[i] == 0)
        return "empty";
      if(parkingSpace[i] == 1)   
    return "occupied";
    }     


function parking(parkingSpace[])     
         for (const i = 0; i <parkingSpace.length-1, i++){
             if(parkingSpace[i] == 0){
            return "this is a free slot";
         }else{
            return "occupied";
          }
      }      return "occupied";

function CarLeavingSlot(parkingSpace [] )

       for (const i = 0; i < 20; i++){
             if(parkingSpace[i].pop()){
            return "car has left the parking space"
        }
    }

module.exports = {CheckParkingSlot, parkingSpace, CarLeavingSlot}
