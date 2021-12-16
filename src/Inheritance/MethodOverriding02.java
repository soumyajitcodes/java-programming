package Inheritance;

class TV {
    public void switchON() {
        System.out.println("TV is switched on");
    }

    public void changeChannel() {
        System.out.println("TV Channel is changed");
    }
}

class SmartTV {

    public void switchON() {
        System.out.println("Smart TV is turned on");
    }

    public void changeChannel() {
        System.out.println("Smart TV channel is changed");
    }

    public void browse() {
        System.out.println("Smart TV in browse mode");
    }
}

public class MethodOverriding02 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.switchON();
        tv.changeChannel();
        System.out.println();

        SmartTV stv = new SmartTV();
        stv.switchON();
        stv.changeChannel();
        stv.browse();
    }
}
