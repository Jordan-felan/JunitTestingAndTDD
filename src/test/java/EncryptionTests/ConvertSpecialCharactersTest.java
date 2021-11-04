package EncryptionTests;

import EncryptionMethod.ConvertSpecialCharacters;
import EncryptionMethod.IConvertSpecialCharacters;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertSpecialCharactersTest {

    @Test
    public void ShouldReturnRandomCapitalLetterThatIndexPositionIsOddWhenInputEqualsSpace(){
//        Given: I am a user
        IConvertSpecialCharacters csc = new ConvertSpecialCharacters();
//        When: i enter a space
        String oddCapLetters = "ACEGIKMOQSUWY";
        String input = csc.convert(" ");
        boolean result = oddCapLetters.contains(input);
//        Then: return random odd index capital letter
        assertTrue(result);
    }

    @Test
    public void ShouldReturnRandomCapitalLetterThatIndexPositionIsOddWhenInputEqualsa(){
//        Given: I am a user
        IConvertSpecialCharacters csc = new ConvertSpecialCharacters();
//        When: i enter a space
        String oddCapLetters = "ACEGIKMOQSUWY";
        String input = csc.convert("a");
        boolean result = oddCapLetters.contains(input);
//        Then: return random odd index capital letter
        assertFalse(result);
    }

    @Test
    public void ShouldReturnRandomCapitalLetterThatIndexPositionIsOddWhenInputEqualsz(){
//        Given: I am a user
        IConvertSpecialCharacters csc = new ConvertSpecialCharacters();
//        When: i enter a space
        String oddCapLetters = "ACEGIKMOQSUWY";
        String input = csc.convert("z");
        boolean result = oddCapLetters.contains(input);
//        Then: return random odd index capital letter
        assertFalse(result);
    }

    @Test
    public void ShouldReturnRandomCapitalLetterThatIndexPositionIsOddWhenInputEqualsA(){
//        Given: I am a user
        IConvertSpecialCharacters csc = new ConvertSpecialCharacters();
//        When: i enter a space
        String oddCapLetters = "ACEGIKMOQSUWY";
        String input = csc.convert("A");
        boolean result = oddCapLetters.contains(input);
//        Then: return random odd index capital letter
        assertFalse(result);
    }
}
