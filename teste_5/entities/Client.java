package exercicios.teste_5.entities;

import java.util.Objects;

public class Client {

    private String name;
    private String ssn;

    public Client(String name, String ssn) { setName(name); setSsn(ssn); }

    private void setName(String name) { this.name = name; }
    private void setSsn(String ssn) { this.ssn = ssn; }
    private String getName() { return this.name; }
    private String getSsn() { return this.ssn; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(getName(), client.getName()) && Objects.equals(getSsn(), client.getSsn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSsn());
    }
}