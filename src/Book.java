public class Book {

    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book title : " + title + ",  Book author : " + author + ", Book price : " + price + " ");
    }
}
