package Ex_3;

public class PriorityThread extends Thread {
    private String name;

    public PriorityThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(name + ": " + i);
        }
    }
}