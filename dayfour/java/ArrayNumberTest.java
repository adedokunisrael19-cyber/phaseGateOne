import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayNumberTest{
    @Test
    public void testThatCheeckForTheAdditionOfANumber(){
    int [] arr = {8,6,12,4,-2};
    int number = 6;
    int[] expected ={-2};
    int[] actual = ArrayNumber.ArrayCheck(number, arr);
    assertArrayEquals(expected, actual);
    } 
}



