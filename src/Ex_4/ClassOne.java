package Ex_4;

public class ClassOne {
    public synchronized void printOne() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("1 клас: " + i);
        }
    }
}