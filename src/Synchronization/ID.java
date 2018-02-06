package Synchronization;

public class ID {
    private static int counter;

    public static synchronized int getID(){
        return counter++;
    }
}
