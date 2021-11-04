package EncryptionMethod;

import java.util.Locale;

public class ConvertSpecialCharacters implements IConvertSpecialCharacters{

    public String convert(String input){
        if(input.equals(" ")){
            int randomInt = (int) Math.floor(Math.random() * (13 - 1 + 1) + 1);
            String capitalLetters = "ACEGIKMOQSUWY";
            char index = (capitalLetters.charAt(randomInt));
            return String.valueOf(index);
        } else {
            return input.toLowerCase();
        }





    }
}
