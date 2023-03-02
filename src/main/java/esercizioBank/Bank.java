package esercizioBank;
public class Bank {
    private String name;
    private double found;
    private int IBANcounter=0;
    private int nextIban=1000000000;
    private Account[] accounts= new Account[100];
    
    public Bank(String name, double found) {
        this.name = name;
        this.found = found;
    }
    
    
    
    public Account AccountGen(String name, String surname, double ammount){
        String ib= "IT10000000000000MM";
        ib=ib+Integer.toString(nextIban);
        this.nextIban+=1;
        Account acc = new Account(name +" "+surname,ib, ammount);
        this.accounts[IBANcounter]=acc;
        IBANcounter++;
        return acc;
    }

    public void printAccounts() {
//        for (Account x:this.accounts){
//            System.out.println(x.getData());
//        }
        for (int i=0;i<IBANcounter;i++){
            System.out.println(this.accounts[i].getData());
        }
    }
    
    
    
    
}
