package EncryptionMethod;

public class FlowControl implements IFlowControl {

    private IConvertInputPosition cip;
    private IConvertSpecialCharacters csc;
    private INumberEncryption ne;

    public FlowControl(IConvertInputPosition cip, IConvertSpecialCharacters csc, INumberEncryption ne){
       this.cip = cip;
       this.csc = csc;
       this.ne = ne;
    }

    public String encrypt(String input){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String specalChar = " ";
        String encryptedStr = "";
        for (int i = 0; i < input.length(); i++) {
            String value = String.valueOf(input.charAt(i));
            if (letters.contains(value)) {
                encryptedStr += cip.convert(value);
            } else if (numbers.contains(value)) {
                encryptedStr += ne.encryptNum(value);
            } else if (specalChar.contains(value)) {
                encryptedStr += csc.convert(value);
            } else {
                encryptedStr += "Hi, it's ya boy!";
            }
        }
        return encryptedStr;
    }

}
