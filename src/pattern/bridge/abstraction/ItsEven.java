package pattern.bridge.abstraction;

import pattern.bridge.implementation.IOperation;

public class ItsEven extends AbstractOperation {

    public ItsEven(IOperation iOperation) {
        this.iOperation = iOperation;
    }

    @Override
    public void operation(int num) {
        this.iOperation.operation(num);
    }
}
