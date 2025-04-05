interface Exam {
    void giveExam();
}

class Student {
    void studentInfo() {
        System.out.println("Student: Kavin, Roll No: CSE102");
    }
}

class Result extends Student implements Exam {
    public void giveExam() {
        System.out.println("Exam given: Data Structures - 90 marks");
    }

    void showResult() {
        System.out.println("Result: Passed with A Grade");
    }
}

public class HybridStudent {
    public static void main(String[] args) {
        Result r = new Result();
        r.studentInfo();
        r.giveExam();
        r.showResult();
    }
}
