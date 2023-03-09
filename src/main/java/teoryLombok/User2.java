package teoryLombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor
@Getter
@Setter
@ToString
public class User2 {
    
    private String name;
    
    private String surname;
    
    @ToString.Exclude //per escludere un campo dal tu string
    private String age;
    
    
}
