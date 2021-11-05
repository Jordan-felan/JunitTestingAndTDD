package EncryptionTests;

import EncryptionMethod.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.concurrent.Flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class FlowControlTest {
    @Mock
    private IConvertInputPosition cipMock;

    @Mock
    private IConvertSpecialCharacters cscMock;

    @Mock
    private INumberEncryption ncMock;

    @InjectMocks
    private FlowControl flowControl;

    @Test
    public void ShouldCallConvertOnceWhenInputIsJo_14(){
        //Given: I am a user;
        //When: i enter "jo 14"
        String letters = flowControl.encrypt("Jo 14");
        //Then: i should get back tD__96
   then(cipMock).should(times(1)).convert("J");


    }
}
