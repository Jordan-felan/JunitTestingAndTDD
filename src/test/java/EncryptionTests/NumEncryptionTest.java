package EncryptionTests;

import EncryptionMethod.INumberEncryption;
import EncryptionMethod.NumberEncryption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumEncryptionTest {

    @Test
    public void ShouldReturn9WhenInputEquals1(){
//        Given: i am a user
        INumberEncryption nc = new NumberEncryption();
//       When: i enter 1
        String input = nc.encryptNum("1");
//        Then: i get back 9
        assertEquals("9", input);
    }


    @Test
    public void ShouldReturn5WhenInputEquals5(){
//        Given: i am a user
        INumberEncryption nc = new NumberEncryption();
//       When: i enter 5
        String input = nc.encryptNum("5");
//        Then: i get back 5
        assertEquals("5", input);
    }

    @Test
    public void ShouldReturn1WhenInputEquals9(){
//        Given: i am a user
        INumberEncryption nc = new NumberEncryption();
//       When: i enter 9
        String input = nc.encryptNum("9");
//        Then: i get back 1
        assertEquals("1", input);
    }

    @Test
    public void ShouldReturn0WhenInputEquals0(){
//        Given: i am a user
        INumberEncryption nc = new NumberEncryption();
//       When: i enter 0
        String input = nc.encryptNum("0");
//        Then: i get back 0
        assertEquals("0", input);
    }

}
