package agregationAndComposition_Task4;

import java.util.Comparator;

public class PriceComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount a, BankAccount b) {
        if (a.getCount() > b.getCount()) {
            return 1;
        } else if (a.getCount() < b.getCount()) {
            return -1;
        } else return 0;
    }
}
