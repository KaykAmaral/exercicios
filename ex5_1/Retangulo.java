package exercicios.ex5_1;
public class Retangulo {
    double altura, largura, area, perimetro, diagonal;

    // SETTERS E GETTERS
    public void setAltura(double x) { this.altura = x; }
    public void setLargura(double x) { this.largura = x; }
    public double getArea() { return this.area = this.altura * this.largura; }
    public double getPerimetro() { return this.perimetro = (2 * this.largura) + (2 * this.altura); }
    public double getDiagonal() { return this.diagonal = Math.sqrt( Math.pow(this.largura , 2) + Math.pow(this.altura , 2) ); }

    // TO STRING

    public String toString() {
        System.out.printf("AREA = %.2f \nPERIMETRO = %.2f \nDIAGONAL = %.2f", getArea(), getPerimetro(), getDiagonal());
        return null;
    }

}