import static org.junit.jupiter.api.Assertions.*;

import interfaces.IIsInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IsIntegerTest {
    IIsInteger isInteger;

    @BeforeEach
    public void setup(){
        this.isInteger = new IsInteger();
    }

    @Test
    public void given0GetTrue(){
        //Given: I am a user
        //When: I enter a string of 0
        boolean result = isInteger.isTypeInt("0");
        assertTrue(result);
        //Then: i get back true
    }

    @Test
    public void given1GetTrue(){
        //Given: I am a user
        //When: I enter a string of 1
        boolean result = isInteger.isTypeInt("1");
        assertTrue(result);
        //Then: i get back true
    }

    @Test
    public void givenBobGetFalse(){
        //Given: I am a user
        //When: I enter a string of bob
        boolean result = isInteger.isTypeInt("bob");
        assertFalse(result);
        //Then: i get back false
    }

    @Test
    public void given2_5GetFalse(){
        //Given: I am a user
        //When: I enter a string of 2.5
        boolean result = isInteger.isTypeInt("2.5");
        assertFalse(result);
        //Then: i get back false
    }

    @Test
    public void givenNegative4GetTrue(){
        //Given: I am a user
        //When: I enter a string of -4
        boolean result = isInteger.isTypeInt("-4");
        assertTrue(result);
        //Then: i get back true
    }


}