package Enum;
enum Laptop{
    Dell(30000), Hp(40000), Asus(25000), Acer(20000), Macbook(50000);

    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String arg[]){
        Laptop lap = Laptop.Dell;
        System.out.println(lap);

        System.out.println(lap.getPrice());
    }
}
