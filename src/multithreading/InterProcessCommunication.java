package multithreading;

class MyDataOne {
    int value;
    boolean flag = true;

    synchronized public void set(int value) {
        while(flag != true) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        this.value = value;
        this.flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;

        while(flag != false) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        x = value;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread {
    MyDataOne data;

    public Producer(MyDataOne data) {
        this.data = data;
    }

    public void run() {
        int count=1;

        while(true) {
            data.set(count);
            System.out.println("Producer --> "+count);
            count++;
        }
    }
}

class Consumer extends Thread {
    MyDataOne data;

    public Consumer(MyDataOne data) {
        this.data = data;
    }

    public void run() {
        int value;

        while(true) {
            value = data.get();
            System.out.println("Consumer --> "+value);
        }
    }
}

public class InterProcessCommunication {
    public static void main(String[] args) {
        MyDataOne data = new MyDataOne();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
