class increment{

    int count = 0 ;
    public synchronized void increment(){

        for( int i = 0 ; i < 1000 ; i++ ){
            count ++ ;
        }
    }
}

public class Race {
    
    public static void main(String[] args) {
        
        increment i = new increment();
        Thread t1 = new Thread(() ->{
            i.increment();
        });
        
        Thread t2 = new Thread(() ->{
            i.increment();
        });

        t1.start();
        t2.start();
        System.out.println(i.count);

    }
}
