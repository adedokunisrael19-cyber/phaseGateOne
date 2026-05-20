import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FacebookLikeSystemTest{

    @Test
    public void testWhenAnEmptyArrayIsSent(){
    String [] names = {};
    String [] expected = {};
    actual = FacebookLikeSystem.printLikes(names);
    assertEquals(expected, actual);
    } 

     @Test
    public void testWhenArrayWithOneObejectIsSent(){
    String [] names = {"peter"};
    String [] expected = {"Adeola"};
    actual = FacebookLikeSystem.printLikes(names);
    assertEquals(expected, actual);
    } 

      @Test
    public void testWhenArrayWithTwoObejectIsSent(){
    String [] names = {"peter", "Alex"};
    String [] expected = {"Adeola", "Alex"};
    actual = FacebookLikeSystem.printLikes(names);
    assertEquals(expected, actual);
    } 


}
