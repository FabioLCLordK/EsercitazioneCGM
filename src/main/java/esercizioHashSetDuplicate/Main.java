package esercizioHashSetDuplicate;

import java.util.HashSet;
import java.util.Set;
import javax.swing.plaf.metal.MetalIconFactory;

public class Main {
    
    public static int findDuplicate(String word){
        word=word.toLowerCase();
        
        Set<Character> prova= new HashSet();

        for (int x=0;x<word.length();x++){
            //word.charAt(i);
            if(!prova.add(word.charAt(x))){
                return x+1;
            }
        }
    
        
        return -1;

    }
    
    public static void main(String[] args) {
     
        System.out.println(findDuplicate("abcAbc"));
        System.out.println(findDuplicate("abcabc"));
        System.out.println(findDuplicate("abcdef"));
        System.out.println(findDuplicate("babbo"));
    }
}
