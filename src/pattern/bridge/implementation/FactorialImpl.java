package pattern.bridge.implementation;

public class FactorialImpl implements IOperation {
    @Override
    public void operation(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
