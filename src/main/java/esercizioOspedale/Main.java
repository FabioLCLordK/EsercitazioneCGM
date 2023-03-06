package esercizioOspedale;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException { 
        Queue<Sufferer> prontoSoccorso = new PriorityQueue<Sufferer>();
        prontoSoccorso.offer(new Sufferer("Stan", "Marsh", "Intossicazione aerea",TriageCode.RED)); 
        prontoSoccorso.offer(new Sufferer("Fric", "Cartman", "Dolore di panda", TriageCode.GREEN)); 
        prontoSoccorso.offer(new Sufferer("Kenny", "McCornik", "Danno celebrate", TriageCode.RED)); 
            
        while(prontoSoccorso.size() > 0) {
                System.out.println(prontoSoccorso.poll()); 
        } 
        
        
        
    }
}
