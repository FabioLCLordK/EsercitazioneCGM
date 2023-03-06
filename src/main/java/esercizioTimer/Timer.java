/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizioTimer;

/**
 *
 * @author LordKazor
 */
public abstract class Timer implements Runnable{
    protected int sleep;
    
    public Timer(int sleep) throws InterruptedException {
        this.sleep=sleep;
        Thread thread= new Thread(this);    //richiama un oggetto della classe Timer stessa   
        thread.start();

    }
    
    
    protected void init(){
        
    }
    protected void update(){
    }
   
    @Override
    public void run(){
        this.init();
        while(true){
            this.update();
        
        try{
            Thread.sleep(this.sleep);
        }catch (InterruptedException ex){
        }
        }
    }
}
