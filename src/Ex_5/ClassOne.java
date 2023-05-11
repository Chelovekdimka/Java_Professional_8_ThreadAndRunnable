package Ex_5;

public class ClassOne {
    public synchronized void methodOne(ClassTwo two) {
        System.out.println("methodOne of ClassOne is running");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("methodOne of ClassOne is calling methodTwo of ClassTwo");
        two.methodTwo();
    }

    public synchronized void methodTwo() {
        System.out.println("methodTwo of ClassOne is running");
    }
}