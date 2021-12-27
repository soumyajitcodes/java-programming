package multithreading;

class Thread01 extends Thread {
    public void run() {
        int i = 1;

        while (true) {
            System.out.println(i + " hello");
            i++;
        }
    }
}

public class multithreading01 {
    public static void main(String[] args) {
        int j = 1;
        Thread01 t = new Thread01();
        t.start();

        while (true) {
            System.out.println(j + " World");
            j++;
        }
    }
}
