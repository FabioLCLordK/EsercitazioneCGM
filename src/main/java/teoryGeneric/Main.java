package teoryGeneric;
public class Main {
    public static void main(String[] args) {
        
//        // prima dovevo definire due classi divere
//        ItaInvoice invoiceAlfio= new ItaInvoice(34,"Alfio",500);
//        GermanInvoice invoiceFrizz= new GermanInvoice("AE£E","Frizz",1000);
        
        // ma dopo aver definiro la variabile generica nella classe generica Invoice
        // posso chiamare il metodo che mi serve
        Invoice<Integer> invoiceAlfio= new Invoice(34,"Alfio",500);
        Invoice<String> invoiceFrizz= new Invoice("AE£E","Frizz",1000);
        
        
    }
}
