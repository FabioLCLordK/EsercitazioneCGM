package teoryGeneric;
public class GermanInvoice {
    private String id;
    private String toClient;
    private double amount;

    public GermanInvoice(String id, String toClient, double amount) {
        this.id = id;
        this.toClient = toClient;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToClient() {
        return toClient;
    }

    public void setToClient(String toClient) {
        this.toClient = toClient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
