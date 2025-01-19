package Interface;

interface A{
    void show(int i);
}

interface B{
    int add(int a,int b);
}

public class LambdaExp {
    public static void main(String arg[]){
        A obj = i-> System.out.println("In new A show");
        obj.show(5);

//We are actually creating a object of a class which whill implement the B interface 
        B obj1 = (int a,int b)-> a+b;
        int result = obj1.add(2,3);
        System.out.println(result);

    }
}
