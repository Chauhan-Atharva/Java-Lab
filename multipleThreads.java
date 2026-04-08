import java.util.*; 

class threads implements Runnable {
    public void run() {
        System.out.println("Thread number running: " + Thread.currentThread().getName());
    }
}

public class multipleThreads{
    public static void main(String args[]){
        System.out.println("Multiple Threads Program: ");
        Thread t1 = new Thread(new threads());
        Thread t2 = new Thread(new threads());
        t1.start();
        t2.start();
    }
}