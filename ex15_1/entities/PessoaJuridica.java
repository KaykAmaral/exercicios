package exercicios.ex15_1.entities;

public final class PessoaJuridica extends Pessoa {

    private int numeroFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        setNumeroFuncionarios(numeroFuncionarios);
    }

    private void setNumeroFuncionarios(int numeroFuncionarios) { this.numeroFuncionarios = numeroFuncionarios; }
    private int getNumeroFuncionarios() { return numeroFuncionarios; }

    @Override
    public double calculoDeImposto() {
        double valorImposto;
        if (getNumeroFuncionarios() > 10) {
            valorImposto = (getRendaAnual() * 0.14);
        } else {
            valorImposto = (getRendaAnual() * 0.16);
        }

        return valorImposto;
    }

    @Override
    public String toString() {
        System.out.printf("%s:   -   $%.2f\n", getNome(), calculoDeImposto());
        return null;
    }

}
