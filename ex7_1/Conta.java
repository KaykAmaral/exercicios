package exercicios.ex7_1;

public class Conta {

    private int nConta;
    private String titular;
    private double saldo;

    // CONSTRUCTOR
    public Conta(String x, int y) {
        setTitular(x);
        setnConta(y);
    }


    // SETTERS
    private void setnConta(int nConta) { this.nConta = nConta; }
    private void setTitular(String titular) { this.titular = titular; }
    private void setSaldo(double saldo) { this.saldo = saldo; }


    // GETTERS
    private int getnConta() { return nConta; }
    private String getTitular() { return titular; }
    private double getSaldo() { return saldo; }


    // METODOS
    public void depositar(double num) { this.saldo += num; }
    public void sacar(double num) {
        if (!(this.saldo - num < -1000)) {
            this.saldo = getSaldo() - num - 5;
        }
    }
    public void mudarNome(String nom) { this.titular = nom; }


    // TO STRING
    @Override
    public String toString() {

        System.out.printf("n°Conta: %d \nTitular: %s \nSaldo: %.2f \n",
                getnConta(),
                getTitular(),
                getSaldo());

        return null;
    }

}
