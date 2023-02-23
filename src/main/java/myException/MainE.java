package myException;

public class MainE {
    public static int addNatural(int a, int b) {

    if (a < 0) {
    throw new NotValidException();
        }

    if (b < 0){

        throw new NotValidException("b minore di zero");
    }
    return a + b;
    }
    
    public static int doubleUpNatural(int a) {

    int z = addNatural(a, a);
    return z;
    }
    
    public static void main(String[] args) {
        int a,b= 0;
         a=-5;
         b=-2;
        try{
            int c= doubleUpNatural(a);
            System.out.println(c);
        }catch(NotValidException ex){
            ex.print();
        }
    }
}
