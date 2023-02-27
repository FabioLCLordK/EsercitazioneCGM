package esercizioInvoice;
//creare una classe invoice con id numerico, creare un treeset con tipo di dato 
//Invoice (con elementi ordinati tramite Id). come? creando un comparator

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Set<Invoice> prova = new TreeSet<>(new Comparator<Invoice>(){
            @Override
            public int compare(Invoice left, Invoice right){
                
                return right.getId()-left.getId();
            }
        });
        
        Invoice fatt1=new Invoice(1, "fabio", 1000);
        Invoice fatt2=new Invoice(2, "sara", 500);
        Invoice fatt3=new Invoice(8, "paco", 500);
        
        prova.add(fatt1);
        prova.add(fatt2);
        prova.add(fatt3);
        
        System.out.println("");
        for (Invoice x:prova){
            System.err.println(x.toString());
        }

        
    }
}
