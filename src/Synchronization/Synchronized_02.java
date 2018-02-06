package Synchronization;

public class Synchronized_02 {

    public static int counter = 2;

    public static void main(String[] args) {

        Runnable r = () -> {
                    System.out.println("ID value : " + getID() + " : " + Thread.currentThread().getName());
                    };

        Thread t1 = new Thread(r, "one");
        t1.start();
        Thread t2 = new Thread(r, "two");
        t2.start();
    }

    public static synchronized int  getID(){
        return counter++;
    }
}
