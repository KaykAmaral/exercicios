package exercicios.resolvido_2.entities;

import exercicios.resolvido_2.entites.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(String color) {
        setColor(color);
    }

    protected void setColor(String color) { this.color = Color.valueOf(color); }
    protected Color getColor() { return this.color; }

    public abstract double area();


}
