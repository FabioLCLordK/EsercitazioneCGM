package esercizioProxyServer;
public class ProxyServer implements Server{
    private Server targetServer;
    private enumIpCountry ipCountry;
    public ProxyServer(Server targetServer, enumIpCountry ipCountry) {
        this.targetServer = targetServer;
        this.ipCountry= ipCountry;
    }
    
    @Override
    public Resource getResource(String ipAdd, String resourceName) {
        String proxyIp= "";
        switch(ipCountry){
            case ITALY:
                proxyIp="39.123.453.234";
                break;
            case GERMANY:
                proxyIp="54.123.453.234";
                break;
            case FRANCE:
                proxyIp="39.123.453.234";
                break;
            case JAPAN:
                proxyIp="54.123.453.234";
                break;
        }
        
        Resource requiResource= targetServer.getResource("", resourceName);
        return requiResource;
     }
    
}
