package exercicios.ex16_1.entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Contract {

    ArrayList<Installment> installments = new ArrayList<>();

    private Integer number;
    private LocalDate date;
    private Double totalValue;

    public Contract(int number, LocalDate date, double totalValue) {
        setNumber(number); setDate(date); setTotalValue(totalValue);
    }

    public void setNumber(int number) { this.number = number; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setTotalValue(double totalValue) { this.totalValue = totalValue; }
    public int getNumber() { return this.number; }
    public LocalDate getDate() { return this.date; }
    public double getTotalValue() { return this.totalValue; }

    public void addInstailment(Installment installment) { installments.add(installment); }
    public List<Installment> getInstallment() { return installments; }

}