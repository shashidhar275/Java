class Student{
    String name;
    int rollNo;
    static String school;

    static{
        System.out.println("Inside the static block");
        school = "St.Anne's convent High School";
    }

    Student(){
        System.out.println("Inside the constructor");
        name = "";
        rollNo = 1;
    }

    void show(){
        System.out.println(name+ " : " +rollNo + " : " +school);
    }
}
public class staticBlock{
    public static void main(String arg[]) throws ClassNotFoundException{
        // Student s1 = new Student();
        // s1.name = "Shashidhar Angadi";
        // s1.rollNo = 531;
        // Student s2 = new Student();
        // s1.show();
        Class.forName("Student");
    }
}