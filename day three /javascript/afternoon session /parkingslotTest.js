const  {CheckParkingSlot, parkingSpace} = require('./parkingslot')

test("if parking space is empty", () => {

       let parkingSpace = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} 
    
       expect(CheckParkingSlot(parkingSpace)).toBe("empty")

})

test("if parking space is empty", () => {

       let parkingSpace = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    
       expect(CheckParkingSlot(parkingSpace)).toBe("occupied")

})
