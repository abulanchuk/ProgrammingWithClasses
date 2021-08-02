package agregationAndComposition_Task5;

public class Transport {

    Type type;
    boolean withTransfersOrNot; //с пересадками или нет
    float travelTime;
    float cost;


    public enum Type {
        BUS,
        PLANE,
        TRAIN
    }

    public boolean isWithTransfersOrNot() {
        return withTransfersOrNot;
    }

    public float getTravelTime() {
        return travelTime;
    }

    public float getCost() {
        return cost;
    }

    public Transport(boolean withTransfersOrNot, float travelTime, float cost, Type type) {
        this.withTransfersOrNot = withTransfersOrNot;
        this.travelTime = travelTime;
        this.cost = cost;
        this.type = type;
    }

    public String toString() {
        return "\n"+"type of transport: " + type + ", with transfer: " + withTransfersOrNot + ", travel time:" + travelTime + " transport cost: " + cost;
    }

}
