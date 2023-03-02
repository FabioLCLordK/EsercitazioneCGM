package esercizioBank;

public class Test {

    public static void main(String[] args) {
//        Account fabioAccount = new Account("Fabio La Ciura","IT800A111111111111111111111", 2500.0);
//        Account saraAccount = new Account("Sara Zago","ITciao11111111111111111112A", 1500.0);
        
//        fabioAccount.transferTo(saraAccount, 2000);
//        
//        System.out.println("La quantità di soldi nell'account di Fabio è " + fabioAccount.getAmount()+"€");
//        System.out.println("La quantità di soldi nell'account di è " +saraAccount.getAmount()+"€");
        
        
       Bank Mediol=new Bank("Mediolanum",10000000);
       
       Mediol.AccountGen("Fabio", "La Ciura", 2500);
       Mediol.AccountGen("Sara", "Zago", 1500);
       
       
       Mediol.printAccounts();
    }
}
