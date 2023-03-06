package esercizioContocorrente;
public class Movimento implements Runnable{
    private Account account;
    private double money;
    private Account target;
    

    public Movimento(Account account, double money, Account target) {
        this.account = account;
        this.money = money;
        this.target = target;
    }
       
    
    @Override
    public void run() {
        
        //togliendo il SYnchronized si ottengono problemi al ritiro "moltiplicando" i soldi
        synchronized(account){
                  account.transferTo(target, money);
                  System.out.println("Movimento di "+ money + " eseguito");
                  }
                  try{
                      Thread.sleep(1000);
                  }catch(InterruptedException ex){

                  }    
    }
    
    
    
}
