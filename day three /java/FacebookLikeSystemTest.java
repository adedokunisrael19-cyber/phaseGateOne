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

}
