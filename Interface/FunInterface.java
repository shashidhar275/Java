package Interface;

@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("In B show");
//     }
// }

public class FunInterface {
    public static void main(String arg[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("In new show");
            }
        };

        obj.show();
    }
}


