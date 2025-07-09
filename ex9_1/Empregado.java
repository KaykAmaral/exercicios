package exercicios.ex9_1;

public class Empregado {

    int id;
    String nome;
    double salario;


    // CONSTRUCTOR
    public Empregado(int id, String nome, double salario) {
        setId(id);
        setNome(nome);
        setSalario(salario);
    }


    // SETTERS
    private void setId(int id) { this.id = id; }
    private void setNome(String nome) { this.nome = nome; }
    private void setSalario(double salario) { this.salario = salario; }

    // GETTERS
    private int getId() { return this.id; }
    private String getNome() { return this.nome; }
    private double getSalario() { return this.salario; }


    // METODOS
    public void aumentarSalario(int porcentagem) {
        this.salario += this.salario * ((double) porcentagem / 100);
    }

    @Override
    public String toString() {
        System.out.printf("ID:         %d \nNOME:       %s \nSALARIO:    %.2f\n ----------\n\n",
                getId(), getNome(), getSalario());

        return null;
    }

}
