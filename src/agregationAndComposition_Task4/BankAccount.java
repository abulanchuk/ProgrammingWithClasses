package agregationAndComposition_Task4;


public class BankAccount {
    boolean lock;
    double count;
    int id;

    public BankAccount(boolean lock, double count, int id) {
        this.lock = lock;
        this.count = count;
        this.id = id;
    }



    public int getId() {
        return id;
    }

    public boolean isLock() {
        return lock;
    }

    public double getCount() {
        return count;
    }

    public String toString() {
        return "count " + count;
    }
}
