package esercizioMyLinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//implements Iterable<User>
public class MyLinkedList {
    private User finale;
    private User iniziale;
    private int size=0;
    
    private void addPrimo(User user){
           this.iniziale=user;
    }
    
    public void add(User user){
        if(this.iniziale==null){
            addPrimo(user);
        }else{
        user.setNext(user);
        this.finale = user;
        this.size+=1;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" + "testa=" + finale + ", coda=" + iniziale + '}';
    }
    
    public String printamiTutta(){
        User temp= this.iniziale;
        String print="";
        print+= temp.toString();
        for (int i=0; i<size; i++){
           temp= temp.getNext();
           print+=temp.toString();
        }    
        return print;
    }
    
    public int getSize() {
        return size;
    }

//    @Override
//    public Iterator<User> iterator() {
//        Iterator<User> it = new Iterator<User>() {
//
//            private int currentIndex = 0;
//
//            @Override
//            public boolean hasNext() {
//                return currentIndex < currentSize && arrayList[currentIndex] != null;
//            }
//
//            @Override
//            public User next() {
//                return arrayList[currentIndex++];
//            }
//
//            @Override
//            public void remove() {
//                throw new UnsupportedOperationException();
//            }
//        };
//        return it;
    }

