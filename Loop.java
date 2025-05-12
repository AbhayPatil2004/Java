public class Loop {

    public static void main(String[] args) {

        for( int i = 0 ; i < 10 ; i++ ){
            System.out.println("Hello World");
        }
        
        int i = 0 ;
        while( i < 10  ){
            System.out.println("Hello World");
            i++ ;
        }

        int n = 0 ;
        do{
            System.out.println(n);
            n ++ ;
        }while( n < 10 );
    }

}
