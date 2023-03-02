package esercizioBank;
public class Account {
    private String nominal;
    private String Iban;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public String getData(){
        return nominal +" "+ Iban;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }

    
    public Account(String nam, String Iban, double amount) {
//        if (Iban.length()==27){
//            this.Iban = Iban;
//        }else{
//            System.out.println("Error, Wrong Iban");
//        }
        this.Iban=Iban;
        this.amount = amount;
        this.nominal= nam;
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
    
    
}
