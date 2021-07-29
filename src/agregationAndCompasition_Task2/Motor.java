package agregationAndCompasition_Task2;


public class Motor {
    float consumption;
    String brand;

    public Motor(float consumption, String brand) {
        this.consumption = consumption;
        this.brand = brand;
    }

    public float getConsumption() {
        return consumption;
    }

    public String toString() {
        return "brand: " + brand + " consumption: " + consumption;
    }
}
