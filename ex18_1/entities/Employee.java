package exercicios.ex18_1.entities;

import java.util.Objects;

public class Employee {

    private String name;
    private String email;
    private Double salary;

    public Employee(String name, String email, Double salary) {
        setName(name); setEmail(email); setSalary(salary);
    }

    private void setName(String name) { this.name = name; }
    private void setEmail(String email) { this.email = email; }
    private void setSalary(Double salary) { this.salary = salary; }

    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public Double getSalary() { return this.salary; }


    // Just comparing EMAILS
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
