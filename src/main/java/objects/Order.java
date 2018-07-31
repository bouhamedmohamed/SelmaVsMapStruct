package objects;

import java.time.LocalDate;


public class Order {
    private String idOrder;
    private LocalDate dateOrder;
    private String commentOrder;
    private Client client;


    public Order() {
    }

    public Order(String id, LocalDate dateOrder, String commentOrder, Client client) {
        this.idOrder = id;
        this.dateOrder = dateOrder;
        this.commentOrder = commentOrder;
        this.client = client;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getCommentOrder() {
        return commentOrder;
    }

    public void setCommentOrder(String commentOrder) {
        this.commentOrder = commentOrder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
