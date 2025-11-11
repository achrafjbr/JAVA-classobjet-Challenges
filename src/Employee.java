public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        display();
    }

    public double annualSalary() {
        return salary * 12;
    }

    public void display() {
        System.out.println("Your salary after multiply it : " + annualSalary() + " ");
    }

}
