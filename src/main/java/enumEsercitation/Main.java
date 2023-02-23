package enumEsercitation;

import enumEsercitation.PeriodicTable;

public class Main {
    public static void main(String[] args) {
        
        PeriodicTable elem= PeriodicTable.HELIUM;
        
        switch(elem){
                case HELIUM:
                   System.out.println(PeriodicTable.HELIUM);
                   break;
                case HYDROGEN:
                   System.out.println(PeriodicTable.HYDROGEN);
                   break;
                default:
                   System.out.println("800A");
                   
    }
    }
}
