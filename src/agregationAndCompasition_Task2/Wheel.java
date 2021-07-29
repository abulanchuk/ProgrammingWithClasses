package agregationAndCompasition_Task2;


public class Wheel {
    String brand;

    public Wheel(String brand) {
        this.brand = brand;
    }

    public enum Type {
        RIGHT_FRONT,
        LEFT_FRONT,
        RIGHT_REAR,
        LEFT_REAR
    }

    public String toString() {
        return brand;
    }
}
