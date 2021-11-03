import interfaces.IBoundaryChecker;
import interfaces.IFizzBuzz;
import interfaces.IFlowControl;
import interfaces.IIsInteger;

import java.util.concurrent.Flow;

public class FlowControl implements IFlowControl {
    private IIsInteger _iIsInt;
    private IBoundaryChecker _boundaryChecker;
    private IFizzBuzz _fizzbuzz;

    public FlowControl(IIsInteger isInteger, IBoundaryChecker boundaryChecker, IFizzBuzz fizzBuzz){
        this._iIsInt = isInteger;
        this._boundaryChecker = boundaryChecker ;
        this._fizzbuzz = fizzBuzz;
    }
    public void run(String input){
        if (_iIsInt.isTypeInt(input)){
            int intInput = Integer.parseInt(input);
            if(_boundaryChecker.isInsideBoundary(intInput)){
               String result = _fizzbuzz.generate(intInput);
                System.out.println(result);
                return;
            }
        }
        System.out.println("Please enter an integer between 1 and 300");


    }
}
