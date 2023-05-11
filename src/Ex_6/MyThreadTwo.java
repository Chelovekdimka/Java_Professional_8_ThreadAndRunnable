package Ex_6;

public class MyThreadTwo extends Thread{
    private Thread t2;
    MyThreadTwo(){
        System.out.println("MyThreadTwo create");
    }

    public void setThread1(Thread t) {
        this.t2 = t;
    }
    @Override
        public void run(){
        System.out.println("MyThreadTwo start");
        System.out.println("MyThreadTwo interrupt MyThreadOne finish...");
        try {
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("MyThreadTwo finished...");
    }
}
