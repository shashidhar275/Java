public class Inheritence {
    public static void main(String arg[]){
        AdvCalc calc = new AdvCalc();

        int val1 = calc.add(2,3);
        int val2 = calc.sub(5,2);
        int val3 = calc.multi(6,4);
        int val4 = calc.div(72,3);

        System.out.println(val1 + " " + val2 + " " + val3 + " " + val4);
    }
}
//We can also run this file just by having only class files of Calc.java and AdvCalc.java
