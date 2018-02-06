package Synchronization;

public class SynchronizedObject_03 {

    public static void main(String[] args) {

        Runnable r = () -> {
            ID id = new ID();
            System.out.println("ID value : " + id.getID() + " : " + Thread.currentThread().getName());

        };

        Thread t1 = new Thread(r, "one");
        t1.start();
        Thread t2 = new Thread(r, "two");
        t2.start();
    }
}
