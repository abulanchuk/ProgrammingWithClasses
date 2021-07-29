package agregationAndComposition_Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccount = new ArrayList<>();

        BankAccount account1 = new BankAccount(true, 234,1);
        BankAccount account2 = new BankAccount(true, -100,1);
        BankAccount account3 = new BankAccount(false, -4000,2);
        BankAccount account4 = new BankAccount(true, -3000,2);
        bankAccount.add(account1);
        bankAccount.add(account2);
        bankAccount.add(account3);
        bankAccount.add(account4);
        Person ivan = new Person("Ivan Ivanov", 1, bankAccount);
        Person anna = new Person("Anna Petrova", 2,bankAccount);
        System.out.println(ivan);
        System.out.println(anna);
        System.out.println(bankAccount);

        Bank sorting = new Bank();
        sorting.sortAccounts(bankAccount);
        System.out.println("=============================================");
        System.out.println("sorting accounts");
        System.out.println(bankAccount);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(ivan);
        persons.add(anna);
        Scanner in = new Scanner(System.in);
        System.out.println("Whom u want to find?");
        String whatPerson = in.nextLine();

        ArrayList<Person> res = sorting.toSearch(persons, whatPerson);


        System.out.println("person's accounts: ");
        for (Person p: res) {
            System.out.println("\tPerson " + p.nameAndSurname + ":");
            String accountsInfo = "";
            for (BankAccount account: p.accounts) {
                accountsInfo += "\t\t" + account.toString() + "\n";
            }
            System.out.println(accountsInfo);
        }
        System.out.println();
    }
}
