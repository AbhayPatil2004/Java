class Calc {

    final public void show() {
        System.out.println("In show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {

    // public void show(){
    // System.out.println("In show");
    // }
    public void add(int a, int b) {
        System.out.println(a + b);
    }

}

// class A {

//     int n;
//     String s;

//     public String show() {
//         return "Hello World";
//     }
//     public boolean equal( A a ){
//         if( this.n == a.n && this.s == a.s ){
//             return true ;
//         }
//         return false ;
//     }
// }

class A{

    public void show1(){
        System.out.println("In A ");
    }
}

class B extends A{
    
    public void show2(){
        System.out.println("In B ");
    }
}

public record Final() {

    public static void main(String[] args) {

        // final int num = 8 ;
        // // num = 10 ;
        // System.out.println(num);

        // Calc c = new Calc() ;
        // c.show();c.add(10, 20);

        // AdvCalc d = new AdvCalc();
        // d.show();

        // A obj = new A();
        // obj.n = 10;
        // obj.s = "Abhay";

        // A obj1 = new A();
        // obj1.n = 10;
        // obj1.s = "Abhay";

        // // System.out.println(obj);
        // System.out.println(obj==obj1);
        // System.out.println(obj.equal(obj1));

        // double d = 4.5 ;
        // int i = (int)d ;

        // System.out.println(d);
        // System.out.println(i);

        // A obj =(A) new B();
        // obj.show1();

        int n = 10 ;
        // Integer n1 = new Integer(10);
        Integer n2 = 11;
        // System.out.println(n1);/ 
        System.out.println(n2); 
        int n4 = n2.intValue();
        System.out.println(n4);

        String str = "2123";
        int m = Integer.parseInt(str);

        System.out.println(m*9);
    }
}
