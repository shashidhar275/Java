package Threads;
class A extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Hello");
        }
    }
}
public class ThreadIntro {
    public static void main(String arg[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
