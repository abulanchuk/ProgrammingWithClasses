package Task9_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new Book(1, "Pushkin", "Aversev",2008, 230, 19, "binding with thread");
        books[1] = new Book(2, "Kuprin", "Azbuka",2005, 130, 19.21, "glue binding");
        books[2] = new Book(3, "Gogol", "Rosman",2000, 336, 19.56, "binding with thread");
        books[3] = new Book(4, "Murakami", "Aversev",2008, 230, 49, "binding with thread");
        books[4] = new Book(5, "Hoseini", "Azbuka",2000, 430, 36.6, "binding with thread");
        books[5] = new Book(6, "Pushkin", "Rosman",2008, 238, 19.21, "glue binding");
        Scanner in = new Scanner(System.in);
        System.out.println("enter the author of book");
        String auth = in.nextLine();
        System.out.println("enter the publishing House of book");
        String publHouse = in.nextLine();
        System.out.println("after which year of publication do you want to see the books");
        int whatYear = in.nextInt();

        Sorting sorting = new Sorting(books);

        Book[] resPublHouse =sorting.sortByPublishingHouse(publHouse);
        Book[] resAuth =sorting.sortByAuthor(auth);
        Book[] resYear = sorting.outputAfterAnyYear(whatYear);

        for (Book c: resAuth){
            if (c != null) {
                System.out.println(c);
            }
        }
        System.out.println();
        for (Book c: resPublHouse){
            if (c != null) {
                System.out.println(c);
            }
        }
        System.out.println();
        for (Book c: resYear){
            if (c != null) {
                System.out.println(c);
            }
        }

    }
}
