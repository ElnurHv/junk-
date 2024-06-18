public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        MultiThread thread=new MultiThread();
        Multithread1 multithread1=new Multithread1();

        thread.start();
          thread.join();

        multithread1.start();
        multithread1.join();
    }
}
