/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoryThread;

/**
 *
 * @author LordKazor
 */
public class Test2 {
    public static void main(String[] args) {
        
        
        Counter shareCounter= new Counter();
        //Counter count1= new Counter();
        
        CounterWork cw1= new CounterWork(shareCounter,"th1");
        Thread th1= new Thread(cw1);
        th1.start();
        
        //Counter count2= new Counter();
        
        CounterWork cw2= new CounterWork(shareCounter,"th2");
        Thread th2= new Thread(cw2);
        th2.start();
        
    }
}
