package Projeto3.entities;

import Projeto3.enums.Color;

public abstract class Shape {
    
    private Color color;

    public Shape(){

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();
}
