//Затримка потоку. Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),
//        і коли ці потоки успішно відпрацюють – вивести на екран повідомлення (завершення потім first, second і main).

package Ex_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(new FirstThread());
        Thread second = new Thread(new SecondThread());
        Thread main = new Thread(new MainThread());

        first.start();
        second.start();
        main.start();

        second.join();
        first.join();
        main.join();

        System.out.println("All threads have finished.");
    }
}