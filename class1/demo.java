class Calculator{
    int a;
    
    public int add(int num1,int num2){
        return num1 + num2;
    }
}

class Pen{
    public void playMusic(){
        System.out.println("Playing music");
    }

    public String getMeAPen(int rs){
        if(rs>10){
            return "Pen";
        }

        return "Can't buy";
    }
}

public class demo{
    public static void main(String arg[]){
        int num1 = 4;
        int num2 = 5;
        Calculator c = new Calculator();
        int result = c.add(num1,num2);
        System.out.println(result);

        Pen p = new Pen();
        p.playMusic();
        String s = p.getMeAPen(1);
        System.out.println(s);
    }
}