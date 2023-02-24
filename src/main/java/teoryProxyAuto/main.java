package teoryProxyAuto;
public class main {
    public static void main(String[] args) {
        
        
        Car car1= new ProxyCar(new MotorCar());
        car1.turnOn();
        car1.accelerate();
        
        
        
    }
}
