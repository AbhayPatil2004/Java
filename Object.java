class Calculator{

    public int add ( int n1 , int n2 , int n3  ){
        
        return n1 + n2 + n3 ;
    }
    public int add( int n1 , int n2 ){
        return n1 + n2 ;
    }
}

public class Object {
    
    public static void main( String[] args ){

        int num1 = 4 ;
        int num2 = 6 ;

        int add = num1 + num2 ;
        System.out.println(add);

        Calculator c = new Calculator();
        int n = c.add(num1 , num2 , 10 ) ;
        System.out.println(n);
        c.add(10 , 10 );
    }
}
