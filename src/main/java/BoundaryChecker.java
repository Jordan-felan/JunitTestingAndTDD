import interfaces.IBoundaryChecker;

public class BoundaryChecker implements IBoundaryChecker {
    public boolean isInsideBoundary (int i) {
        if(i >= 1 && i <= 300){
            return true;
        }
        return false;
    }
}
