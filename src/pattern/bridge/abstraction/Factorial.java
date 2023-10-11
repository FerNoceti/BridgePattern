package pattern.bridge.abstraction;

import pattern.bridge.implementation.IOperation;

public class Factorial extends AbstractOperation {

    public Factorial(IOperation iOperation) {
        this.iOperation = iOperation;
    }

    @Override
    public void operation(int num) {
        this.iOperation.operation(num);
    }
}
