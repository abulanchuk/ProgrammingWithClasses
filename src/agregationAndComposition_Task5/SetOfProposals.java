package agregationAndComposition_Task5;

public class SetOfProposals {
    TypeOfVacation typeOfVacation;
    Transport transport;
    int days;
    Eating eating;


    public SetOfProposals(TypeOfVacation typeOfVacation, Transport transport, int days, Eating eating) {
        this.typeOfVacation = typeOfVacation;
        this.transport = transport;
        this.days = days;
        this.eating = eating;
    }

    public float getCost() {
        float total = (typeOfVacation.getCost() + transport.getCost() + eating.getCost()) * days;
        return total;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public Transport getTransport() {
        return transport;
    }

    public int getDays() {
        return days;
    }

    public Eating getEating() {
        return eating;
    }
public String toString(){
        return "\n" +typeOfVacation + transport + ", for "+days+" days "  +eating;
}
}
