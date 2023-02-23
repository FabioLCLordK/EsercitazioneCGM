package obj;

import obj.User;

public class Main {
    public static void main(String[] args) {
        
        User fabio= new User("Fabio","800A");
        User carlo= new User("Fabio","800A");
        User chiara= new User("Chiara","800A");
        String pollo= "ehi";
                
        boolean soUguali= fabio.equals(chiara);
        System.out.println(soUguali);
        
        System.out.println();
    }
}
