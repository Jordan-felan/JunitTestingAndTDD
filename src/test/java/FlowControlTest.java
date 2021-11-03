import interfaces.IBoundaryChecker;
import interfaces.IFizzBuzz;
import interfaces.IFlowControl;
import interfaces.IIsInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FlowControlTest {

    @InjectMocks
    private FlowControl _flowControl;

    @Mock
    private IIsInteger _intCheck;

    @Mock
    private IBoundaryChecker _boundaryChecker;

    @Mock
    private IFizzBuzz _fizzbuzz;

    @Test
    public void given1CallIsTypeIntOnce(){
        //    Given: I am a user
//    When: I enter the string “1”
        _flowControl.run("1");
//    Then: Call isTypeInt() once
        Mockito.verify(_intCheck, times(1)).isTypeInt("1");
    }


    @Test
    public void given1CallIsInsideBoundary(){
        //    Given: I am a user
        given(_intCheck.isTypeInt("1")).willReturn(true);
        given(_boundaryChecker.isInsideBoundary(1)).willReturn(true);

//    When: I enter the string “1”
        _flowControl.run("1");
//    Then: Call isTypeInt() once
        Mockito.verify(_boundaryChecker, times(1)).isInsideBoundary(1);
    }

    @Test
    public void given1CallFizzBuzzOnce(){
        //    Given: I am a user
        given(_intCheck.isTypeInt("1")).willReturn(true);
        given(_boundaryChecker.isInsideBoundary(1)).willReturn(true);
        given(_fizzbuzz.generate(1)).willReturn(anyString());
//    When: I enter the string “1”
        _flowControl.run("1");
//    Then: Call isTypeInt() once
        then(_fizzbuzz).should(times(1)).generate(1);
    }

    @Test
    public void given0CallIsIntegerOnce() {
//        Given: I am a user
        given(_intCheck.isTypeInt("0")).willReturn(true);
//        When: I enter the string “0”
        _flowControl.run("0");
//        Then: Call isInteger() once
        then(_intCheck).should(times(1)).isTypeInt("0");
    }

    @Test
    public void given0CallIsInsideBoundaryOnce() {
//        Given: I am a user
        given(_intCheck.isTypeInt("0")).willReturn(true);
        given(_boundaryChecker.isInsideBoundary(0)).willReturn(true);
//        When: I enter the string “0”
        _flowControl.run("0");
//        Then: Call isInBoundary() once
        then(_boundaryChecker).should(times(1)).isInsideBoundary(0);

    }

    @Test
    public void given0DoNotCallFizzBuzz(){
//        Given: I am a user
//        given(_fizzbuzz.generate(0)).willReturn("0");
//        When: I enter the string “0”
        _flowControl.run("0");
//        Then: fizzBuzz() is called 0 times
        then(_fizzbuzz).should(never()).generate(anyInt());
    }

    @Test
    public void givenBobCallIsIntegerOnce(){
//        Given: I am a user
//        given(_intCheck.isTypeInt("bob")).willReturn(false);
//        When: I enter the string “Bob”
        _flowControl.run("bob");
//        Then: Call isInteger() once
        then(_intCheck).should(times(1)).isTypeInt("bob");
    }

    @Test
    public void givenBobDoNotCallIsInsideBoundary(){
//        Given: I am a user
//        given(_intCheck.isTypeInt("bob")).willReturn(false);
//        given(_boundaryChecker.isInsideBoundary(anyInt())).willReturn(anyBoolean());
//        When: I enter the string “Bob”
        _flowControl.run("bob");
//        Then: Call isInBoundary() is called 0 times
        then(_boundaryChecker).should(never()).isInsideBoundary(anyInt());
    }


    @Test
    public void givenBobDoNotCallFizzBuzz() {
//        Given: I am a user
//        given(_fizzbuzz.generate(anyInt())).willReturn(anyString());
//        When: I enter the string “Bob”
        _flowControl.run("bob");
//        Then: fizzBuzz() is called 0 times
        then(_fizzbuzz).should(never()).generate(anyInt());
    }



}
