class mobile {

    String brand;
    int price;
    String network;
    static String name;

    static {
        System.out.println("Abhay Ramkrushna Patil");
        name = "smartPhone";
    }

    public mobile() {
        brand = "Apple";
        price = 45455454;
        network = "5G";
    }

    public void show() {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(network);
        System.out.println(name);
    }

    public static void show1(mobile obj) {
        System.out.println();
        System.out.println(obj.brand);
        System.out.println(obj.price);
        System.out.println(obj.network);
        System.out.println(obj.name);
        System.out.println("Static method");
        System.out.println(name);
    }

}

class human {

    private String name;
    private int age;

    human(String str, int n) {
        this.name = str;
        this.age = n;
    }

    void show() {
        System.out.println(name);
        System.out.println(age);
    }

    private void print() {
        System.out.println("Abhay Ramkrushna Patil");
    }

    public String getName() {
        print();
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Stat {
    public static void main(String[] args) {

        // System.out.println("Hello World");

        // mobile obj = new mobile() ;
        // obj.brand = "Apple" ;
        // obj.price = 125465 ;
        // obj.network = "4G" ;
        // obj.name = "smartPhone";

        // mobile obj1 = new mobile() ;
        // obj1.brand = "Samsung" ;
        // obj1.price = 12578 ;
        // obj1.network = "4G" ;
        // obj1.name = "foldPhone";

        // obj.show() ;
        // System.out.println();
        // obj1.show() ;

        // mobile.show1(obj);
        // // Class.forName("mobile");

        human h = new human("Abhay", 19);
        h.getName();
        h.show();

    }
}