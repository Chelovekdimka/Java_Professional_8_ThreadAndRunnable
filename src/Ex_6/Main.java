package Ex_6;

public class Main {
    public static void main(String[] args) {
        MyThreadOne t1 = new MyThreadOne();
        MyThreadTwo t2 = new MyThreadTwo();

        t1.setTread2(t2);
        t2.setThread1(t1);

        t1.start();
        t2.start();
    }
}
