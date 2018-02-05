package ThreadProblems;

public class DataRaceCondition {

    static double a = 10;
    static double b;

    public static void main(String[] args) {

        Runnable r1 = () ->
        {
            if (a == 10) {
                try {
                    Thread.sleep(500);
                    b = a / 2.0;
                    System.out.println(Thread.currentThread().getName() + ": " + b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        Runnable r2 = () -> {
                        a = 12;
                    };

        Thread t1 = new Thread(r1, "thread t1");
        Thread t2 = new Thread(r2, "thread t2");
        t1.start();
        t2.start();

    }
}
