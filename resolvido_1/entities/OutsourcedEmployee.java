package exercicios.resolvido_1.entities;

public final class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    // CONSTRUCTOR
    public OutsourcedEmployee(String n, Integer h, Double vph, Double ac) {
        super(n, h, vph);
        setAdditionalCharge(ac);
    }

    // SETTERS
    private void setAdditionalCharge(Double additionalCharge) { this.additionalCharge = additionalCharge; }

    // GETTERS
    private Double getAdditionalCharge() { return this.additionalCharge; }

    // METHODS
    @Override
    public Double payment() { return (((float)getHours() * getValuePerHours()) + (getAdditionalCharge() * 1.1)); }

    // TO STRING
    @Override
    public String toString() {
        return getName() + " - R$" + payment();
    }

}
