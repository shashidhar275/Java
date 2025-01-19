package Except;

public class ThroughKeyword {
    public static void main(String arg[]){
        int num = 22;

        try{
            int value = 20/num;
            if(value==0)
                throw new ArithmeticException("The result got is zero");
        }catch(ArithmeticException e){
            System.out.println("Default value is 0 and " + e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
