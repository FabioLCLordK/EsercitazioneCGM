package teoryDecorator;

public class CarDecorator implements Car{
    //la particolarit√† del decorator in Java √® proprio il riferimento
    //alla interfaccia che implementa
    private Car car;
    
    public CarDecorator(Car car){
        this.car= car;
    }   
    @Override
    public void getModel(){
        car.getModel();
    }
 }
