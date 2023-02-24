package teoryDecorator;

public class App {
    public static void main(String[] args) {
        
        Car panda= new BasicCar();
        
        // il decorator serve ad aggiungere nuove funzionalità
        // classe per classe, tramite nuova istanza di una classe
        // che estende il decorator
        
        
        panda= new AirConditionedCar(panda);
        
        panda= new PowerSteeringCar(panda);
        
        panda.getModel();
        
    }
}
