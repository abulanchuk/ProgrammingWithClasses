package Task10_classes;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airline[] airlines = new Airline[5];
        airlines[0] = new Airline("Moscow", 112, "lowcost", 12.34, "Thursday");
        airlines[1] = new Airline("Paris", 988, "charter", 16.45, "Monday");
        airlines[2] = new Airline("Rio", 243, "charter", 20.50, "Sunday");
        airlines[3] = new Airline("Odessa", 105, "charter", 9.45, "Monday");
        airlines[4] = new Airline("Helsinki", 975, "lowcost", 11.00, "Monday");

        Scanner in = new Scanner(System.in);
        System.out.println("what destination:");
        String whatDestination = in.nextLine();
        System.out.println("what day of week:");
        String whatDay = in.nextLine();
        System.out.println("output airlines where time more than:");
        double whatTime = in.nextDouble();

        SortingAirlines sorting = new SortingAirlines(airlines);

        Airline[] resByDest = sorting.sortingByDestination(whatDestination);
        for (Airline c : resByDest) {
            if (c != null)
                System.out.println(c);
        }
        System.out.println();

        Airline[] resByDay = sorting.sortingByDays(whatDay);
        for (Airline c : resByDay) {
            if (c != null)
                System.out.println(c);
        }
        System.out.println();

        Airline[] copyResByDay = resByDay.clone();
        Airline[] resByTimeAndDay = sorting.sortingByTimeAndDays(whatTime, copyResByDay);


        for (Airline c : resByTimeAndDay) {
            if (c != null)
                System.out.println(c);
        }
    }
}
