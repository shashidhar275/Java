package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    public int age;
    public String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that){
        if(this.age>that.age){
            return 1;
        }else{
            return -1;
        }
    }
}
public class ComparableJava {
    public static void main(String arg[]){
        // Comparator<Student> c = new Comparator<Student>(){
        //     public int compare(Student s1,Student s2){
        //         if(s1.age>s2.age){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(22, "Shashidhar"));
        studs.add(new Student(19, "Atharva"));
        studs.add(new Student(12, "Tawheed"));
        studs.add(new Student(31, "Anand"));
        studs.add(new Student(42, "Gaurav"));

        System.out.println(studs);

        for(Student s: studs){
            System.out.println(s);
        }

        // Collections.sort(studs,c);
        Collections.sort(studs); //After implementing the Comparable class it's possible to sort
        System.out.println(studs);
    }
}
