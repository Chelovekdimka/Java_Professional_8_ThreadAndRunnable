package Ex_5;

public class ClassTwo {
    public synchronized void methodOne(ClassOne one) {
        System.out.println("methodOne of ClassTwo is running");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("methodOne of ClassTwo is calling methodTwo of ClassOne");
        one.methodTwo();
    }

    public synchronized void methodTwo() {
        System.out.println("methodTwo of ClassTwo is running");
    }
}