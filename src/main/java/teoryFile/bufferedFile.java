package teoryFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class bufferedFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File leggimi= new File("leggimi.txt");
        
        Writer output= new FileWriter(leggimi);
        
        // come decorator outup sfrutta la capacità di BufferedWriter
        //di prendere un oggetto di tipo Writer e restituire un
        //bufferedWriter
        output= new BufferedWriter(output);
        
        output.write("Ennessima prova buffered");
        output.flush();
        output.close();
        
        //stesso modo in modalità read
        
        //Reader input= new BufferedReader(new FileReader(leggimi));
        
        Reader input= new FileReader(leggimi);
        input= new BufferedReader(input);
        
       
        
    }
}
