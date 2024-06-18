public class MultiThread  extends Thread{


    Object lock = new Object() ;
    public  void run () {
        synchronized (lock) {


            for (int i = 1; i < 10; i+=2) {
                System.out.println("even " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

}
