public class Multithread1 extends Thread {
    Object lock = new Object();
    public  void run(){
        synchronized(lock){
        for (int i = 0; i < 10; i+=2) {
            System.out.println("Odd " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        }
    }
}
