package exercicios.ex16_1.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private LocalDate dueDate;
    private double amount;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment(LocalDate dueDate, double amount) {
        setDueDate(dueDate); setAmount(amount);
    }

    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public void setAmount(double amount) { this.amount = amount; }
    public LocalDate getDueDate() { return this.dueDate; }
    public double getAmount() { return this.amount; }

    @Override
    public String toString(){
        System.out.println(getDueDate().format(fmt) + "  -  " + String.format("%.2f", getAmount()));
        return null;
    }

}