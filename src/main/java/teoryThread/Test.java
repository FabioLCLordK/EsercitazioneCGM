package teoryThread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        
        CounterThreadAlfa counter1= new CounterThreadAlfa("th1");
        Thread th1= new Thread(counter1); //CREATED
        th1.start(); //READY
        
        System.out.println("Th1 avviato");
        
        CounterThread th2= new CounterThread("th2");
        th2.start();
        
        System.out.println("Th2 avviato");
        
        
        //qui
        th1.join();
        th2.join();
        
        System.out.println("Main Thread Terminato");
     
    }
}
