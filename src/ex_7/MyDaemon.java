package ex_7;

public class MyDaemon implements Runnable {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Демон-потік працює...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        running = false;
    }

    public static void main(String[] args) {
        MyDaemon daemon = new MyDaemon();
        Thread thread = new Thread(daemon);
        thread.setDaemon(true); // Встановлюємо флаг daemon
        thread.start();
    }
}