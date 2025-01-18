package Interface;
interface Computer{
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding through Desktop");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding...");
    }
}
class Developer{
    public void developApp(Computer lap){
        lap.code();
    }
}


public class InterfaceNeed {
    public static void main(String arg[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer shashid = new Developer();
        shashid.developApp(desk);
    }
}
