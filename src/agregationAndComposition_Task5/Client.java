package agregationAndComposition_Task5;

class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

public class Client {
    String nameAndSurname;
    int age;
    float budget;
    SetOfProposals setOfProposals;


    public Client(String nameAndSurname, int age, float budget, SetOfProposals setOfProposals) {
        this.nameAndSurname = nameAndSurname;
        this.age = age;
        this.budget = budget;
        this.setOfProposals = setOfProposals;
        if(budget<setOfProposals.getCost()){
            throw new NotEnoughMoneyException("Not enough money: got " + budget + ", expected at least " + setOfProposals.getCost());
        }
    }

    public SetOfProposals getSetOfProposals() {
        return setOfProposals;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public int getAge() {
        return age;
    }

    public float getBudget() {
        return budget;
    }
    public String toString(){
        return "\n" + nameAndSurname + ", client's age " + age + ", client's budget " + budget  +setOfProposals +"\n" +"This trip costs:" + setOfProposals.getCost();
    }
}
