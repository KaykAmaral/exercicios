package exercicios.teste_3.entities;

public final class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        setHeight(height);
        setWidth(width);
    }

    private void setHeight(Double height) { this.height = height; }
    private void setWidth(Double width) { this.width = width; }
    private Double getHeight() { return this.height; }
    private Double getWidth() { return this.width; }

    @Override
    public Double area() { return (getHeight() * getWidth()); }

}