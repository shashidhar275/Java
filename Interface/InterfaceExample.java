package Interface;
interface A {
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X {

}

class B implements A,Y{
    public void show(){
        System.out.println("In show method");
    }

    public void config(){
        System.out.println("In config method");
    }

    public void run(){
        System.out.println("In run method");
    }
}
public class InterfaceExample {
    public static void main(String arg[]){
        A obj = new B();
        obj.show();
        obj.config();

        Y obj1 = new B();
        obj1.run();
    }
}
