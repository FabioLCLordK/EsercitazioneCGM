package companyDev;
public class Developer extends Employee {

    private String pLanguage;
    
    public Developer(String name, String surname, String pLanguage, int serv) {
        super(name, surname, serv);
        this.pLanguage = pLanguage;

    }
       
   
    @Override
    public String getNamSur(){
        return super.getNamSur()+ "is a "+this.pLanguage+" develeoper;";
    }
}