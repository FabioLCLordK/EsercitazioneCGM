package esercizioOspedale;
public enum TriageCode {    
RED(0),
YELLOW(1),
GREEN(2),
WHITE(3);

private int code;

private TriageCode(int code){
    this.code =code;
}
public int getCode(){
    return this.code;
}
}
