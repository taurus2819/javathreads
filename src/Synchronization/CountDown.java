package Synchronization;

public class CountDown {

//    public CountDown(){}

    public void blastOff(){
        try {
            for(int i = 10; i > 0; i--){
                System.out.println("--- " + i);
            }
            System.out.println("BlastOff!!");
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
    }
}
