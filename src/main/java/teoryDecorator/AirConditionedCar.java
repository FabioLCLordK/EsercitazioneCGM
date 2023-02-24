package teoryDecorator;

public class AirConditionedCar extends CarDecorator{

      public AirConditionedCar(Car car){
        super(car);
    }
    @Override
    public void getModel(){
        super.getModel();
        System.out.print(" with air ccnditionar");
    } 
}
    
