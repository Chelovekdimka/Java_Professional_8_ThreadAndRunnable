//Демонстрація пріоритетів. Створити 2 класи PriorityRunner та PriorityThread. Запустити 3 потоки із пріоритетами (min, max, norm).
//        За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.

package Ex_3;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread min = new Thread(new PriorityRunner("Min"));
        Thread max = new Thread(new PriorityThread("Max"));
        Thread norm = new Thread(new PriorityRunner("Norm"));

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        min.start();
        max.start();
        norm.start();

        min.join();
        max.join();
        norm.join();

        System.out.println("All threads have finished.");
    }
}