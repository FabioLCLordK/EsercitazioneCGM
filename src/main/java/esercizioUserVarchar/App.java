package esercizioUserVarchar;

import java.nio.charset.Charset;
import java.util.Arrays;

    public class App {
        public static void main(String[] args) {
        String firstname = "fabio";
        byte[] firstnameBytes = firstname.getBytes(Charset.forName( "utf8")); 
        System.out.println(firstnameBytes.length);
        System.out.println(Arrays. toString(firstnameBytes)); 
        System.out.print((byte) firstnameBytes.length);
        for(int i=0; i<firstnameBytes.length; i++) { 
            System.out.println(firstnameBytes[i]);
        } 
        }
}
