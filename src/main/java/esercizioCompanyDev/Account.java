package esercizioCompanyDev;
public class Account extends Bank {
    private String name;
    private String Iban;
    private double amount=0.0;

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
   
    
    public Account(String Name, double amount) { 
        this.Iban = ibanGen();
        this.name= Name;
        this.amount = amount;
    }
    
      public Account(String Name, String iban, double amount) { 
        this.name= Name;
        this.amount = amount;
    }
    
   
    public void transferTo(Account to, double money) {
        if ((this.amount < money) || (money < 0)){
            //throw new RuntimeException("Spiacente credito non disponibile");
            System.out.println("Spiacente Operazione non disponibile");
            return;
        }
        this.amount-=money;
        to.amount+=money;
    }
    
    public static void transferTo(Account from, Account to, double money) {
        from.transferTo(to, money);
    }
    
   /* public static void transferTo(Account from, Account to, double money) {
        if ((from.amount < money) || (money < 0)){
            System.out.println("Spiacente Operazione non disponibile");
            return;
        }
        from.amount-=money;
        to.amount+=money;
    }
    */
    
}
