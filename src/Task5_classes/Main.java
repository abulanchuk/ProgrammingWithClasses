package Task5_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double leftBorder = in.nextDouble();
        double rightBorder = in.nextDouble();
        double number = in.nextDouble();

        Counter num = new Counter(leftBorder, rightBorder, number);
        System.out.println("Do u want to 1) ADD 2) SUBTRACT -1) EXIT");

        int wantUWant = in.nextInt();

        while (wantUWant != -1) {
            switch (wantUWant) {
                case 1:
                    num.increment();
                    break;
                case 2:
                    num.decrement();
                    break;
                default:
                    System.out.println("Wrong command: " + wantUWant);
            }

            System.out.println(num);
            System.out.println("Do u want to 1) ADD 2) SUBTRACT -1) EXIT");
            wantUWant = in.nextInt();
        }
    }
}
