package Except;

public class MultipleCatch {
    public static void main(String arg[]){
        int num = 2;
        int arr[] = new int[4];
        String s = null;

        try{
            int value = 12/num;
            System.out.println(s.length());
            System.out.println(arr[4]);
        }catch(ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index used is out of bound");
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Done");
    }
    
}
