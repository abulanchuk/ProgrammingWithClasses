package agregationAndComposition_Task5;

public class TypeOfVacation {
    String name;
    float cost;

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public TypeOfVacation(String name, float cost) {
        this.name = name;
        this.cost = cost;
    }
    public String toString(){
        return "type of vacation: " + name;
    }
}

class HotelVacation extends TypeOfVacation {
    public HotelVacation() {
        super("Hotel", 20);
    }
}

class BusTripVacation extends TypeOfVacation {
    public BusTripVacation() {
        super("BusTrip", 10);
    }
}

class SanatoriumVacation extends TypeOfVacation {
    public SanatoriumVacation() {
        super("BusTrip", 18.5f);
    }

}
