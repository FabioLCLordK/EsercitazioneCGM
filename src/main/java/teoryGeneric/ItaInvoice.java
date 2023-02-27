package teoryGeneric;
public class ItaInvoice {
    private int id;
    private String toClient;
    private double amount;

    public ItaInvoice(int id, String toClient, double amount) {
        this.id = id;
        this.toClient = toClient;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
