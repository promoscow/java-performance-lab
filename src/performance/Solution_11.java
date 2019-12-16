package performance;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 16.12.19
 * Time: 11:14
 * e-mail: slava_rossii@list.ru
 */
public class Solution_11 {

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        thread.start();
    }

    public static class TestThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Сейчас буду ждать секунду.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Это тестовая нить.");
        }
    }
}
