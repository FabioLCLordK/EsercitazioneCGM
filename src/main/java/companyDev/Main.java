package companyDev;
public class Main {

    public static void main(String[] args) {
        Company IBM= new Company("Ibm", 15,1000000);
        
//        IBM.addDeveloper("Fabio", "La Ciura", "Java",1);
//        IBM.addDeveloper("Sara", "Bogo", "Python",5);
//        IBM.addDeveloper("Dany", "Spatola", "Java",3);
//        IBM.addDeveloper("Peppe", "Lombardo", "Assembly",10);
        
        AbsEmployee employee1= new Developer("Fabio", "La Ciura", "Java", 1);
        AbsEmployee employee2= new Developer("Sara", "Bogo", "Python",5);
        AbsEmployee employee3= new Developer("Dany", "Spatola", "Java",3);
        AbsEmployee employee4= new Developer("Peppe", "Lombardo", "Assembly",10);
        AbsEmployee employee5= new Employee("Turi", "Giacobbi", 10);
        
        IBM.addEmployee(employee1);
        IBM.addEmployee(employee2);
        IBM.addEmployee(employee3);
        IBM.addEmployee(employee4);
        IBM.addEmployee(employee5);
        
        
        
        
        //ah ecco  
        //vabe dai
        
        System.out.println("This is the Employee list in the company:");
        for(int x=0; x<IBM.getNumber();x++){
            System.out.println(IBM.getNominatif(x));
        }

        System.out.println(IBM.toString());
        }
    }
