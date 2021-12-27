package multithreading;

public class multithreading04 implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println("Hello " + (i++));
        }
    }

    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while (true) {
            System.out.println((i++) + " World");
        }
    }
}
