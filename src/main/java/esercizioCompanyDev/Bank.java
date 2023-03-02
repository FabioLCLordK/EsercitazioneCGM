package esercizioCompanyDev;
public abstract class Bank {
    private String name;
    private double found;
    private int IBANcounter=0;
    private int nextIban=1000000000;
    private String[] Ibans= new String[100];
    
//    public Bank(String name, double found) {
//        this.name = name;
//        this.found = found;
//    }
    
//    public Account AccountGen(String name, String surname, double ammount){
//        String ib= "IT10000000000000MM";
//        ib=ib+Integer.toString(nextIban);
//        this.nextIban+=1;
//        Account acc = new Account(name +" "+surname,ib, ammount);
//        this.accounts[IBANcounter]=acc;
//        IBANcounter++;
//        return acc;
//    }  
     
     
      public String ibanGen(){
        String ib= "IT10000000000000MM";
        ib=ib+Integer.toString(nextIban);
        this.nextIban+=1;
        IBANcounter++;
        return ib;
    }  
    
}
