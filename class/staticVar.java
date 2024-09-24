class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + ": " + price + ": " + name);
        System.out.println();
    }
}
public class staticVar{
    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.brand = "Realme";
        obj1.price = 1000;

        obj2.brand = "Apple";
        obj2.price = 2000;
        Mobile.name = "Cell phone";  //Static member : Referring to members that are belonging to class not the objects

        obj1.show();
        obj2.show();
    }
}