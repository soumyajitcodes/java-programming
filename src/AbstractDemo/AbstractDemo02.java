package AbstractDemo;

abstract class Hospital {
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}

class MyHospital extends Hospital {
    void emergency() {
        System.out.println("Emergency Ward");
    }

    void appointment() {
        System.out.println("Appointment Desk");
    }

    void billing() {
        System.out.println("Billing Counter");
    }

    void admit() {
        System.out.println("Admitted to Hospital");
    }
}

public class AbstractDemo02 {
    public static void main(String[] args) {
        Hospital h = new MyHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
    }
}
