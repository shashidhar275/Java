class Cinema{
    public Cinema(){
        System.out.println("In a constructor");
    }

    public void show(){
        System.out.println("In a show");
    }
}

public class AnonymousObj {
    public static void main(String args[]){
        new Cinema().show();
    }
}
