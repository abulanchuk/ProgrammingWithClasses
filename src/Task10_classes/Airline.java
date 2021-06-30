package Task10_classes;

public class Airline {
    String destination;
    int flightNumber;
    String typeOfPlane;
    double time;
    String date;

    public Airline(String destination, int flightNumber, String typeOfPlane, double time, String date) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfPlane = typeOfPlane;
        this.time = time;
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public double getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return destination + " " + flightNumber + " " + typeOfPlane + " " + time + " " + date;
    }
}
