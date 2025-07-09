package exercicios.ex8_desafio;

public class Aluguel {

    String nome;
    String email;

    public Aluguel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        System.out.printf("%s   ,   %s \n", getNome(), getEmail());
        return null;
    }
}
