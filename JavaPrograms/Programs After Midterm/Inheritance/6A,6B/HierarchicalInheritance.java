class University {
    void universityInfo() {
        System.out.println("University: Amrita Vishwa Vidyapeetham");
    }
}

class Department extends University {
    void departmentInfo() {
        System.out.println("Department: Computer Science and Engineering");
    }
}

class Library extends University {
    void libraryInfo() {
        System.out.println("Library: Central Library - 9AM to 8PM");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Department dept = new Department();
        dept.universityInfo();
        dept.departmentInfo();

        Library lib = new Library();
        lib.universityInfo();
        lib.libraryInfo();
    }
}
