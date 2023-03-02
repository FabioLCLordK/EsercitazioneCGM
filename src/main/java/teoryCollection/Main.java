package teoryCollection;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
               
        Queue<String> rgb = new PriorityQueue<>(); 
        //Set<String> rgb = new HashSete(); rgb.offer("b"); // it primo elemento rgb.offer("a"); // it secondo elemento rgb.offer("d"); // it terzo elemento rgb.offer("c"); // it quarto elemento 
        //String nextElement = rgb.peek(); // chi & l'elemento in testa? //System.out.println(nextElement); 
        //String nextElement = rgb.poll(); // venga pure.... //System.out 
        //System.out.println(rgb); 
        
        rgb.add("red");
        rgb.add("green");
        rgb.add("alfio");
        rgb.add("green");
        rgb.add("blue");
        
        
        
        for(String color : rgb) { 
            System.out.println(color); } 
        }
    

    }
