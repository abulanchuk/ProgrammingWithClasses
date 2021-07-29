package agregationAndComposition_Task3;

import java.util.ArrayList;

public class Region {
    String name;
    ArrayList<City> cities ;
    float area;
    City regionalCenter;

    public Region(String name, ArrayList<City> cities, float area, City regionalCenter) {
        this.name = name;
        this.cities = cities;
        this.area = area;
        this.regionalCenter = regionalCenter;
    }

    public float getArea() {
        return area;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public String toString() {
        return "regionalCenter: "+regionalCenter.toString() + " areaOfRegionalCenter " +area;
    }
}
