public class ExceptionHandling {
    
    public static void main(String[] args) {

        int i = 0;  // Changed to 0 to cause ArithmeticException
        int j = 354;

       
        try {
            j /= j ;
            
            if( j == 1 ){
                throw new ArithmeticException("Hello World");
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error: " + e);
        }
        
        // catch( Exception e ){
        //     System.out.println(e);
        // }
        System.out.println("Value of j: " + j);
    }
}
