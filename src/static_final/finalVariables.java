package static_final;

class finalVaiablesTest {
    final int MIN = 1;
    static final int NORMAL;
    final int MAX;

    static {
        NORMAL = 5;
    }

    finalVaiablesTest() {
        MAX=100;
    }
}

public class finalVariables {
    public static void main(String[] args) {
        finalVaiablesTest f = new finalVaiablesTest();
        System.out.println("MINIMUM --> "+f.MIN);
        System.out.println("NORMAL  --> "+f.NORMAL);
        System.out.println("MAXIMUM --> "+f.MAX);
    }
}
