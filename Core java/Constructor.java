class construct{

    private int age ;
    private String name ;
     
    public construct( int age , String name ){
        this.age = age ;
        this.name = name ;
    }
     
    public construct(){
        System.out.println("Hello you are in Constructor ");
    }

    public void show(){
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        
        construct c = new construct(19 , "Abhay");
        c.show();

    }
}
