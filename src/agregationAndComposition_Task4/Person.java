package agregationAndComposition_Task4;


import java.util.ArrayList;

public class Person {
    int id;
    String nameAndSurname;
    double sum = 0;
    ArrayList<BankAccount> accounts = new ArrayList<>();
    double plus = 0;
    double minus = 0;


    public Person(String nameAndSurname, int id, ArrayList<BankAccount> bankAccount) {
        this.nameAndSurname = nameAndSurname;
        this.id = id;
        for (int i = 0; i < bankAccount.size(); i++) {
            if (this.id == bankAccount.get(i).getId() && bankAccount.get(i).lock) {
                sum += bankAccount.get(i).getCount();
                accounts.add(bankAccount.get(i));
            }
            if (this.id == bankAccount.get(i).getId()) {
                if (bankAccount.get(i).getCount() > 0) {
                    plus += bankAccount.get(i).count;
                } else
                    minus += bankAccount.get(i).count;
            }
        }
    }


    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return nameAndSurname + " with ID: " + id + " sum: " + sum +" positive balance: "+ plus+" negative balance: "+minus;
    }

}

