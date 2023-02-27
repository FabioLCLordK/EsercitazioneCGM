package teorySerialize;

import java.io.Serializable;

public class User implements Serializable {
    
    private static final long SerialVersionUID=123L; //indica la versione della classe

    private String name;
    private String surname;
    private int age;
    private transient int followers=0; //questo TRANSIENT fa si che il valore dentro followers NON verrà serializzato

    // tutti le classi dei campi che compongono una classe SERIALIZABLE devono essere
    //SERIALIZABLE, altrimenti vanno impostate come transient
    
    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", age= " + age +"}";
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 
    
    
}
