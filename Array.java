public class Array {
    
    public static class Student {
        
        int rollNo;
        String name;
        int marks;
    }

    public static void main(String[] args) {
        
        // int nums[] = { 3 , 5 , 8 , 7 };
        // System.out.println(nums[3]);
        
        // int n[] = new int[4] ;
        
        // System.out.println(n[3]);
        // // System.out.println(n);

        // for( int i = 0 ; i < 4 ; i++ ){
        //     System.out.println(n[i]);
        // }

        // // 2d Array ;
        // int n1[][] = new int[3][3];

        // for( int i = 0 ; i < 3 ; i++ ){
        //     for( int j = 0 ; j < 3 ; j ++ ){
        //         int x = (int)(Math.random()*100) ;
                
        //         n1[i][j] = x ;
        //         System.out.print(n1[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for( int n2[] : n1 ){
        //     for( int m : n2 ){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // Jacced Array ;
        // int arr[][] = new int[3][];

        // arr[0] = new int[3];
        // arr[1] = new int[5];
        // arr[2] = new int[9];

        // for( int i = 0 ; i < arr.length ; i++ ){
        //     for( int j = 0 ; j < arr[i].length ; j++ ){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for( int n[] : arr ){
        //     for( int m : n ){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // // 3d Array ;
        // int threeD[][][] = new int[4][5][6] ;

        // for( int i[][] : threeD ){
        //     for( int j[] : i ){
        //         for( int k : j ){
        //             System.out.print(k);
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
        
        // Student s1 = new Student();
        // Student s2 = new Student();
        // Student s3 = new Student();

        // s1.rollNo = 10;
        // s1.name = "Abhay";
        // s1.marks = 100;

        // s2.rollNo = 20;
        // s2.name = "Abhay";
        // s2.marks =500;

        // s3.rollNo = 56;
        // s3.name = "Abhay";
        // s3.marks = 198;

        // System.out.println(s1.rollNo);
        // System.out.println(s1.name);
        // System.out.println(s1.marks);

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for( int i = 0 ; i < 3 ; i++ ){
        //     System.out.println(students[i].rollNo);
        //     System.out.println(students[i].name);
        //     System.out.println(students[i].marks);
        //     System.out.println();
        // }
        

        int[] n = { 10 , 20 , 30 , 40 , 50 };
        for( int i : n ){
            i ++ ;
            System.out.println(i);
        }
        for( int i : n ){
            // i ++ ;
            System.out.println(i);
        }

    }   
}
