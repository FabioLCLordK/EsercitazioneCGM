package teorySerialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        final File DIRFILES = new File("C:\\Users\\setti\\Documents\\NetBeansProjects\\CGMLessonProject\\Files"); 
           if(!DIRFILES.exists()) { 
                DIRFILES.mkdirs();
            } 
        
          File file= new File(DIRFILES,"user");
    
        
//        ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream(file));
//        User ennio= new User("Ennio", "Annio", 27);
//        outputStream.writeObject(ennio);
//        outputStream.flush();
//        outputStream.close();
        
        ObjectInputStream inputStream= new ObjectInputStream(new FileInputStream(file));
        User ennio= (User) inputStream.readObject();
        inputStream.close();
        
        System.out.println(ennio);
        
        
        //Non potete serializzare più di un oggetto!!!
    }
}
