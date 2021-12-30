package multithreading;

public class multithreading04 implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println("Hello " + (i++));
        }
    }

    public static void main(String[] args) {
        multithreading04 m = new multithreading04();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while (true) {
            System.out.println((i++) + " World");
        }
    }
}
