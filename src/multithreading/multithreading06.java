package multithreading;

class Thread02 implements Runnable {
    public void run() {
        int i = 1;

        while(true) {
            System.out.println((i++)+ " HELLO");
        }
    }
}

public class multithreading06 {
    public static void main(String[] args) {
        Thread02 m = new Thread02();
        Thread t = new Thread(m);
        t.start();

        int i = 1;
        while(true) {
            System.out.println((i++)+" WORLD");
//            Thread.yield();
        }
    }

}
