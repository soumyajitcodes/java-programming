package multithreading;

class MyData2 {
    synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}

class MyThreadThree extends Thread {
    MyData d;

    MyThreadThree(MyData dat) {
        d = dat;
    }

    public void run() {
        d.display("HELLO WORLD");
    }
}

class MyThreadFour extends Thread {
    MyData data;

    MyThreadFour(MyData dat) {
        data = dat;
    }

    public void run() {
        data.display("WELCOME ALL");
    }
}

public class synchronizedmultithreading {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThreadThree t1 = new MyThreadThree(d);
        MyThreadFour t2 = new MyThreadFour(d);
        t1.start();
        t2.start();
    }
}
