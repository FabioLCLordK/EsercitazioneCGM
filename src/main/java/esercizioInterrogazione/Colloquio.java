//PROGRAMMA CHIESTO AD UN COLLOQUIO

package esercizioInterrogazione;
public class Colloquio {
    public static void main(String args[]) {
      int[] array= {14,5,23,89,4,50};
      int[] temp= new int[array.length];
      int j=0;
      for(int i=0;i<array.length;i++){
          if (i%2==0){
              temp[i]=array[j];      
              j++;
          }else{
              temp[i]=array[array.length-j];
          }
        System.out.print(temp[i]);
        if(i<array.length-1){
         System.out.print(",");
        }
      }
      
    }
}
