package EncryptionMethod;


public class ConvertInputPosition implements IConvertInputPosition {


    public String convert(String input){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = (letters.indexOf(input) + 1) * 2;
        if(index > 52){
            index -= 52;
        }

        return String.valueOf(letters.charAt(index - 1));
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
