
package teoryBuilder;

import lombok.Getter;

@Getter
public class UserBuilder {
    private String firstname;  //required
    private String lastname;    //required
    private String cartaIdentita;
    private int age;

    //implemento i campi required nel costruttore
    public UserBuilder(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public UserBuilder age(int age){
        this.age= age;
        return this;
    }
    
    public UserBuilder cartaIdentita(int cartaIdentita){
        this.cartaIdentita= this.cartaIdentita;
        return this;
    }
   
    
    
    public User build(){
        User user= new User(this);
        return user;
    }
    
    
}
