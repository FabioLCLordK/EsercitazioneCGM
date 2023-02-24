package teoryFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import javax.print.attribute.standard.PrinterStateReason;

public class testFileWrite {
    public static void main(String[] args) throws IOException {
        
        File readme= new File("readme.txt");
        if(!readme.exists()){
            readme.createNewFile();
        }
        
        
        // inserendo true dopo il file, gli diciamo di fare Append 
        // a ciò che abbiamo già nel file (in caso contrario sarà False)
        
        Writer myFile= new FileWriter(readme, true);
//        myFile.write('c');
//        myFile.write('i');
//        myFile.write('a'); 
//        myFile.write('o');
//        myFile.write('2');
//        myFile.flush();
//        myFile.close();
        
        // Oppure posso fare
        
        try{
            Reader input= new FileReader(readme);
            String testo="";
            int data;
            while((data=input.read()) != -1){
                //System.out.println((char) data);
                testo+= (char) data;
            }
            System.out.println(testo);
            //prima l'eccezione più specifica, dopo quella più generica
        }catch(FileNotFoundException e){
            System.out.println("File non trovato: " + e.getMessage());          
        }catch(IOException e){
            System.out.println("I0Exception: " + e.getMessage());
        }
        myFile.close();
        //oppure vi è anche printwriter!
        
        try{
            //per sovrascrivere il precedente file
            //PrintWriter writeMe= new PrintWriter(readme);
           
            //per aggiungere invece che resettare il file
            PrintWriter writeMe= new PrintWriter(new FileWriter(readme,true));
            writeMe.println("Ciao");
            writeMe.println("Ciao");
            writeMe.println("Ciao... Maare");
            writeMe.flush();
            writeMe.close();
            
            
        }catch(FileNotFoundException a){
            System.out.println("File not found ");
        }catch(IOException e){
            System.out.println("I0Exception: " + e.getMessage());
        }
        
        
    }
}
