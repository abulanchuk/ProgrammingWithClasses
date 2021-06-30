package Task9_classes;

public class Book {
    int id;
    String author;
    String publishingHouse;
    int year;
    int numberOfPages;
    double price;
    String bookBinding;

    public Book(int id, String author, String publishingHouse, int year, int numberOfPages, double price, String bookBinding) {
        this.id = id;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bookBinding = bookBinding;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getBookBinding() {
        return bookBinding;
    }

    public String toString() {
        return id + " " + author + " " + publishingHouse + " " + year + " " + numberOfPages + " " + price + " " + bookBinding;
    }
}
