public class FinallyTerm {
    public static void main(String arg[]){
        int i=1;

        try{
            int value = 22 / i;

        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally{
            System.out.println("Hi");
        }
    }
}
