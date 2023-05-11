//Створити 2 довільні класи з полями та методами.
//        Необхідно синхронізувати методи цих класів між собою, тобто. щоб виводило на екран значення один за одним (1 клас, 2 клас, 1, 2 тощо).

package Ex_4;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();

        Thread threadOne = new Thread(new Runnable() {
            public void run() {
                one.printOne();
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            public void run() {
                two.printTwo();
            }
        });

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println("All threads have finished.");
    }
}