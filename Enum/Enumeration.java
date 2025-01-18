package Enum;

enum Status{
    Running, Failed, Pending, Success;
}

class Enumeration{
    public static void main(String arg[]){
        Status s = Status.Running;
        System.out.println(s);

        Status arr[] = Status.values();
        for(Status value: arr){
            System.out.println(value);
        }

        System.out.println(s.ordinal());

        System.out.println(s.getClass());
        System.out.println(s.getClass().getSuperclass());
    }
}