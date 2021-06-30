package Task4_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("D", 123, 2.32);
        trains[1] = new Train("A", 46453, 23.76);
        trains[2] = new Train("A", 65333, 20.37);
        trains[3] = new Train("C", 100033, 21.00);
        trains[4] = new Train("B", 387, 12.00);

        Train.sortTrainsNumbers(trains);

        Scanner in = new Scanner(System.in);
        System.out.println("which train do you go to find out information about?");
        int whatTrainYouWantToSee = in.nextInt();
        for (int i = 0; i < trains.length; i++) {
            if (whatTrainYouWantToSee == trains[i].trainsNumber)
                System.out.println("destination is: " + trains[i].destination + " and departureTime: " + trains[i].departureTime);
        }

        Train.sortDepartureTime(trains);
        for ( int i = 0; i < trains.length; i++) {
            System.out.println(trains[i].destination + " " + trains[i].departureTime);
            //System.out.println(trains[i].destination.compareTo(trains[i + 1].destination));
        }
    }
}
