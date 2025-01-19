package Except;

class A {
    public void show() {
        System.out.println("Okay");
        try{
            Class.forName("A");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found here");
        }catch(NoClassDefFoundError e){
            System.out.println("Got the problem + " + e);
        }
        catch(Exception e){
            System.out.println("Problem");
        }

        System.out.println("Done");
    }
}

public class DuckingException {
    public static void main(String arg[]){
        A obj = new A();
        obj.show();
    }
}
