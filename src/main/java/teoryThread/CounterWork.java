package teoryThread;

public class CounterWork implements Runnable{
    
    private static final Object obj= new Object();
    
    private String name;
    private Counter counter;

    public CounterWork(Counter counter,String name) {
        this.name= name;
        this.counter = counter;
    }
    
    
    
    @Override
    public void run() {
        while(true){
            //synchronized richiede come riferimento, il riferimento all'oggetto 
            //condiviso tra tutti i tread che provano ad accedere al blocco di codice
            //quindi sincronizza i tread così che uno aspetti l'altro prima di essere
            //eseguito, invece di accavallarsi 
            //si chiama MUTUAL EXCLUSION proprio perché si escludono mutualmente
            //ovvero a vicenda
            synchronized(counter){
            counter.increaseValue();
            System.out.println("Valore di "+name +"= " + counter.getValue());
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException ex){
                
            }
            
            
            
        }
        
    }
    
    
}
