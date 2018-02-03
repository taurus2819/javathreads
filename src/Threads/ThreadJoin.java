package Threads;

public class ThreadJoin {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        TestJoin t1 = new TestJoin("t1");
        TestJoin t2 = new TestJoin("t2");
        TestJoin t3 = new TestJoin("t3");
        t1.start();
        t2.start();
        try{
            t2.join();
        }catch(Exception e){System.out.println(e);}

        //thread 3 won't start until thread 2 is complete
        t3.start();
    }

}
