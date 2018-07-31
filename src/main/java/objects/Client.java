package objects;


public class Client {
    private String idClient;
    private String nameClient;
    private String phoneClient;
    private String emailClient;

    public Client(String idClient, String nameClient, String phoneClient, String emailClient) {
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.phoneClient = phoneClient;
        this.emailClient = emailClient;
    }

    public Client() {
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!idClient.equals(client.idClient)) return false;
        if (!nameClient.equals(client.nameClient)) return false;
        if (!phoneClient.equals(client.phoneClient)) return false;
        return emailClient.equals(client.emailClient);

    }

    @Override
    public int hashCode() {
        int result = idClient.hashCode();
        result = 31 * result + nameClient.hashCode();
        result = 31 * result + phoneClient.hashCode();
        result = 31 * result + emailClient.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "emailClient='" + emailClient + '\'' +
                ", phoneClient='" + phoneClient + '\'' +
                ", nameClient='" + nameClient + '\'' +
                ", idClient='" + idClient + '\'' +
                '}';
    }
}
