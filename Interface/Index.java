package Interface;

interface A {
    int age = 22;
    String area = "Bangalore";

        void show();
        void config();
}

class B implements A{
    public void show(){
        System.out.println("In show");
    }

    public void config(){
        System.out.println("In config");
    }
}

public class Index {
    public static void main(String arg[]){
        A obj = new B();
        obj.config();
        System.out.println(A.age);
    }
}
