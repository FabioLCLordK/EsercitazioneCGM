package teoryLombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    
    @Setter(AccessLevel.PRIVATE) //mette privato il setter di questo campo
    private int age;
    
    //Lombok serve ad "evitare" di scrivere codice noto come i get e setter o i costruttori
    //spesso una perdita di tempo, auto generando i getter e setter come ho richiamato
    // sopra la classe @Getter e @Setter
   
    
    
}
