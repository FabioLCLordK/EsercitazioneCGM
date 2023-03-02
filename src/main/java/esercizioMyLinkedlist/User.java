package esercizioMyLinkedlist;

import esercizioCSV.*;

public class User {
    private String name;
    private String surname;
    private int age;
    private User next;
    
    public User(){
        
    }
    
    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User getNext() {
        return next;
    }

    public void setNext(User next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return " ~ name=" + name + ", surname=" + surname + ", age=" + age +"; \n";
    }

 
    
}
