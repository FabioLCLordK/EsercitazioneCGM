package esercizioCompanyDev;
public class Company {
    private String name;
    private AbsEmployee[] emp;
    private int count = 0;
    private int MAX_DEV=1;
    private Account account;

    public Company(String name,int MAX_DEV, double amount) {
        this.name = name;
        this.MAX_DEV=MAX_DEV;
        this.emp= new AbsEmployee[15];  
        this.account= new Account(name, amount);
    }
    //a
    
    
    public void addDeveloper(String no, String sur, String lang, int servAge){
        if (this.count <MAX_DEV){
            Developer dev = new Developer(no,sur,lang,servAge);
            this.emp[this.count]=dev;
            this.count+=1;
        }else{
            System.out.println("You get the Dev limit");
        }
    }
    
     public void addEmployee(AbsEmployee emp){
        if (this.count <MAX_DEV){
            this.emp[this.count]=emp;
            this.count+=1;
        }else{
            System.out.println("You get the Dev limit");
        }
    }
    
    
    public int getNumber(){
        return this.count;
    }
    
    /*public Developer[] getDevs(){
        return this.emp;
        }
    */
    
    public String getName(){
        return name;
    }

    public String getNominatif(int x) {
        return this.emp[x].getNamSur();
    }
    
    public double payDevs(){
        double payment=0.0;
        double sal=0.0;
        for (int i=0;i<this.count;i++){
            AbsEmployee thisDev= this.emp[i];
            if (thisDev.getServiceAge()>=10){
                sal=2500;
            }else if((thisDev.getServiceAge()>5)){
                sal=2000;
            }else{
                sal=1500;
            }
            
            emp[i].setSalary(sal);
                this.account.transferTo(thisDev.getAccount(), sal);
                payment+=sal;
                
            System.out.println("I just transfert " +sal+ " € to " + thisDev.getName());
        }
        
        return ( payment);
        
        
    }

    @Override
    public String toString() {
        return "The Company "+ this.name + " spent " + payDevs();
    }
    }
 
