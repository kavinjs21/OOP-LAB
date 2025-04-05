class Student {
    private String name;
    private int marks;

    public void setDetails(String n, int m) {
        name = n;
        marks = m;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class EncapsulationStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setDetails("Kavin", 88);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Marks Scored: " + s.getMarks());
    }
}
