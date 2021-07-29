package agregationAndComposition_Task3;

import java.util.ArrayList;

public class State {
    ArrayList<Region> regions;
    City capital;
    float area = 0;
    ArrayList<City> regionalCenter = new ArrayList<>();

    public State(ArrayList<Region> regions, City capital) {
        this.regions = regions;
        this.capital = capital;

        for (int i = 0; i < regions.size(); i++) {
            area = regions.get(i).getArea() + area;
            regionalCenter.add(regions.get(i).getRegionalCenter());
        }
    }

    public int countRegions() {
        return regions.size();
    }

    public City getCapital() {
        return capital;
    }

    public float getArea() {
        return area;
    }

    public ArrayList<City> getRegionalCenter() {
        return regionalCenter;
    }

    public String toString() {
        return "capital: " + capital.toString() + ", areaOfState " + area;
    }
}
