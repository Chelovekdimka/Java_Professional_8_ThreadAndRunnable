package Ex_6;

public class MyThreadOne extends Thread{
    private Thread t1;

    MyThreadOne(){
        System.out.println("MyThreadOne create");
    }

    public void setTread2(Thread t) {
        this.t1 = t;
    }
    @Override
    public void run(){
        System.out.println("MyThreadOne start");
        try {
            t1.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyThreadOne interrupt MyThreadTwo finish...");
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyThreadOne finished");
    }
}
