package Ex_4;

public class ClassTwo {
    public synchronized void printTwo() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 клас: " + i);
        }
    }
}