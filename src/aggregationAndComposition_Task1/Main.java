package aggregationAndComposition_Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputText = in.nextLine();
        Text text = new Text();

        System.out.println("1. add text; 2. display text 3. display header of text 4. exit");
        int yourСhoice = in.nextInt();
        text.appendText(inputText);
        boolean choice = true;
        while (choice) {

            switch (yourСhoice) {
                case 1:
                    System.out.println("what u want to add");
                    String whatToAdd = in.nextLine();
                    whatToAdd = in.nextLine();
                    text.appendText(whatToAdd);
                    break;
                case 2:

                    System.out.println("Text:");
                    System.out.println(text);
                    break;
                case 3:
                    System.out.println("Header:");
                    System.out.println(text.getHeader());
                    break;
                case 4:
                    choice = false;
                    break;
                default:
                    break;
            }
            yourСhoice = in.nextInt();
        }
    }
}
