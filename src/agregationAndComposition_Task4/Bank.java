package agregationAndComposition_Task4;

import java.util.ArrayList;

public class Bank {
    public void sortAccounts(ArrayList<BankAccount> bankAccount) {
        bankAccount.sort(new PriceComparator());
    }

    public ArrayList<Person> toSearch(ArrayList<Person> persons, String whomFind){
        ArrayList<Person> res =  new ArrayList<>();

        for (int i =0; i< persons.size(); i++){
            if (whomFind.equals(persons.get(i).nameAndSurname)){
              res.add(persons.get(i));
            }
        }
        return res;
    }


}

