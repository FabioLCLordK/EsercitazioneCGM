package teoryGeneric;
public class App { 
//    public static int getRandomElement(int [] items) { 
//        int randomIndex = (int) Math.floor(Math.random()* items.length);
//
//        return items[randomIndex]; 
//    } 
//    public static String getRandomElement(String[] items) { 
//            int randomIndex = (int) Math.floor(Math.random() * items.length); 
//        return items[randomIndex]; 
//    } 
    
    public static <T> T getRandomElement(T[] items){
        int randomIndex = (int) Math.floor(Math.random() * items.length); 
        return items[randomIndex]; 
    }
    
    public static void main(String[] args) { 
        Integer[] numbers = {1, 5, 7, 4, 2, 9}; 
        Integer randomElem = getRandomElement(numbers);
        System.out.println(randomElem); 

        String[] colors = {"red", "green", "blue"};
        String randomElemStr = getRandomElement(colors); 
        System.out.println(randomElemStr); 
    } 
}