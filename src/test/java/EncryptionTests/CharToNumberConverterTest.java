package EncryptionTests;

import EncryptionMethod.CharToNumberConverter;
import EncryptionMethod.ICharToNumberConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharToNumberConverterTest {

    @Test
    public void given_a_Get2(){
        //    Given: I am a user
        ICharToNumberConverter cnc = new CharToNumberConverter();
//    When: When a is entered
        String input = cnc.convert("a");
//    Then: Return the number 2
        assertEquals("2", input);
    }

    @Test
    public void given_b_Get4(){
        //    Given: I am a user
        ICharToNumberConverter cnc = new CharToNumberConverter();
//    When: When b is entered
        String input = cnc.convert("b");
//    Then: Return the number 4
        assertEquals("4", input);
    }

    @Test
    public void given_z_Get52(){
        //    Given: I am a user
        ICharToNumberConverter cnc = new CharToNumberConverter();
//    When: When z is entered
        String input = cnc.convert("z");
//    Then: Return the number 52
        assertEquals("52", input);
    }

    @Test
    public void given_A_Get54(){
        //    Given: I am a user
        ICharToNumberConverter cnc = new CharToNumberConverter();
//    When: When A is entered
        String input = cnc.convert("A");
//    Then: Return the number 54
        assertEquals("54", input);
    }

    @Test
    public void given_B_Get56(){
        //    Given: I am a user
        ICharToNumberConverter cnc = new CharToNumberConverter();
//    When: When B is entered
        String input = cnc.convert("B");
//    Then: Return the number 56
        assertEquals("56", input);
    }

    @Test
    public void given_Z_Get104(){
        //    Given: I am a user
        ICharToNumberConverter cnc = new CharToNumberConverter();
//    When: When Z is entered
        String input = cnc.convert("Z");
//    Then: Return the number 104
        assertEquals("104", input);
    }

}
