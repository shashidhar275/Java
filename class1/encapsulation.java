class Human{
    private String name;
    private int age;

    public Human(){  //Default Constructor
        age = 22;
        name = "Atharva";
    }

    Human(int age,String name){  //Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println(this.name + " : " + this.age);
    }
}
public class encapsulation {
    public static void main(String args[]){
        Human h1 = new Human();
        Human h2 = new Human(21,"Gaurav");
        h1.setName("Shashidhar");
        h1.setAge(22);
        h1.display();
        h2.display();
    }
}
