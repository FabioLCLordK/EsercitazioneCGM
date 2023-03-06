package teoryTimeIstant;

import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        
        
        //alla variabile di tipo Instant assegno il valore del metodo statico .now()
        //essendo noi +1 sul fuso orario
        Instant adesso= Instant.now();
        //essendo noi +1 sul fuso orario
        Instant adessoQua= adesso.plus(1,ChronoUnit.HOURS);
        System.out.println(adessoQua);
        
        
        //long sec= adesso.getEpochSecond();
        long nano= adessoQua.getNano();
        long sec= adessoQua.getEpochSecond();

        LocalTime sveglia=LocalTime.of(15, 0,0);
        LocalTime oraora=LocalTime.of(15, 0,0);
        
        int hour= oraora.getHour();
        int minute= oraora.getMinute();
        

        
        System.out.println(sec);
        System.out.println(nano);
        
        //LocalTime è molto meglio di Instant
        
        //LocalDate da invece la data
        
        //LocalDateTime da data e ora
        
        System.out.println(hour);
        System.out.println(minute);
        
        
    }
}
