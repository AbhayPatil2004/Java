// import java.io.IOException;
// import java.io.BufferedReader;
// import java.util.Scanner

// public class Input{

//     public static void main(String[] args )throws IOException{
        
//         System.out.println("Enter a number...");
//         // int num = System.in.read();
//         // System.out.println(num);

//         // BufferedReader bf = new BufferedReader(null)


//     }
// }

import java.util.Scanner;
 

public class Input{

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        // System.out.println("Enter a number ... ");
        // int n = scan.nextInt();

        // System.out.println(n);

        // scan.close();

        int i = 0 ;
        int j = 0 ;

        try{
            j = 10 / 0 ;
            System.out.println("Bye...");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Bye");
        }

        if( 1 == 1 ){
            System.out.println("yes");
        }
    }
}