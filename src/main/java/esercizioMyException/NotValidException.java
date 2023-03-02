package esercizioMyException;

// dato che fa parte delle UNCHECKED le faccio estendere RuntimeException
public class NotValidException extends RuntimeException{
    
    //vanno necessariamente ricreati TUTTI i costruttori della super classe estesa
    
    public NotValidException(){
        super("NotValidException: ");
    }

    public NotValidException(String message) {
        super(message);
    }

    public NotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidException(Throwable cause) {
        super(cause);
    }
    
    public void print(){
        System.out.println(this.getMessage() + "No Negative Valor");
    }
    
    
}
