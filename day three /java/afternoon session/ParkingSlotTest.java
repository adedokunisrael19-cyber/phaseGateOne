import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSlotTest{
    @Test
    public void testThatTheParkingSpaceIsEmpty(){
    int [] number = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    String expected = "empty";
    String actual = ParkingSlot.CheckParkingSlot(number);
    assertEquals(expected, actual);
    } 

     @Test
    public void testThatTheParkingSpaceIsFilled(){
    int [] number = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    String expected = "empty";
    String actual = ParkingSlot.CheckParkingSlot(number);
    assertEquals(expected, actual);
    } 
}
