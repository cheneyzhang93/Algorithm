package thread;

import java.util.concurrent.CountDownLatch;

public class Sequence {

    public static void main(String[] args) throws InterruptedException {
        new Sequence(2);
    }

    public Sequence(int n) throws InterruptedException {
        this.n = n;
        foo(() -> System.out.println("foo"));
        bar(() -> System.out.println("bar"));
    }

    private CountDownLatch countDownLatch1 = new CountDownLatch(0);
    private CountDownLatch countDownLatch2 = new CountDownLatch(1);

    private int n;

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            countDownLatch1.await();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            countDownLatch1 = new CountDownLatch(1);
            countDownLatch2.countDown();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            countDownLatch2.await();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            countDownLatch2 = new CountDownLatch(1);
            countDownLatch1.countDown();
        }
    }

}
