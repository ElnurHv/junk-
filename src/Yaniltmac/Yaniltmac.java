package Yaniltmac;

public class Yaniltmac {
    private static volatile  boolean turn = true;
    public static void main(String[] args) {
         String[] word={"getdim","bir","2","kor","yirtiq","var"};
        String[] word1={"gordum","derede","kar","kurku","kirpi"};

        Object lock=new Object();

        Thread t1 = new Thread(() ->{

            synchronized (lock){
                for (String words :word) {
                    while (!turn){
                        try {
                            lock.wait();
                        }catch (InterruptedException e){
throw new RuntimeException(e);
                        }

                    }
                    System.out.println(words);
                    turn =false;
                    lock.notify();
                }



            }
    });
    Thread t2=new Thread(() ->{
       synchronized (lock){
           for (String words:word1) {
               while (turn){
                   try{
                       lock.wait();
                   }catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
               System.out.println(words);
               turn =true;
               lock.notify();
           }
       }
    });
    t1.start();
    t2.start();

}
}