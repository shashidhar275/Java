class Calc{
    public void display(){
        System.out.println("In Calc class display");
    }

    public int multiply(int n1,int n2){
        return n1*n2;
    }

    public void greeting(){
        System.out.println("Greetings from class Calc");
    }
}

class AdvCalc extends Calc{
    public void display(){
        System.out.println("In AdvCalc class display");
    }

    // public int multiply(int n1,int n2){
    //     return n1*n2*2;
    // }
}

public class methodOverriding {
    public static void main(String arg[]){
        AdvCalc obj = new AdvCalc();
        obj.display();
        int value = obj.multiply(2,3);
        System.out.println(value);
    }
}
