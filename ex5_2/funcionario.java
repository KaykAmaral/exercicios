package exercicios.ex5_2;

public class funcionario {

    String nome;
    double salarioBruto, taxa, incremento, salarioLiquido;

    // CONSTRUCTOR
    public funcionario(String n, double sb, double t, double i) {
        setNome(n);
        setSalarioBruto(sb);
        setTaxa(t);
        setIncremento(i);
        setSalarioLiquido(sb, t, i);
    }

    // SETTERS
    public void setNome(String n) { this.nome = n; }
    public void setSalarioBruto(double sb) { this.salarioBruto = sb; }
    public void setTaxa(double t) { this.taxa = t; }
    public void setIncremento(double i) { this.incremento = i; }
    public void setSalarioLiquido(double salB, double tax, double inc) { this.salarioLiquido = ( salB - tax ) + ( salB * ( inc / 100 )  ); }


    // GETTERS
    public String getNome() { return this.nome; }
    public double getSalarioBruto() { return this.salarioBruto; }
    public double getTaxa() { return this.taxa; }
    public double getIncremento() { return this.incremento; }
    public double getSalarioLiquido() { return this.salarioLiquido; }


    // TO STRING
    @Override
    public String toString() {
        System.out.printf("NOME: %s \nSALARIO: %.2f"
                , getNome()
                , getSalarioLiquido()

        );
        return null;
    }
}