public class NumberGenerator implements Runnable {

    @Override
    public synchronized void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }

        }
    }

    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();
        Thread thread1 = new Thread(ng);
        Thread thread2 = new Thread(ng);

        thread1.setPriority(1);
        thread2.setPriority(10);

        thread1.start();
        thread2.start();


    }
}
