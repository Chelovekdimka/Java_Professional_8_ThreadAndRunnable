//Створити 2 класи. Реалізувати взаємне блокування цих класів.

package Ex_5;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();

        Thread threadOne = new Thread(new Runnable() {
            public void run() {
                one.methodOne(two);
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            public void run() {
                two.methodOne(one);
            }
        });

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println("All threads have finished.");
    }
}