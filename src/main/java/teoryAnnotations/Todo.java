package teoryAnnotations;
//nelle interfacce i metodi sono sempre public e abstrac di default
//la @ davanti interface la fa diventare una annotazione

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//l'annotazione @Target serve a dare un "target" alle annotazioni descritte
//come un dato, un campo, un metodo


@Target(value = {ElementType.TYPE,ElementType.METHOD})  //queesto indica che Todo può essere applicato SOLO
                                   //a TIPI di dato, come una classe E i metodi

//con Retemtion si limita la visibilità della Annotation 
@Retention(value = RetentionPolicy.SOURCE) //source solo all'interno del codice sorgente
public @interface Todo {
    String value() default "Sono la value";  //abilità la possibilità di mettere una value (annotazioni a singolo attributo, se non ci sono altri attributi)
    
    //se le Annotazioni NON hanno attributi, sono chiamati "MARKER"
    
    String description()  default "";
    int priority() default 1;
    
}
