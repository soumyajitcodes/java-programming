package multithreading;

public class multithreading02 extends Thread {
    public void run() {
        int i = 1;

        while (true) {
            System.out.println(i + " hello");
            i++;
        }
    }

    public static void main(String[] args) {
        multithreading02 t = new multithreading02();
        t.start();
        int j = 1;
        while (true) {
            System.out.println((j++) + " World");
        }
    }
}
