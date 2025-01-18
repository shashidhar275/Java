package oops;
abstract class A{
    public abstract void show();
}
public class abstractAndAnonymous {
    public static void main(String arg[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("In new A show");
            }
        };
        obj.show();
    }
}
