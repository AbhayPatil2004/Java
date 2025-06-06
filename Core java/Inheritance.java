class Calc{

    public int add( int n1 , int n2 ){
        return n1 + n2 ;
    }
    public int sub( int n1 , int n2 ){
        return n1 - n2 ;
    }
}

class AdvCalc {
     
    public int multi( int n1 , int n2 ){
        return n1 * n2 ;
    }
    public int div( int n1 , int n2 ){
        return n1 / n2 ;
    }

}

class VeryAdvCalc extends  Calc{

    public int power( int n1 , int n2 ){
        return (int)(Math.pow(n1, n2));
    }
}


class Inheritance{

    public static void main(String[] args) {
        // AdvCalc c = new AdvCalc();
        // int a = c.add(10,20);
        // int b = c.sub(10,20);
        // int cd = c.multi(10,20);
        // int sdf = c.div(10,20);

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(cd);
        // System.out.println(sdf);

        VeryAdvCalc v = new VeryAdvCalc();
        System.out.println(v.power( 10 , 20 ));;
        System.out.println(v.add( 20 , 10 ));
    }
}