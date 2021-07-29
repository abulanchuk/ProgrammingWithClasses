package agregationAndComposition_Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        District d1 = new District("mfrger");
        District d2 = new District("hsrehs");
        District d3 = new District("mfrdfhresrger");
        District d4 = new District("rrrrr");


        ArrayList<District> d = new ArrayList<>();
        d.add(d1);
        d.add(d2);

        ArrayList<District> b2 = new ArrayList<>();
        b2.add(d3);
        b2.add(d4);
        City brest = new City("brest", d);
        City minsk = new City("minsk", b2);

        ArrayList<City> c = new ArrayList<>();
        c.add(brest);
        c.add(minsk);
        Region minski = new Region("minski",c,1232, minsk);
        Region brestki = new Region("brestki",c,45435, brest);

        ArrayList<Region> s = new ArrayList<>();
        s.add(minski);
        s.add(brestki);
        State belarus = new State(s,minsk);
System.out.println(belarus);

    }
}
