package esercizioInvoice;

import teoryGeneric.*;

public class Invoice <T extends Integer> implements Comparable<Invoice>{
    private T id;
    private String clientId;
    private double amount;

    public Invoice(T id, String clientId, double amount) {
        this.id = id;
        this.clientId = clientId;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getToClient() {
        return clientId;
    }

    public void setToClient(String toClient) {
        this.clientId = toClient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", clientId=" + clientId + ", amount=" + amount + '}';
    }

    @Override
    public int compareTo(Invoice rInvoice) {
        return this.getId()-rInvoice.getId();
    }
    
    
}
