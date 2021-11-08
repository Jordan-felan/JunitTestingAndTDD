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
    public void ShouldCallConvertInputPosition1TimeWhen_a_IsEntered(){
        //given:i am a user
        //When:i enter "a"
        flowControl.encrypt("a");
        //Then:ConvertInputPosition is called once
        then(cipMock).should(times(1)).convert("a");
    }

    @Test
    public void ShouldCallConvertInputPositionTwiceWhenInputIs_b_IsEntered(){
        //Given: I am a user;
        //When: i enter "jo 14"
        flowControl.encrypt("b");
        //Then:ConvertInputPosition is called once
   then(cipMock).should(times(1)).convert("b");


    }

    @Test
    public void ShouldCallConvertInputPositionTwiceWhenInputIs_ab_IsEntered(){
        //Given: I am a user;
        //When: i enter "ab"
        flowControl.encrypt("ab");
        //Then:ConvertInputPosition is called twice
        then(cipMock).should(times(1)).convert("a");
        then(cipMock).should(times(1)).convert("b");

    }
}
