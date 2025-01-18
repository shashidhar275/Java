package class2;

class Calculator{
    public void display(){
        System.out.println("In Calculator class");
    }
}

class AdvCalculator extends Calculator{
    public void display(){
        System.out.println("In AdvCalculator class");
    }
}

public class FinalKeyword {
    public static void main(String arg[]){
        final int value = 10;
        System.out.println(value);

        AdvCalculator a = new AdvCalculator();
        a.display();
    }
}
