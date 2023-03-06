package esercizioOspedale;
public class Sufferer implements Comparable<Sufferer>{
    private String firstname;
    private String lastname;
    private String illDescription;
    private TriageCode code;

    public Sufferer(String firstname, String lastname, String illDescription, TriageCode code) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.illDescription = illDescription;
        this.code = code;
    }

    @Override
    public int compareTo(Sufferer o) {
      int priority= -o.code.getCode() + this.code.getCode();
      if(priority==0){
          return 1;
      }
      return priority;
    }

    @Override
    public String toString() {
        return "Sufferer{" + "firstname=" + firstname + ", lastname=" + lastname + ", illDescription=" + illDescription + ", code=" + code + '}';
    }
    
}
