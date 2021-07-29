package agregationAndCompasition_Task2;


public class Main {
    public static void main(String[] args) {
        Motor m = new Motor(11, "73A");
        Wheel[] wheels = new Wheel[4];
        wheels[0] = new Wheel("audi_1");
        wheels[1] = new Wheel("audi_2");
        wheels[2] = new Wheel("audi_3");
        wheels[3] = new Wheel("audi_4");

        Auto audi = new Auto(75, 20, "audi", m, wheels);
        System.out.println(audi);

        audi.go(100);
        System.out.println(audi);

        audi.changeWheel(new Wheel("audi Q3"), Wheel.Type.LEFT_FRONT);
        System.out.println(audi);
    }
}
