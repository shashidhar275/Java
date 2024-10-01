class A extends Object{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A parameterized constructor");
    }
}

class B extends A{
    public B(){
        this(5);
        System.out.println("In B");
    }
    public B(int n)
    {
        super(n);
        System.out.println("In B parameterized constructor");
    }
}

public class thisAndSuper {
    public static void main(String arg[]){
        B obj = new B();
    }
}
