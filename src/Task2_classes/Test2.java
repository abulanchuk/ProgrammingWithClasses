package Task2_classes;

public class Test2 {
    int number1;
    int number2;

    Test2(int x, int y) {
        number1 = x;
        number2 = y;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public static void main(String[] args) {
        Test2 numbers = new Test2(12, 2);
        System.out.println(numbers.getNumber1());
        numbers.setNumber1(34);
        System.out.println("new number1: "+numbers.getNumber1());

    }
}
