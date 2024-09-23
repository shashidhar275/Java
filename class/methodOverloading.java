class Calculator{
    public int add(int num1,int num2){
        return num1 + num2;
    }

    public int add(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }

    public double add(double num1,int num2){
        // System.out.println("Hi");
        return num1 + num2;
    }
}

public class methodOverloading{
    public static void main(String arg[]){
        Calculator c = new Calculator();
        int result = c.add(2,3);
        int r = c.add(2,3,2);
        double r1 = c.add(2.3,2);
        System.out.println(result);
        System.out.println(r);
        System.out.println(r1);
    }
}