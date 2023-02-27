package teoryHashSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> ints= new HashSet<>();
        
       
        ints.add(2);
        ints.add(0);
        ints.add(1);
        
        ints.add(1);
         
        System.out.println(ints.toString());
        
        Set<Integer> ints2= new HashSet<>();
        ints2.add(3);
        ints2.add(2);
        ints2.add(8);
        
        System.out.println(ints2.toString());
        
        // reatinAll ti da solo la parte in comune tra i 2 set
        ints2.retainAll(ints);
        
        System.out.println(ints2.toString());
        
        SortedSet<Integer> s1 = new TreeSet<>(new IntegerComparator());
        s1.add(6);
        s1.add(17);
        s1.add(1);
        s1.add(-134);
        
        System.out.println(s1.toString());
        
        
        
        //Posso definire una classe momentenea sul momento se mi serve solo per questo
        
        SortedSet<Integer> s2 = new TreeSet<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer left, Integer right){
                return right-left;
            }
        });
        s2.add(6);
        s2.add(17);
        s2.add(1);
        s2.add(-134);
        
        System.out.println(s2.toString());
    }
}
