package EncryptionTests;

import org.junit.jupiter.api.Test;

public class EncryptionTest {

    @Test
    public void ShouldReturnEncryptedInputWhenInputEqualsJo_14(){
        //Given: I am a user
        IEncryption encryption = new Encryption();
        //When: i enter "jo 14"
        encryption.encrypt("Jo 14");
        //Then: i should get back tD__96

    }
}
