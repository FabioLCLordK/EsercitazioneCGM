package fileC;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
    //creo un oggetto di tipo file che rappresenta la cartella
    File fileProgetto= new File("FileProgetto");
    
    //se non esistono cartella e file dico di crarli
    if (!fileProgetto.exists()){
        fileProgetto.mkdirs();
    }
    
    File dir2023= new File(fileProgetto,"2023");
     if (!dir2023.exists()){
        dir2023.mkdirs();
    }
    
    //creo un oggetto di tipo file che rappresenta il file
    File testo= new File(dir2023,"uffa.txt");
    
    if (!testo.exists()){
          testo.createNewFile();     
    }
    
    String absolutePatch= fileProgetto.getAbsolutePath();
    
        System.out.println(absolutePatch);
    
    
        
    } 
}
