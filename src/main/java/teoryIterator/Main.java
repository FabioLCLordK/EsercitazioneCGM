package teoryIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        
        List<String> rgb = new LinkedList<>();
        
        rgb.add("red");
        rgb.add("green");
        rgb.add("green");
        rgb.add("blue");
        
        
        //Iterator<String> itr= rgb.iterator();
        ListIterator<String> itr= rgb.listIterator();
        
        while (itr.hasNext()){
            String nextElement= itr.next();
            System.out.println(nextElement);
        }
        
        //per poter andare indietro ho dovuto definire rgb come ListIterator
        //perché l'iterator normale va solo avanti
        
        while (itr.hasPrevious()){
            String prevElement= itr.previous();
            System.out.println(prevElement);
        }
        
         while (itr.hasNext()){
            String nextElement= itr.next();
            
            if(nextElement.equals("green")){
                itr.remove();
            }
            
         }  
            System.out.println(rgb);

           //dove l'indice punta all'elemento, il cursore dell'iteratore si posiziona
        //tra gli elementi
        
        //ATTENZIONE FOR EACH NON CONSENTE ELIMINAZIONE
    
//        for(String color: rgb){
//            if(color.equals("green")){
//                rgb.remove("green");
//            }
//            
//        }
//        
//         System.out.println(rgb);
}
        
}
