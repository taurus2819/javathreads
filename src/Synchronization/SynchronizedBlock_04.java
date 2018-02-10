package Synchronization;

public class SynchronizedBlock_04 {

    public static void main(String[] args) {

        CountDown cd = new CountDown();
        Runnable r = () -> {
            synchronized (cd) {
                cd.blastOff();
            }
        };

        Thread threadOne = new Thread(r, "Thread One");
        Thread threadTwo = new Thread(r, "Thread Two");
        threadOne.start();

        /*join can be instead of the synchronized*/
//        try {
//            threadOne.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        threadTwo.start();
    }
}
