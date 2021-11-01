import interfaces.IFizzBuzz;

public class FizzBuzz implements IFizzBuzz {
    public String generate(int input){
        String result = "";

        for(int i = 1; i <= input; i++){

            if(i % 15 == 0){
                result += "FizzBuzz";
            }
            else if(i % 3 == 0){
                result += "Fizz";
            }
            else if(i % 5 == 0){
                result += "Buzz";
            } else {
                result += Integer.toString(i);
            }
            if(i != input){
                result += ",";
            }

        }

        return result;
    }
}
