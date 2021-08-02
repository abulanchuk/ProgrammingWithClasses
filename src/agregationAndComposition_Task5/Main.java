package agregationAndComposition_Task5;

public class Main {
    public static void main(String[] args) {
        TypeOfVacation hotel = new HotelVacation();

        Transport transport = new Transport(true, 12.00f, 600, Transport.Type.PLANE);
        Eating eating = new Eating(false, 3, true);
        SetOfProposals vip = new SetOfProposals(hotel, transport, 12, eating);

        try {
            Client arturo = new Client("Arturo Gumenes", 37, 120000, vip);
            System.out.println(arturo);

        } catch (NotEnoughMoneyException e) {
            System.out.println("Not enough money");
        }
    }
}
