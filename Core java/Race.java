// // class increment{

// //     int count = 0 ;
// //     public synchronized void increment(){

// //         for( int i = 0 ; i < 1000 ; i++ ){
// //             count ++ ;
// //         }
// //     }
// // }

// // public class Race {
    
// //     public static void main(String[] args) throws InterruptedException {
        
// //         increment i = new increment();
// //         Thread t1 = new Thread(() ->{
// //             i.increment();
// //         });
        
// //         Thread t2 = new Thread(() ->{
// //             i.increment();
// //         });

// //         t1.start();
// //         t2.start();
// //         t1.join();
// //         t2.join();
// //         System.out.println(i.count);

// //         var n = 10 ;
// //         System.out.println(n);
// //     }
// // }

// sealed class A extends Thread permits B,C {

//     A(){
//         System.out.println("A");
//     }
// }
// final class B extends A{

// }
// final class C extends A{

// }
// class D{

// }

// class Race{

//     public static void main(String[] args ){
//         B b = new B();
//     }
// }