package exercicios.resolvido_1.entities;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHours;

    // CONSTRUCTOR
    public Employee (String n, Integer h, Double vph) {
        setName(n);
        setHours(h);
        setValuePerHours(vph);
    }

    // SETTERS
    protected void setName(String name) { this.name = name; }
    protected void setHours(Integer hours) { this.hours = hours; }
    protected void setValuePerHours(Double valuePerHours) { this.valuePerHours = valuePerHours; }

    // GETTERS
    protected String getName() { return this.name; }
    protected Integer getHours() { return this.hours; }
    protected Double getValuePerHours() { return this.valuePerHours; }

    // METHODS
    public Double payment() { return ((float)getHours() * getValuePerHours()); }

    //TO STRING


    @Override
    public String toString() {
        return getName() + " - R$" + payment();
    }
}
