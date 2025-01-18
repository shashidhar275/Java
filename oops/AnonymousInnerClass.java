package oops;
class A{
    public void show(){
        System.out.println("In A show");
    }

    public void drive(){
        System.out.println("Driving");
    }
}
public class AnonymousInnerClass {
    public static void main(String arg[]){
        A obj = new A(){
            public void show(){
                System.out.println("In new A show");
            }
        };
        obj.show();
        obj.drive();
    }
}
