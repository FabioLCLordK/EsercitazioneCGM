package teoryGeneric;
public class Invoice <T> {
    private T id;
    private String toClient;
    private double amount;

    public Invoice(T id, String toClient, double amount) {
        this.id = id;
        this.toClient = toClient;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
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
