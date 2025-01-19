package Except;

public class Intro {
    public static void main(String arg[]){
        int num = 9;

        try{
            int value = num / 0;  //It's good to put only critical statements inside the try block
        }catch(Exception e){
            System.out.println("Something went wrong");
        }


        System.out.println("Done");
    }
}
