package Except;
class B{
    public void show() throws ArithmeticException{
        int num = 0;
        int value = 2/num;
        System.out.println(value);
    }
}
public class Ducking2 {
    public static void main(String arg[]){
        B obj = new B();
        try{
            obj.show();
        }catch(ArithmeticException e){
            System.out.println("Here is the error");
        }
    }
}
