package Task5_classes;

public class Counter {
    double leftBorder;
    double rightBorder;
    double number;

    public Counter(double leftBorder, double rightBorder, double number) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.number = number;
    }

    private boolean changeCounter(double delta) {
        if (!inTheAreaOrNot(number + delta)) {
            return false;
        }

        number = number + delta;
        return true;
    }

    public boolean increment() {
        return changeCounter(1);
    }

    public boolean decrement() {
        return changeCounter(-1);
    }

    public boolean inTheAreaOrNot(double number) {
        if (number >= leftBorder && number <= rightBorder) {
            System.out.println("Ok");
            return true;

        } else {
            System.out.println("You are went beyond");
            return false;
        }
    }

    public String toString() {
        return "Counter: " + number + " [" + leftBorder + ", " + rightBorder + "]";
    }
}
