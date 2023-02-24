package esercizioCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Documentation {
    private User[] array;
    private final File documentiDir = new File("C:\\Users\\setti\\Documents\\NetBeansProjects\\CGMLessonProject\\esercizioCSV\\Documents");
    
    public Documentation(User... array){
         // CREO LA MIA DIRECTORY
        if(!documentiDir.exists()) { 
            documentiDir.mkdirs();
        }
        this.array= array;
    }
    
    
    public void writeCsv(String nameFile) throws IOException{
       
     try{ 
        String name= nameFile+".csv";
        File prova = new File(documentiDir, name); 
        if(!prova.exists()){
            prova.createNewFile();
        }       
        Writer output= new FileWriter(prova);
        output= new BufferedWriter(output);
        for(User x:array){
            output.write(x.toString()+"\n");
        }
        output.flush();
        output.close();
    }catch(IOException e){
            System.out.println("I0Exception: " + e.getMessage());
    }
    }           
            
    public User[] readCsv(String nameFile) throws FileNotFoundException,IOException{
        try{ 
            File prova = new File(documentiDir, nameFile);
            /*
            Reader inputFile= new FileReader(prova);
            String testo="";
            int x;
            while((x=inputFile.read()) != -1){
                testo+= (char) x;
                System.out.print(testo);
                testo="";
            }
             inputFile.close();
             */
            

            
            // USO SCANNER invece di fileReader
            Scanner scan = new Scanner(prova);
            int userNum = 0;
            List<User> lista= new ArrayList<>();
            
            int lineNum = 1;
            while(scan.hasNextLine()){
            String line = scan.nextLine();
                System.out.println(line);
                String[] field= line.split(",");
                User monoUser= new User(field[0],field[1],Integer.parseInt(field[2]));
                lista.add(monoUser);
            lineNum++;
            }
            scan.close(); 
            User[] temp= lista.toArray(new User[lista.size()]);
            return temp;
        }catch(FileNotFoundException e){
            System.out.println("File non trovato: " + e.getMessage());          
        }catch(IOException e){
            System.out.println("I0Exception: " + e.getMessage());
        }
       return null;
    }
   
}
