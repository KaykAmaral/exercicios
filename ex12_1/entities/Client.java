package exercicios.ex12_1.entities;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String name;
    private String email;
    private LocalDate birthDate;

    // CONSTRUCTOR
    public Client(String n, String e, String d) {
        setName(n);
        setEmail(e);
        setBirthDate(d);
    }

    // SETTERS
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setBirthDate(String bd) { this.birthDate = LocalDate.parse(bd, dtf); }

    // GETTERS
    public String getName() { return name; }
    public String getEmail() { return email; }
    public LocalDate getBirthDate() { return birthDate; }

    @Override
    public String toString() {
        return "Client: " + getName() + " (" + getBirthDate() + ") - " + getEmail();
    }

}