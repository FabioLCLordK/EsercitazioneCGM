package esercizioScadenzaLatte;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
public class MainScaduto {
    public static void main(String[] args) throws InterruptedException { 
            LocalDate now = LocalDate.now(); 
            LocalDate buy = LocalDate.of(2023, Month.FEBRUARY, 25); LocalDate expires = buy.plus(15, ChronoUnit.DAYS); 
            //LocalDate expires = buy.plusDays(15); 
            Period period = Period.between(now, expires); 
                //System.out.println(period.isNegative()); 
                if(period.isNegative()) { 
                    System.out.println("Tempo scaduto"); 
                } 
                    else { System.out.println("Sei ancora in tempo"); } 
            //System.out.println(now.isAfter(expires)); 
} 

}
