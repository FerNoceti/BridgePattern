import pattern.bridge.abstraction.AbstractOperation;
import pattern.bridge.abstraction.Factorial;
import pattern.bridge.abstraction.ItsEven;
import pattern.bridge.implementation.FactorialImpl;
import pattern.bridge.implementation.ItsEvenImpl;

public class Main {
    public static void main(String[] args) {
        AbstractOperation[] absts = new AbstractOperation[2];

        absts[0] = new Factorial(new FactorialImpl());
        absts[1] = new ItsEven(new ItsEvenImpl());

        for (AbstractOperation abstractOperation : absts) {
            abstractOperation.operation(6);
        }
    }
}