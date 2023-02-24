package teoryProxyAuto;
public class ProxyCar implements Car { 
    private Car car;

    public ProxyCar(Car car) { 
        this.car = car; 
    } 
    
    @Override 
    public void turnOn() { 
        //controllo autorizazzione
        this.car.turnOn(); 
        //altre operazioni
    } 

    @Override 
    public void accelerate() { 
    this.car.accelerate(); 
    }
}