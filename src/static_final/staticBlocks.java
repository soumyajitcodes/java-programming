package static_final;

class staticBlocksTest {
    static {
        System.out.println("Static Block 1 inside staticBlocksTest class.");
    }

    static {
        System.out.println("Static Block 2 inside staticBlocksTest class.");
    }
}

public class staticBlocks {
    static {
        System.out.println("Static Block 1 inside staticBlocks (main) class.");
    }

    static {
        System.out.println("Static Block 2 inside staticBlocks (main) class.");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        staticBlocksTest t = new staticBlocksTest();
    }
}
