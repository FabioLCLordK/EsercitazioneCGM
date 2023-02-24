package teoryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileMain2 {
    public static void main(String[] args) throws IOException{
    
    // CREO LA MIA DIRECTORY
    File documentiDir = new File("C:\\Users\\setti\\Documents\\NetBeansProjects\\CGMLessonProject\\Documenti"); 
    if(!documentiDir.exists()) { 
        documentiDir.mkdirs();
    } 
    //CREO IL MIO FILE DI TESTO
    File testo = new File(documentiDir, "testo.txt"); 
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
    
    //FACCIO UNO OUTSTREAM SU README
    
    byte[] datas = {99, 98, 97};
    OutputStream outputStream = new FileOutputStream(readme);
    
    outputStream.write((byte) 99); 
    outputStream.write((byte) 98); 
    outputStream.write((byte) 97); 
    outputStream.flush(); 
    outputStream.close(); 
    
    //FACCIO UN INPUNTSTREAM SU README
    
    final int fileL= (int) readme.length();
    
    byte[] moredatas=new byte[fileL];
    InputStream inputStream= new FileInputStream(readme);
    
    int data;
    int i=0;

    while((data= inputStream.read()) !=-1){
        moredatas[i]= (byte) data;
        i++;
    }
    inputStream.close();
    System.out.println(Arrays.toString(moredatas));
    }
}
