package Ex_3;

public class PriorityRunner implements Runnable {
    private String name;

    public PriorityRunner(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(name + ": " + i);
        }
    }
}