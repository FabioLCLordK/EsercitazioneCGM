package esercizioCSV;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        
        User[] users= new User[3];
        users[0]= new User("Pinco", "pallino", 18);
        users[1]= new User("Carlo", "pallino", 22);
        users[2]= new User("Ciccio", "pallino", 24);
        
        Documentation document= new Documentation(users);

        document.writeCsv("prova1");
        User[] users2;
        users2= document.readCsv("prova1.csv");
        
        System.out.println("\n"+"Provo a restiturire quello letto e passato ad Array \n"+"");
        for(User x:users2 ){
            System.out.println(x.toString());
        }
    }
}
