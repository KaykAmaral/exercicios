package exercicios.resolvido_3.Service;

public class UsaInterestService implements InterestService{

    private double interestRate;

    public UsaInterestService(double interestRate) { setInterestRate(interestRate); }

    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
    @Override
    public double getInterestRate() { return this.interestRate; }

}