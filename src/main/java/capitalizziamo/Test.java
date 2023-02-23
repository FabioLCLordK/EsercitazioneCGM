package capitalizziamo;
public class Test {
    public static String capitalizeFirstChars(String src){
        src=src.strip();
        src= src.toLowerCase();
        String[] alfa= src.split(" ");
        String finale="";
        for(String x:alfa){
             finale+= x.substring(0, 1).toUpperCase() + x.substring(1)+" ";      
         }
        
        return finale ;
        
        // VERSIONE CON I CHAR()
        /*
        src = src.toLowerCase(); char[] chars = src.toCharArray(); 
        chars[0] = Character.toUpperCase(chars[0]); 
        for(int i=0; i<chars.length — 1; i++) { 
            if(!Character.isLetter(chars[1])) { 
                chars[i+1] = Character.toUpperCase(chars[l+1]); 
            } 
        } 
            return new String(chars); 
}       }
        */
    }
    
    public static void main(String[] args) {
        String ciao= "il mio noMe è faBIo88";
        System.out.println(ciao);
        
        ciao= capitalizeFirstChars(ciao);
        System.out.println(ciao);

        System.out.println(capitalizeFirstChars("eric cartman"));
        System.out.println(capitalizeFirstChars("ERIC CARTMAN"));
        System.out.println(capitalizeFirstChars("eric 90cartman"));
        System.out.println(capitalizeFirstChars(" eri72c 90cartman"));
        
    }
}
