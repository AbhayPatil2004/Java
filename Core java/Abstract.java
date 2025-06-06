abstract class Car{

    // public abstract void drive();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

class Wagnor extends Car{

    public void drive(){
        System.out.println("Driving");
    }
}

// class A{

//     int age ;

//     public void show(){
//         System.out.println("In show");
//     }
//     class B{

//         public void config(){
//             System.out.println("In Config");
//         }
//     }
// }
 
abstract  class A{

    public abstract void show();
}

// class B extends A{

//     public void show(){
//         System.out.println("In B show");
//     }

// }
public class Abstract {
    
    public static void main(String[] args) {
        
        // Wagnor car = new Wagnor();
        // car.drive();
        // car.playMusic();

        // A a = new A(){
        //     int age = 19 ;
        //     public void show(){
        //         System.out.println("In new show");
        //     }
        // };
        // a.show();
        

        // A.B b = a.new B();
        // b.config();

        A a = new A(){
            public void show(){
                System.out.println("In new show");
            }
        };
        a.show();
    }
        
}
