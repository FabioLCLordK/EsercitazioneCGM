package esercizioTimer;
public class RenderTimer extends Timer{
    private int i;
    
    public RenderTimer(int sleep) throws InterruptedException {
        super(sleep);
    }
    
    @Override
    public void init(){
        i=0;
    }
    
    @Override
    public void update(){
        System.out.println("Passati "+i*super.sleep/1000+" secondi");
        i++;
    }
    
    
}
