package Task8_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1, "Ivan", "Lomashvili", "Sergeevich", "Nepalova 8", 154, 123333441);
        customers[1] = new Customer(2, "Pavel", "Jameson", "Ivanovich", "Nelibokova 125", 66753, 38877663);
        customers[2] = new Customer(3, "Tom", "Lomov", "Petrovich", "Storovodnays 23", 6000, 38877663);
        customers[3] = new Customer(4, "Limmy", "Ivanov", "Nilovich", "Kolasa 1", 662, 18800003);
        customers[4] = new Customer(5, "Gustavo", "Lomashvili", "Yanovich", "Nelibokova 4", 6922, 38997660);

        Sort sorter = new Sort(customers);
        sorter.sortCustomers();
        for (Customer c : customers) {
            System.out.println(c);
        }
        System.out.println("enter left and right borders");
        Scanner in = new Scanner(System.in);
        int leftBorder = in.nextInt();
        int rightBorder = in.nextInt();
        Customer[] res = sorter.filterByCreditCard(leftBorder, rightBorder);
        for (Customer c : res) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
}

