
// class A{

//     public A(){
//         System.out.println("I am in A ");
//     }
//     public A(int n ){
//         this();
//         System.out.println("A "+n);
//     }

// }
// class B extends A{

//     public int n = 10 ;

//     public B(){
        
//         super(10);
//         System.out.println("I am in B ");
//     }

//     public B( int n ){
        
//         this();
//         System.out.println("B "+n);
//     }
// }


// public class Super {
    
//     public static void main(String[] args) {
        
//         // B obj = new B(10) ;

//         int a = 10 ;
//         int b ;
//         b = a ;

//         b ++ ;
//         System.out.println(b);
//         System.out.println(a);
        
//         B obj = new B() ;
//         B obj1 = obj ;
//         obj.n = 15 ;

//         System.out.println(obj.n);
//         System.out.println(obj1.n);

//     }
// }
 
@FunctionalInterface
interface  A {

    int show(int i , int j );
    
}
// class B implements A{

//     public void show(){
//         System.out.println("Hello World");
//     }
// }
public class Super{

    public static void main(String[] args) {
        
        // B b = new B();
        // b.show();

        // A a = new A(){

        //     public void show(){
        //         System.out.println("Hello World");
        //     }
        // };

        // A a = (int i ) ->{
        //     System.out.println("Hello World " + i);
        // };

        A a = ( i , j ) -> i+j;
        int i = a.show(5,4);
        System.out.println(i);
    }
}