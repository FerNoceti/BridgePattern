package pattern.bridge.implementation;

public class ItsEvenImpl implements IOperation {
    @Override
    public void operation(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
