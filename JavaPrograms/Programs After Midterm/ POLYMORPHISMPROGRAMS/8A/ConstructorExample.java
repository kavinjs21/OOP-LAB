class Student {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Student s = new Student("Kavin", 119);
        s.display();
    }
}
