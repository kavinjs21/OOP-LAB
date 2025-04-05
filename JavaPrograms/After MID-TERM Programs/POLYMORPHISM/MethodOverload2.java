class Display {
    void show(String name) {
        System.out.println("Name: " + name);
    }

    void show(int age) {
        System.out.println("Age: " + age);
    }

    void show(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class MethodOverload2 {
    public static void main(String[] args) {
        Display d = new Display();
        d.show("Kavin");
        d.show(19);
        d.show("Kavin", 19);
    }
}
