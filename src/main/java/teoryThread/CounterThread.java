
package teoryThread;
public class CounterThread  extends Thread{
    private int i;
    private String name;

    public CounterThread(String name) {
        this.i=0;
        this.name = name;
    }
    
    @Override
    public void run(){
        //ciclo infinito while(true)
        while(i<10){
            System.out.println("Thread running: "+this.name + "- Counter: "+i);
            i++;
        
            try{
                Thread.sleep(250);
            }catch(InterruptedException ex){
        }
        
        }
        System.out.println(this.name+ " terminato");
    }
}
