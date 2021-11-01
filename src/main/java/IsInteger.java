import interfaces.IIsInteger;

public class IsInteger implements IIsInteger {
    public boolean isTypeInt(String input) {
        try { Integer.parseInt(input);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
