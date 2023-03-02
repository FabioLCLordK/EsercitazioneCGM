package teoryObj;

import java.util.Objects;

public class User {
    private String firstname;
    private String lastname;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    

    @Override
    public String toString() {
        return "User{" + "firstname= " + firstname + ", lastname= " + lastname + '}';
        //return String.format("firstname: %s; lastname %s", firstname, lastname);
    }
    
    @Override
    public boolean equals(Object obj){
        if(( obj== null) || (!(obj instanceof User))){
             return false;
        }else if(obj == this){  //QUESTO lo devo fare perché instanceof è lentissimo
            return true; 
        }else{
            //ora posso fare il casting
            User u= (User)obj;
            return this.firstname.equals(u.getFirstname())
                   && this.lastname.equals(u.lastname);
        }
        
    }
    
//    @Override
//    public int hashCode(){
//        return Object.hash(firstname, lastname);
//    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.firstname);
        hash = 47 * hash + Objects.hashCode(this.lastname);
        return hash;
    }
        

    
    
}
