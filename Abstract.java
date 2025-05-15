abstract class Car{

    // public abstract void drive();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

class Wagnor extends Car{

    public void drive(){
        System.out.println("Driving");
    }
}

public class Abstract {
    
    public static void main(String[] args) {
        
        Wagnor car = new Wagnor();
        car.drive();
        car.playMusic();
    
    }
        
}
