package exercicios.ex15_1.entities;

public abstract class Pessoa {

    private String nome;
    private double rendaAnual;

    public Pessoa(String nome, double rendaAnual) {
        setNome(nome);
        setRendaAnual(rendaAnual);
    }

    protected void setNome(String nome) { this.nome = nome; }
    protected void setRendaAnual(double rendaAnual) { this.rendaAnual = rendaAnual; }
    protected String getNome() { return this.nome; }
    protected double getRendaAnual() { return this.rendaAnual; }

    public abstract double calculoDeImposto();

}
