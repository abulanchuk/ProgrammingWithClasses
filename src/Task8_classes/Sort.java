package Task8_classes;

public class Sort {
    Customer[] customers;

    public Sort(Customer[] customers) {
        this.customers = customers;
    }


    public Customer[] filterByCreditCard(long left, long right) {
        Customer[] array = new Customer[customers.length];
        int n = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCardNumber() > left && customers[i].getCardNumber() < right) {
                array[n] = customers[i];
                n++;
            }

        }
        return array;
    }

    public void sortCustomers() {
        for (int i = 0; i < customers.length; i++) {
            for (int j = customers.length - 1; j > i; j--) {
                int comparasionResult = customers[j - 1].getSurname().compareTo(customers[j].getSurname());
                boolean shouldSwap = false;

                if (comparasionResult > 0) {
                    shouldSwap = true;
                } else if (comparasionResult == 0) {
                    int comparasionNames = (customers[j - 1].getName().compareTo(customers[j].getName()));
                    if (comparasionNames > 0) {
                        shouldSwap = true;
                    }
                }

                if (shouldSwap) {
                    Customer tmp = customers[j - 1];
                    customers[j - 1] = customers[j];
                    customers[j] = tmp;
                }
            }
        }
    }
}
