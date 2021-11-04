package EncryptionTests;

import EncryptionMethod.ConvertInputPosition;
import EncryptionMethod.IConvertInputPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertInputPositionTest {

    @Test
    public void given_a_Getb(){
        //    Given: I am a user
        IConvertInputPosition cnc = new ConvertInputPosition();
//    When: When a is entered
        String input = cnc.convert("a");
//    Then: Return the number b
        assertEquals("b", input);
    }

    @Test
    public void given_b_Getd(){
        //    Given: I am a user
        IConvertInputPosition cnc = new ConvertInputPosition();
//    When: When b is entered
        String input = cnc.convert("b");
//    Then: Return the letter d
        assertEquals("d", input);
    }

    @Test
    public void given_z_GetZ(){
        //    Given: I am a user
        IConvertInputPosition cnc = new ConvertInputPosition();
//    When: When z is entered
        String input = cnc.convert("z");
//    Then: Return the number Z
        assertEquals("Z", input);
    }

    @Test
    public void given_A_Getb(){
        //    Given: I am a user
        IConvertInputPosition cnc = new ConvertInputPosition();
//    When: When A is entered
        String input = cnc.convert("A");
//    Then: Return the number b
        assertEquals("b", input);
    }

    @Test
    public void given_B_Getd(){
        //    Given: I am a user
        IConvertInputPosition cnc = new ConvertInputPosition();
//    When: When B is entered
        String input = cnc.convert("B");
//    Then: Return the number d
        assertEquals("d", input);
    }

    @Test
    public void given_Z_GetZ(){
        //    Given: I am a user
        IConvertInputPosition cnc = new ConvertInputPosition();
//    When: When Z is entered
        String input = cnc.convert("Z");
//    Then: Return the number Z
        assertEquals("Z", input);
    }

}
