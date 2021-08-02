package agregationAndComposition_Task5;

public class Eating {
    boolean isVegan;
    int howManyInaDay;
    boolean withAlcohol;
    float cost;

    public Eating(boolean veganOrNot, int howManyInaDay, boolean withAlcoholOrNot) {
        this.isVegan = veganOrNot;
        this.howManyInaDay = howManyInaDay;
        this.withAlcohol = withAlcoholOrNot;
        cost = 20;
        if (!veganOrNot) {
            cost *= 1.5;
        }
        if (withAlcoholOrNot){
            cost+=5;
        }
        cost = cost*howManyInaDay;
    }

    public float getCost() {
        return cost;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public int getHowManyInaDay() {
        return howManyInaDay;
    }

    public boolean isWithAlcohol() {
        return withAlcohol;
    }
    public String toString(){
        return "\n"+ "Vegan or not:" + isVegan +", how many times u getting eating:" + howManyInaDay + ", with alcohol or not: " +withAlcohol;
    }
}
