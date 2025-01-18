package oops;
abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing Musics...");
    }
}

abstract class Audi extends Car{
}

class SportsCar extends Audi{  //Concrete Class
    public void drive(){
        System.out.println("Driving");
    }
}

class Ab{
    public static void main(String arg[]){
        Car obj = new SportsCar();
        obj.drive();
        obj.playMusic();
        Integer num1 = 2;
        int num = num1.intValue();
        System.out.println(num);
    }
}