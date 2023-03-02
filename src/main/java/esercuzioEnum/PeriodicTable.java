package esercuzioEnum;

//gli enum sono classi a tutti gli effetti! Ma con delle particolarità
public enum PeriodicTable {
    HYDROGEN("H",1,1.008), 
    HELIUM("He",2,4.003), 
    LITHIUM("Li",3,6.491);
    
    // se fosse stata una classe avrei dovuto scrivere:
    // public static final PeriodicTable HYDROGEN= new PeriodicTable("H",1,1.008),
    
    private String symbol;
    private int atomicNumber;
    private double atomicMass;
    
    
    //costruttore PRIVATO
    
    private PeriodicTable(String symbol,int atomic, double mass){
        this.symbol=symbol;
        this.atomicMass=mass;
        this.atomicNumber=atomic;
    }
    
    
}
