package Java.Basics;

// class C{
//     final private int id;
//     final private String name;
//     public C(int id,String name){
//         this.id = id;
//         this.name = name;
//     }
//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "C [id=" + id + ", name=" + name + "]";
//     }
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         C other = (C) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

    
    
// }
//Instead of all the above things for just data carry purpose(Data carrier classes) we can just use below record class syntax
record C(int id,String name){

}
public class RecordClass {
    public static void main(String arg[]){
        C obj1 = new C(1,"Shashidhar");
        C obj2 = new C(1,"Shashidhar");
        System.out.println(obj1);
        System.out.println(obj1.equals(obj2)); //When there is no equals method in class
        System.out.println(obj1.name());
    }
}
