package Task9_classes;

public class Sorting {
    Book[] books;

    public Sorting(Book[] books) {
        this.books = books;
    }

    public Book[] sortByAuthor(String auth) {
        Book[] arrayWithAuth = new Book[books.length];
        int n = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(auth)) {
                arrayWithAuth[n] = books[i];
                n++;
            }
        }
        return arrayWithAuth;
    }


    public Book[] sortByPublishingHouse(String publishingHouse) {
        Book[] newArrayPublHouse = new Book[books.length];
        int n = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equals(publishingHouse)) {
                newArrayPublHouse[n] = books[i];
                n++;
            }
        }
        return newArrayPublHouse;
    }

    public Book[] outputAfterAnyYear(int whatYear) {
        Book[] newArrayWithYears = new Book[books.length];
        int n = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].year == whatYear) {
                newArrayWithYears[n] = books[i];
                n++;
            }
        }
        return newArrayWithYears;
    }
}
