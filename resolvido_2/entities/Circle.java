package exercicios.resolvido_2.entities;

public final class Circle extends Shape{

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        setRadius(radius);
    }

    private void setRadius(double radius) { this.radius = radius; }
    private double getRadius() { return this.radius; }


    @Override
    public double area() { return (Math.PI * Math.pow(getRadius(), 2)); }

}
