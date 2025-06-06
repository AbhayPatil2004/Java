// interface Computer{

//     void code();
// }

// class Laptop implements Computer{

//     public void code(){
//         System.out.println("Write Code");
//     }
// }

// class Dekstop implements Computer{
//     public void code(){
//         System.out.println("Write Code Fast");
//     }
// }
// class Devloper{

//     public void devApp(Computer com){

//         com.code();
//         System.out.println("Coding...");
//     }
// }

interface A 
{
    int age = 10 ;
    String str = "Abhay";

    void show();
    void config();
}

public class Interface {

    public static void main(String[] args) {

        // Computer lap = new Laptop();
        // Computer desk = new Dekstop();
        // Devloper abhay = new Devloper();
        // abhay.devApp(lap);
        // abhay.devApp(desk);

        A obj = new A() {
            public void show(){
                System.out.println("In show");
            }
            public void config(){
                System.out.println("In config");
            }
        };

        obj.show();
        obj.config();

        System.out.println(A.age);
        System.out.println(A.str);
    }
}

// class - class => extends
// interface - interface => extends
// class - interface => inmplements