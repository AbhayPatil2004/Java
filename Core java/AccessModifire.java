// import tools.*;

class A{

    int marks = 10 ;
}
class C extends A{
    

}

// class alien{

//     private final int id ;
//     private final String name ;

//     alien( int n , String str ){
//         this.id = n ;
//         this.name = str ;
//     }
    
//     @Override 
//     public String toString(){
//         return id + " " + name ;
//     }
    

// }

record alien( int id , String name ){

}
class AccessModifire{

    public static void main(String[] args) {
        
        alien a = new alien(0,"abhay");
        System.out.println(a);

    }

}