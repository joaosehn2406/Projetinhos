package Projeto3.entities;

import Projeto3.enums.Color;

public class Circle extends Shape{
    
    private Double radius;

    public Circle(){
        
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
