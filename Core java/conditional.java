public class conditional {
    
    public static void main( String[] args ){

        int age = 18 ;
        if( age > 18 ){
            System.out.println("You can vote ");
        }
        else if( age == 18 ){
            System.out.println("You can not vote Congratulation for your first vode ");
        }
        else{
            System.out.println("You can not vote ");
        }

        int n = 4 ;
        int result = 0 ;

        result = n % 2 == 0 ? 1 : 2 ;
        System.out.println(result);
    }
}
