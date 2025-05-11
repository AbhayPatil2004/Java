public class operator{

    public static void main(String[] args) {
        
        int num1 = 10 ;
        int num2 = 20 ;

        int result = num1 + num2 ;

        System.out.println(result);
        
        num1 = num1 + 2 ;
        System.out.println(num1);
        
        num1 += 2  ;
        System.out.println(num1);
        num1 ++ ;
        System.out.println(num1);
        System.out.println(num1++);
        System.out.println(++num1);

        if( num1 >= num2 ){
            System.out.println(num1) ;
        }
        else{
            System.out.println(num2) ;
        }

        boolean b = num1 > num2 ;
        num2 = 17 ;
        boolean v = num1 == num2 ;
        System.out.println(b);
        System.out.println(v);

        String str = "Hello" ;
        String s = "Hello" ;
        System.out.println( str == s );

        // Logical Operator
        System.out.println( str == s && str == s );
        System.out.println( str == s || str == s );

        if( 8 == 8 ){
            System.out.println("ljsdkf");
        }
        if( true && true ){
            System.out.println("ljsdkf");
        }
    }
}