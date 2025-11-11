public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }

    public void display(){
        System.out.println("Area : "+calculateArea()+" ");
        System.out.println("dimensions => length : "+length+",  width : "+width+" ");
    }
}
