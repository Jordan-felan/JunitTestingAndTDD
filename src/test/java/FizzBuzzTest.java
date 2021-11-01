import interfaces.IFizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void given1Get1() {
//        Given: I
//        am a user
//        When: I enter the number 1
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(1);
//        Then: I get back "1"
        assertEquals("1", result);
    }

    @Test
    public void given2Get1_2() {
//        Given: I
//        am a user
//        When: I enter the number 2
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(2);
//        Then: I get back "1,2"
        assertEquals("1,2", result);
    }

    @Test
    public void given3Get1_2_Fizz() {
//        Given: I
//        am a user
//        When: I enter the number 3
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(3);
//        Then: I get back "1,2,Fizz"
        assertEquals("1,2,Fizz", result);
    }

    @Test
    public void given4Get1_2_Fizz_4() {
//        Given: I
//        am a user
//        When: I enter the number 4
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(4);
//        Then: I get back "1,2,Fizz,4"
        assertEquals("1,2,Fizz,4", result);
    }

    @Test
    public void given5EndsWithBuzz() {
//        Given: I
//        am a user
//        When: I enter the number 5
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(5);
//        Then: I get back a string ending with "Buzz"
        assertTrue(result.endsWith("Buzz"));
    }

    @Test
    public void given6EndsWithFizz() {
//        Given: I
//        am a user
//        When: I enter the number 6
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(6);
//        Then: I get back a string ending with "Fizz"
        assertTrue(result.endsWith("Fizz"));
    }

    @Test
    public void given10EndsWithBuzz() {
//        Given: I
//        am a user
//        When: I enter the number 10
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(10);
//        Then: I get back a string ending with "Buzz"
        assertTrue(result.endsWith("Buzz"));
    }

    @Test
    public void given15EndsWithFizzBuzz() {
//        Given: I
//        am a user
//        When: I enter the number 15
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(15);
//        Then: I get back a string ending with "FizzBuzz"
        assertTrue(result.endsWith("FizzBuzz"));
    }

    @Test
    public void given30EndsWithFizzBuzz() {
//        Given: I
//        am a user
//        When: I enter the number 30
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(30);
//        Then: I get back a string ending with "FizzBuzz"
        assertTrue(result.endsWith("FizzBuzz"));
    }

}