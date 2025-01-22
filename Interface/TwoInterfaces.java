package Interface;
interface A{   //Collection Interface
    public void show();
}

interface B extends A{   //List Interface 
    public void drive();
}

class C implements A,B{    //ArrayList Class
    public void show(){
        System.out.println("Hi, this is show method");
    }
    public void drive(){
        System.out.println("Hello, this is drive method");
    }
}
public class TwoInterfaces{
    public static void main(String arg[]){
        A obj = new C();
        obj.show();
        C objC = new C();
        objC.show();
        objC.drive();
    }
}