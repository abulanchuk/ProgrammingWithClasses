package Task10_classes;

public class SortingAirlines {
    Airline[] airlines;

    public SortingAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] sortingByDestination(String destination) {
        Airline[] arraySortByDestination = new Airline[airlines.length];
        int n = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equals(destination)) {
                arraySortByDestination[n] = airlines[i];
                n++;
            }
        }
        return arraySortByDestination;
    }

    public Airline[] sortingByDays(String whatDay) {
        Airline[] arraySortByDay = new Airline[airlines.length];
        int n = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDate().equals(whatDay)) {
                arraySortByDay[n] = airlines[i];
                n++;
            }
        }
        return arraySortByDay;
    }

    public Airline[] sortingByTimeAndDays(double whatTime, Airline[] resByDay) {
        Airline[] arraySortByTimeAndDay = new Airline[resByDay.length];
        int n = 0;
        for (int i = 0; i < resByDay.length; i++) {
            if (resByDay[i] != null) {
                if (resByDay[i].getTime() > whatTime) {
                    arraySortByTimeAndDay[n] = resByDay[i];
                    n++;
                }
            } else {
                continue;
            }
        }
        return arraySortByTimeAndDay;
    }

}
