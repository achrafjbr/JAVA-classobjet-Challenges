import java.util.List;

public class Book {

    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void books(Book[] bookList){
        for (int i = 0; i < bookList.length; i++) {
            System.out.println("Book title : " + bookList[i].title + ",  Book author : " + bookList[i].author + ", Book price : " + bookList[i].price + " ");
        }
    }

    public void display() {
        System.out.println("Book title : " + title + ",  Book author : " + author + ", Book price : " + price + " ");
    }
}
