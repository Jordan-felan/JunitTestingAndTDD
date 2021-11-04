package EncryptionMethod;

public class NumberEncryption implements INumberEncryption {

    public String encryptNum(String input) {
        if(input.equals("0")){
            return "0";
        }else {
            return String.valueOf(10 - Integer.parseInt(input));
        }


    }
}
