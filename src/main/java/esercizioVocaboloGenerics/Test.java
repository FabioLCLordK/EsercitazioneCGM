/* Definire un Set<Vocabolo> vocabolario tramite classe HashSet<>.
Inserire gli oggetti formati dai campi
"ciao", "Salutare qualcuno in maniera informale"
"salve", "Salutare qualcuno in maniera formale"

Stampare tramite iterator e foreach il contenuto di Set.

*/


package esercizioVocaboloGenerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        
        Set<Vocabolo<String,String>> vocabolario= new HashSet<>();
        
        vocabolario.add(new Vocabolo("ciao", "Salutare qualcuno in maniera informale"));
        vocabolario.add(new Vocabolo("salve", "Salutare qualcuno in maniera formale"));
        
        Iterator<Vocabolo<String,String>> itr= vocabolario.iterator();

        while (itr.hasNext()){
            Vocabolo nextElement= itr.next();
            System.out.println(nextElement);
        }
        
        for(Vocabolo v:vocabolario){
            System.out.println(v.getName() + ":= "+ v.getDescription()+";");
        }
        
    }
    
}
