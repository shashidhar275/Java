package Threads;

class fun{
    int count;
    public synchronized  void increamentCounter(){
        count++;
    }
}

public class T {
    public static void main(String arg[]) throws InterruptedException{
        fun obj = new fun();
        Runnable obj1 = ()->{
                for(int i=0;i<1000;i++){
                    obj.increamentCounter();
                }
            };
        Runnable obj2 = ()->{
                for(int i=0;i<1000;i++){
                    obj.increamentCounter();
                }
            };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(obj.count);
    }
}
