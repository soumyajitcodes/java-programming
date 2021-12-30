package multithreading;

class MyData {
    void display(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}

class MyThreadOne extends Thread {
    MyData d;
    MyThreadOne (MyData dat) {
        d=dat;
    }
    public void run() {
        d.display("HELLO WORLD");
    }
}

class MyThreadTwo extends Thread {
    MyData data;
    MyThreadTwo (MyData dat) {
        data=dat;
    }
    public void run() {
        data.display("WELCOME");
    }
}

public class unsynchronizedmultithreading {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThreadOne t1 = new MyThreadOne(d);
        MyThreadTwo t2 = new MyThreadTwo(d);
        t1.start();
        t2.start();
    }
}
