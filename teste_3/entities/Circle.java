package exercicios.teste_3.entities;


public final class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) { setRadius(radius); }

    private void setRadius(Double radius) { this.radius = radius; }
    private Double getRadius() { return this.radius; }

    @Override
    public Double area() { return (Math.PI * Math.pow(getRadius(), 2)); }

}