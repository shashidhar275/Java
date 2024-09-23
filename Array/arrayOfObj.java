class Student{
    int rollNo;
    String name;
    byte marks;
}

public class arrayOfObj{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.rollNo = 1;
        s1.name = "Shashidhar";
        s1.marks = 99;
        s2.rollNo = 2;
        s2.name = "Atharva";
        s2.marks = 95;
        s3.rollNo = 3;
        s3.name = "Suresh";
        s3.marks = 88;
        System.out.println(s1.name);
        System.out.println(s1);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(Student s: students){
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
            System.out.println();
        }
    }
}