public class Inheritence {
    public static void main(String arg[]){
        ScientificCalculator calc = new ScientificCalculator();

        int val1 = calc.add(2,3);
        int val2 = calc.sub(5,2);
        int val3 = calc.multi(6,4);
        int val4 = calc.div(72,3);
        double val5 = calc.power(2,5);

        System.out.println(val1 + " " + val2 + " " + val3 + " " + val4 + " " + val5);
    }
}
//We can also run this file just by having only class files of Calc.java and AdvCalc.java
