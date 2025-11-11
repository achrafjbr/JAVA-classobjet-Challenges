public class Student {

    String name;
    int age;
    double grade;

    public Student(String name, double grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Student => name : "+name+"  age : "+age+"  grade : "+grade+" ");
    }
}
