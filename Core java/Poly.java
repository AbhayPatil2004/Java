class Computer{

}

class Laptop extends Computer{

}

class A{

    public void show(){
        System.out.println("In A");
    }
}   

class B extends A{

}


public class Poly {
    
    public static void main(String[] args) {

        // B obj = new B();
        A obj = new B() ;

        // Computer lap = new Laptop();
        // Laptop lap = new Computer();

    }
}
