public class Product {

    int id;
    String name;
    double price;

    public Product(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    public void displayProduct(){
        System.out.println("Product => id : "+id+",  name : "+name+",  price : "+price+" ");
    }
}
