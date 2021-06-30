package Task1_classes;

import java.util.Scanner;

class TwoVariables {
    int a = 1, b = 1234;

    public TwoVariables(int first, int second) {
        a = first;
        b = second;
    }

    public void outputOnDisplay() {
        System.out.println("a: " + a + " b: " + b);
    }

    public long getSum() {
        return (long) a + b;
    }

    public int getMax() {
        if (a > b) {
            return a;
        }
        return b;
    }

    public void setNumbers(int first, int second) {
        a = first;
        b = second;
    }
}


public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a and b");
        int n = in.nextInt();
        int m = in.nextInt();

        TwoVariables variables = new TwoVariables(n, m);
        System.out.println("1. output on display numbers\n 2. change numbers\n 3. sum of elements\n " +
                "4. find max value\n 5. exit");
        int res = in.nextInt();

        switch (res) {
            case 1:
                variables.outputOnDisplay();
                break;
            case 2:
                System.out.println("change a and b");
                int new_a = in.nextInt();
                int new_b = in.nextInt();

                System.out.println("Before change:");
                variables.outputOnDisplay();

                variables.setNumbers(new_a, new_b);

                System.out.println("After change:");
                variables.outputOnDisplay();
                break;
            case 3:
                System.out.println(variables.getSum());
                break;
            case 4:
                System.out.println(variables.getMax());
                break;
        }
    }
}


