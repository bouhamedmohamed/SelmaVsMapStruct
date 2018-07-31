package dtos;

import objects.Client;

import java.time.LocalDate;

public class OrderDTO {

    private String idOrderInternal;
    private LocalDate dateOrder;
    private String commentOrder;
    private Client client;


    public OrderDTO( ) {
    }

    public String getIdOrderInternal() {
        return idOrderInternal;
    }

    public void setIdOrderInternal(String idOrderInternal) {
        this.idOrderInternal = idOrderInternal;
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

    @Override
    public String toString() {
        return "OrderDTO{" +
                "client=" + client +
                ", commentOrder='" + commentOrder + '\'' +
                ", dateOrder=" + dateOrder +
                ", idOrderInternal='" + idOrderInternal + '\'' +
                '}';
    }
}
