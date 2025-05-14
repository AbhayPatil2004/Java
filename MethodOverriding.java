class A{

    public void show(){
        System.out.println("In A Show");
    }   
}

class B extends A{

    public void show(){
        System.out.println("In B Show");
    }

}

public class MethodOverriding {
    
    public static void main(String[] args) {

        B b = new B();
        A a = new A();

        a.show();
        b.show();
    }
}
