package esercizioProxyServer;
public class Resource {
    String ipAddress;
    String resourceName;
    
    public Resource(){
        
    }
    
    public Resource(String ipAddress, String resourceName) {
        this.ipAddress = ipAddress;
        this.resourceName = resourceName;
    }
}   

