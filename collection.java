import java.util.ArrayList;
import java.util.Collection ;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set ;
import java.util.HashSet ;
import java.util.TreeSet ; 
import java.util.Map; 

class Student{

    public String name ;
    public int rollNo ;

    Student( String name , int rollNo ){
        this.name = name ;
        this.rollNo = rollNo ;
    }
}

public class collection {
    
    public static void main(String[] args) {
        
        // Collection<Integer> nums = new ArrayList<Integer>();

        // nums.add(10);
        // nums.add(12);
        // nums.add(65);
        // nums.add(45);

        // for( int n : nums ){
        //     System.out.println(n);
        // }
        // System.out.println(nums);
        
        // List<Integer> nums = new ArrayList<Integer>();

        // nums.add(10);
        // nums.add(12);
        // nums.add(65);
        // nums.add(45);

        // System.out.println(nums[0]);
        // for( int n : nums ){
        //     System.out.println(n);
        // }
        // System.out.println(nums);

        Set<Integer> s = new TreeSet<Integer>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);

        s.iterator();

        for( int i : s  ){
            System.out.println(i);
        }   

        Map<String,Integer> m = new HashMap<String,Integer>();

        m.put("Abhay",10);
        m.put("ghgh",10);
        m.put("Abdfhgfdhg",10);

        System.out.println(m.get("Abhay"));
        System.out.println(m);
        
        m.put("Abhay", 20);
        System.out.println(m);

        System.out.println(m.keySet());

        for( String key : m.keySet() ){
            System.out.println( key + " " + m.get(key));
        }

        List<Integer> n = new ArrayList<Integer>();

        n.add(2);
        n.add(4);
        n.add(7);
        n.add(1);
        n.add(9);

        Collections.sort(n);

        System.out.println(n);

        List<Student> students = new ArrayList<>();
        
        students.add( new Student("Abhay", 100));
        students.add( new Student("Abhay", 100));
        students.add( new Student("Abhay", 100));

        for( Student si : students ){
            System.out.println(si.name + si.rollNo);
        }

    }
}
