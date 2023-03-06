package esercizioContocorrente;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Account alberAccount= new Account("Alberto", "IT800A", 300);
        Account peppeAccount= new Account("Peppe", "IT800A2", 1);
        Account bancomatAccount= new Account("Bancomat", "IT80032", 0);
                
        Movimento bonifico= new Movimento(alberAccount, 300.0, peppeAccount);
        Movimento prelievo= new Movimento(alberAccount, 300.0, bancomatAccount);
        
        Thread bancomatThread= new Thread(bonifico);
        Thread appThread= new Thread(prelievo);
        
        bancomatThread.start();
        appThread.start();
        
        
        bancomatThread.join();
        appThread.join();
        System.err.println("Alberto ha ora "+ alberAccount.getAmount());
        System.err.println("Alberto ha prelevato "+bancomatAccount.getAmount());
        System.err.println("Peppe ha ora " + peppeAccount.getAmount());
    }
}
