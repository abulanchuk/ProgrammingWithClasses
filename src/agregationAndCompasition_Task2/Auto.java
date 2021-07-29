package agregationAndCompasition_Task2;


public class Auto {
    float tankVolume;
    float currentFuel;
    String mark;
    Motor engine;
    Wheel[] wheels;

    public Auto(float tankVolume, float currentFuel, String mark, Motor engine, Wheel[] wheels) {
        this.tankVolume = tankVolume;
        this.currentFuel = currentFuel;
        this.mark = mark;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getMark() {
        return mark;
    }

    public void refuel(float amount) {
        if (currentFuel + amount > tankVolume) {
            throw new RuntimeException("not enough space");
        }
        currentFuel = currentFuel + amount;

    }

    public void go(float distance) {
        float fuelSpend = engine.getConsumption() * distance / 100;
        if (currentFuel - fuelSpend < 0) {
            throw new RuntimeException("not enough fuel");
        }
        currentFuel = currentFuel - fuelSpend;
    }

    public void changeWheel(Wheel newWheel, Wheel.Type type) {
        int index = 0;
        switch (type) {
            case RIGHT_FRONT:
                index = 0;
                break;
            case LEFT_FRONT:
                index = 1;
                break;
            case RIGHT_REAR:
                index = 2;
                break;
            case LEFT_REAR:
                index = 3;
                break;
        }
        wheels[index] = newWheel;
    }

    public String toString() {
        String value = "==============\nmark: " + mark + "\ncurrentFuel: " + currentFuel + "\nwheels: ";
        for (int i = 0; i <= 3; i++) {
            value = value + wheels[i].toString() + " ";
        }
        value += "\n";
        value += "engine: " + engine.toString() + "\n";
        return value;
    }
}
