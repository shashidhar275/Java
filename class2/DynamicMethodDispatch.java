package class2;
class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}

class Computer{

}

class Laptop extends Computer{

}

public class DynamicMethodDispatch {
    public static void main(String arg[]){
        A obj = new A();
        obj.show();

        Computer lap = new Laptop();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
