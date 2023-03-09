package teoryBuilder;

import lombok.Builder;
import lombok.Data;



@Data
//@Builder
public class User {
    private String firstname;
    private String lastname;
    private String cartaIdentita;
    private int age;
    
    
//    public User(UserBuilder builder ){
//        this.firstname= builder.firstname;
//        this.lastname= builder.lastname;
//        this.cartaIdentita= builder.cartaIdentita;
//        this.age= builder.age;
//        
    
    // senza @Builder ho dovuto creare una classe UserBuilder
    // da richiamare per costruire il builder di User
    
        public User(UserBuilder builder ){
        this.firstname= builder.getFirstname();
        this.lastname= builder.getLastname();
        this.cartaIdentita= builder.getCartaIdentita();
        this.age= builder.getAge();
        }

        public static UserBuilder builder(String firstname, String lastname){
            return new UserBuilder(firstname, lastname);
        }
        
    }
