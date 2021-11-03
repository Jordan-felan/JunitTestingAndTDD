import interfaces.IBoundaryChecker;
import interfaces.IFizzBuzz;
import interfaces.IFlowControl;
import interfaces.IIsInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

public class FlowControlTest {

    private IIsInteger _intCheck;
    private IBoundaryChecker _boundaryChecker;
    private IFlowControl _flowControl;
    private IFizzBuzz _fizzbuzz;

    @BeforeEach
    public void setup(){
        this._intCheck = mock(IsInteger.class);
        this._boundaryChecker = mock(BoundaryChecker.class);
        this._fizzbuzz = mock(FizzBuzz.class);
        this._flowControl = new FlowControl(_intCheck, _boundaryChecker, _fizzbuzz);
    }

    @Test
    public void given1CallIsTypeIntOnce(){
        //    Given: I am a user
        given(_intCheck.isTypeInt("1")).willReturn(true);
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
        Mockito.verify(_fizzbuzz, times(1)).generate(1);
    }

    @Test
    public void given0CallIsIntegerOnce() {
//        Given: I am a user
        given(_intCheck.isTypeInt("0")).willReturn(true);
//        When: I enter the string “0”
        _flowControl.run("0");
//        Then: Call isInteger() once
        verify(_intCheck, times(1)).isTypeInt("0");
    }

    @Test
    public void given0CallIsInsideBoundaryOnce() {
//        Given: I am a user
        given(_intCheck.isTypeInt("0")).willReturn(true);
        given(_boundaryChecker.isInsideBoundary(0)).willReturn(true);
//        When: I enter the string “0”
        _flowControl.run("0");
//        Then: Call isInBoundary() once
        verify(_boundaryChecker, times(1)).isInsideBoundary(0);

    }

    @Test
    public void given0DoNotCallFizzBuzz(){
//        Given: I am a user
        given(_fizzbuzz.generate(0)).willReturn("0");
//        When: I enter the string “0”
        _flowControl.run("0");
//        Then: fizzBuzz() is called 0 times
        verify(_fizzbuzz, never()).generate(anyInt());
    }

    @Test
    public void givenBobCallIsIntegerOnce(){
//        Given: I am a user
        given(_intCheck.isTypeInt("bob")).willReturn(false);
//        When: I enter the string “Bob”
        _flowControl.run("bob");
//        Then: Call isInteger() once
        verify(_intCheck, times(1)).isTypeInt("bob");
    }

    @Test
    public void givenBobDoNotCallIsInsideBoundary(){
//        Given: I am a user
        given(_intCheck.isTypeInt("bob")).willReturn(false);
        given(_boundaryChecker.isInsideBoundary(anyInt())).willReturn(anyBoolean());
//        When: I enter the string “Bob”
        _flowControl.run("bob");
//        Then: Call isInBoundary() is called 0 times
        verify(_boundaryChecker, never()).isInsideBoundary(anyInt());
    }


    @Test
    public void givenBobDoNotCallFizzBuzz() {
//        Given: I am a user
        given(_fizzbuzz.generate(anyInt())).willReturn(anyString());
//        When: I enter the string “Bob”
        _flowControl.run("bob");
//        Then: fizzBuzz() is called 0 times
        verify(_fizzbuzz, never()).generate(anyInt());
    }



}
