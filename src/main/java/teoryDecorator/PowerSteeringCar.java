package teoryDecorator;
public class PowerSteeringCar extends CarDecorator{ 

    public PowerSteeringCar(Car car) {
        super(car);
    }
    @Override 
        public void getModel() { 
        super.getModel(); 
        System.out.print(" with power stearing");
    } 
}