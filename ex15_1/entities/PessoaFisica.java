package exercicios.ex15_1.entities;

public final class PessoaFisica extends Pessoa{

    private double gastosComSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
        super(nome, rendaAnual);
        setGastosComSaude(gastosComSaude);
    }

    private void setGastosComSaude(double gastosComSaude) { this.gastosComSaude = gastosComSaude; }
    private double getGastosComSaude() { return this.gastosComSaude; }

    @Override
    public double calculoDeImposto() {
        double valorImposto;
        if (getRendaAnual() < 20000) {
            valorImposto = (getRendaAnual() * 0.15); // 15%
        } else {
            valorImposto = (getRendaAnual() * 0.25); // 25%
        }

        if (getGastosComSaude() > 0) {
            valorImposto -= (getGastosComSaude() * 0.5);
        }

        return valorImposto;
    }

    @Override
    public String toString() {
        System.out.printf("%s:   -   $%.2f\n", getNome(), calculoDeImposto());
        return null;
    }


}
