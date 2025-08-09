package exercicios.resolvido_2.entities;

public final class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        setWidth(width);
        setHeight(height);
    }

    private void setWidth(double width) { this.width = width; }
    private void setHeight(double height) { this.height = height; }
    private double getWidth() { return this.width; }
    private double getHeight() { return this.height; }

    @Override
    public double area() { return (getHeight() * getWidth()); }

}
