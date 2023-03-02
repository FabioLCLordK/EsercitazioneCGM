package teoryMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Map <String,String> dictionary= new HashMap<>();
        
        //put è il ADD delle map.
        
        dictionary.put("Ciao","Maaaaareeeee");
        dictionary.put("Bello", "St'orologgggio");
      
        Set<String> keys = dictionary.keySet();
        
        for(String x:keys){
            System.out.println(x);
        }
        
        String term= dictionary.get("Ciao");
        System.out.println(term);
        
        Set<Entry<String, String>> entries= dictionary.entrySet();
        
        for(Entry x:entries){
            System.out.println("key: "+ x.getKey() + " - value: "+ x.getValue());
        }
    }
}
