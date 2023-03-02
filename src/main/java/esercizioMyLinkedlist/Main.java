package esercizioMyLinkedlist;
public class Main {
    public static void main(String[] args) {
        
        User ciao1= new User("Fabio","fabio",32);
        User ciao2= new User("Peppe","Peppo",34);
        User ciao3= new User("Sara","Sarruio",35);
        User ciao4= new User("Ciao","Mare",39);
        
        MyLinkedList prova= new MyLinkedList();
        
        prova.add(ciao1);
        prova.add(ciao2);
        prova.add(ciao3);
        prova.add(ciao4);
        
        
        System.out.print(prova.printamiTutta());
    }
}
