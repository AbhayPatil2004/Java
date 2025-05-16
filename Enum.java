
// enum Status{
//     Running , Failed , Pending , Successs ;
// }

enum Laptop{

    Mackbook(2000) , XPS(5465) , Surface(65556) , Thinkpad(4545);

    private int price;
        
    private Laptop( int price ){
        this.price = price ;
    }

    public int getPrice(){
        return price ;
    }

}

public class Enum {
    
    public static void main(String[] args) {
        // int i = 5 ;
        // Status s = Status.Running;

        // System.out.println(s.ordinal());
        // Status[] x = Status.values();
        // // System.out.println(x[0]);

        // for( Status y : x ){
        //     System.out.println(y);
        // }

        // Status s = Status.Pending ;
        // if( s == Status.Pending ){
        //     System.out.println("Yes");
        // }

        Laptop lap = Laptop.Mackbook ;
        System.out.println(lap);
        System.out.println(lap.getPrice());

        for( Laptop l : Laptop.values() ){
            System.out.println(l);
            System.out.println(l.getPrice());
        }
        
    }
}
