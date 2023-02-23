package fileC;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileMain2 {
    public static void main(String[] args) throws IOException{
   
    File documentiDir = new File("C:\\Users\\setti\\Documents\\NetBeansProjects\\CGMLessonProject\\Documenti"); 
    if(!documentiDir.exists()) { 
        documentiDir.mkdirs();
    } // make directories } 
    File testo = new File(documentiDir, "readme.txt"); 
    if(!testo.exists()){
        testo.createNewFile();
    } 
    String absolutePath = testo.getAbsolutePath(); 
    System.out.println(absolutePath); 
    
    FileOutputStream outstream= new FileOutputStream(testo);
    outstream.close();
    
    File readme = new File(documentiDir, "readme.txt"); 
    if(!readme.exists()) { 
        readme.createNewFile(); 
    } 
    
    byte[] datas = {99, 98, 97};
    OutputStream outputStream = new FileOutputStream(readme);
    
    outputStream.write((byte) 99); 
    outputStream.write((byte) 98); 
    outputStream.write((byte) 97); 
    outputStream.flush(); 
    outputStream.close(); 
    }
}
