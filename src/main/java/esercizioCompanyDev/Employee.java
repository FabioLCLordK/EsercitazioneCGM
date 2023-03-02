package esercizioCompanyDev;

public class Employee implements AbsEmployee{
    private String name;
    private String surname;
    private Account account;
    private int serviceAge;
    private double salary;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Account getAccount() {
        return account;
    }
    public int getServiceAge() {
        return serviceAge;
    }
    public double getSalary() {
        return salary;
    }
    
    
    public Employee(String name, String surname, int serv) {
        this.name = name;
        this.surname = surname;
        this.serviceAge=serv;
        this.account= new Account(name + surname, 0);
        
    } 
    
    
    public void setAccount(String iban){
        this.account= new Account(this.name+" " + this.surname, iban, 0);
    }
    
    @Override
    public String getNamSur(){
        return " - " + this.name +" "+this.surname +" ";
    }
    
    @Override
    public void setSalary(double x){
        this.salary= x;
    }

    public String getNaminatif() {
        return getName() + " " +getSurname();
    }
}
