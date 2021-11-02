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
                _fizzbuzz.generate(intInput);
            }
        };


    }
}
