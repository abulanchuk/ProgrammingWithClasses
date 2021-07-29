package agregationAndComposition_Task3;

import java.util.ArrayList;

public class City {
    String name;
    ArrayList <District> district ;


    public City(String name, ArrayList<District> district) {
        this.name = name;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

}
