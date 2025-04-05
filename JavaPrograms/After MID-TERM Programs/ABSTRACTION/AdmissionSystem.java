abstract class Admission {
    abstract void register();
    abstract void payFees();
}

class UGAdmission extends Admission {
    void register() {
        System.out.println("UG Student Registered");
    }

    void payFees() {
        System.out.println("UG Student paid ₹75,000 fees");
    }
}

class PGAdmission extends Admission {
    void register() {
        System.out.println("PG Student Registered");
    }

    void payFees() {
        System.out.println("PG Student paid ₹1,00,000 fees");
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {
        Admission student1 = new UGAdmission();
        Admission student2 = new PGAdmission();

        student1.register();
        student1.payFees();

        student2.register();
        student2.payFees();
    }
}
