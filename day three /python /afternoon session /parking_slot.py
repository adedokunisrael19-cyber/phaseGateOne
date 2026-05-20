def CheckParkingSlot([] parkingSpace[]):
    for i in range (len(parkingSpace)-1):
        if(parkingSpace[i] == 0):
            return "empty";
        if(parkingSpace[i] == 1):  
            return "occupied";    


def parking(parkingSpace[]):
    for i in range (1,len(parkingSpace)-1):
      if(parkingSpace[i] == 0){
            return "this is a free slot";
         }else{
            return "occupied";
          }
      }      return "occupied";

def CarLeavingSlot(parkingSpace [] ):
    for i in range (1,len(parkingSpace)):
             if(parkingSpace[i].pop()){
            return "car has left the parking space"

