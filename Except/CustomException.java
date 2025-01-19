package Except;

class ShashidhException extends RuntimeException{
    public ShashidhException(String s){
        super(s);
    }
}

public class CustomException {
    public static void main(String arg[]){
        int num = 12;

        try{
            int value = 10/num;
            if(value == 0)
                throw new ShashidhException("There is a Shashid Error");
        }catch(ShashidhException e){
            System.out.println("Okay error " + e );
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
