public class Circle {
    double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public void display() {
        System.out.println("Circle area : " + getArea() + ",  Circle area : " + getCircumference() + " ");
    }
}
