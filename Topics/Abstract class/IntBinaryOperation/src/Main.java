abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    protected IntBinaryOperation(int first, int second) {
        this.firstArg = first;
        this.secondArg = second;
    }

    public abstract int perform();
}

// declare and implement your classes here
class Addition extends IntBinaryOperation {

    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return this.firstArg + this.secondArg;
    }
}

class Multiplication extends IntBinaryOperation {

    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return this.firstArg * this.secondArg;
    }
}
