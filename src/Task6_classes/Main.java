package Task6_classes;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Time time = new Time(00,00,00);

        Scanner in = new Scanner(System.in);
        System.out.println("What u want to change\n 1. hours\n 2. Minutes\n 3. Seconds");
        int whatYouChoose = in.nextInt();
        while (whatYouChoose > 3) {
            System.out.println("enter correct point");
            whatYouChoose = in.nextInt();
        }
        int hours;
        int min;
        int sec;
        switch (whatYouChoose) {
            case 1:
                System.out.println("enter any hour");
                hours = in.nextInt();
                time.setHours(hours);
                System.out.println(time);
                break;
            case 2:
                System.out.println("enter any minutes");
                min = in.nextInt();
                time.setMin(min);
                System.out.println(time);
                break;
            case 3:
                System.out.println("enter any seconds");
                sec = in.nextInt();
                time.setSec(sec);
                System.out.println(time);
                break;
        }
    }
}
