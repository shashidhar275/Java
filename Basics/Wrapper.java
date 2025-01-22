package Basics;

public class Wrapper {
    public static void main(String arg[]){
        //Boxing 
        Integer num = new Integer(3);
        System.out.println(num);

        //AutoBoxing
        Integer num1 = 9;
        System.out.println(num);

        //Unboxing
        int value = num.intValue();
        System.out.println(value);

        //AutoUnboxing
        int v1 = num;
        System.out.println(v1);
    }
}
