package EncryptionMethod;


import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;

public class CharToNumberConverter implements ICharToNumberConverter{


    public String convert(String input){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = letters.indexOf(input);
        int convertedIndex = (index + 1) * 2;

        return String.valueOf(convertedIndex);
//        ArrayList<String> lettersList = new ArrayList<>();
//
//        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
//                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
//                "w", "x", "y", "z"};
//
//        for(int i = 0; i < letters.length; i++){
//            lettersList.add(letters[i]);
//        }
//
//        int index = lettersList.indexOf(input);
//        int convertedIndex = (index + 1) * 2;
//
//        return String.valueOf(convertedIndex);


    }
}
