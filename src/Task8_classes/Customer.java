package Task8_classes;

public class Customer {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    String surname;
    String patronymic;
    String address;
    long cardNumber;
    long bankAccountNumber;

    public Customer(int id, String name, String surname, String patronymic, String address, long cardNumber, long bankAccountNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String toString() {
        return id + " " + name + " " + surname + " " + patronymic + " " + address + " " + cardNumber + " " + bankAccountNumber;
    }
}
