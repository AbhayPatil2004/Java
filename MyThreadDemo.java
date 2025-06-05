class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi...");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class MyThreadDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.getPriority());
        b.setPriority(10);
        a.start();
        b.start();
    }
}
