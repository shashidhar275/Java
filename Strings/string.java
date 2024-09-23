public class string{
    public static void main(String args[]){
        // String s = new String("Shashidhar");
        String s = "Shashidhar "; //Both are same but behind the scene it will create object and all..it will get stored in the heap memory
        String str = "Angadi";
        System.out.println(s);
        System.out.println("Hello " + s);
        String name = s.concat(str);
        System.out.println(name);
        char ch = s.charAt(2);
        System.out.println(ch);
    }
}