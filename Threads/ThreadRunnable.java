package Threads;


public class ThreadRunnable {
    public static void main(String arg[]){
            Runnable obj1 =()->{
                    for(int i=0;i<1000;i++){
                        System.out.println("Hi");
                    }
                };
            Runnable obj2 = ()->{
                    for(int i=0;i<1000;i++){
                        System.out.println("Hello");
                    }
                };

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            t2.start();

    }
}
