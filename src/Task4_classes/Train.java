package Task4_classes;

public class Train {
    String destination;
    int trainsNumber;
    double departureTime;

    public Train(String destination, int trainsNumber, double departureTime) {
        this.destination = destination;
        this.trainsNumber = trainsNumber;
        this.departureTime = departureTime;
    }

    public static void sortTrainsNumbers(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[j - 1].trainsNumber > trains[j].trainsNumber) {
                    Train tmp = trains[j - 1];
                    trains[j - 1] = trains[j];
                    trains[j] = tmp;
                }
            }
        }
    }

    public static void sortDepartureTime(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int comparasionResult = trains[j - 1].destination.compareTo(trains[j].destination);
                boolean shouldSwap = false;

                if (comparasionResult > 0) {
                    shouldSwap = true;
                } else if (comparasionResult == 0) {
                    if (trains[j - 1].departureTime > trains[j].departureTime) {
                        shouldSwap = true;
                    }
                }

                if (shouldSwap) {
                    Train tmp = trains[j - 1];
                    trains[j - 1] = trains[j];
                    trains[j] = tmp;
                }
            }
        }
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainsNumber() {
        return trainsNumber;
    }

    public double getDepartureTime() {
        return departureTime;
    }

}
