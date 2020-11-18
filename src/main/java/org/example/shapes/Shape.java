package org.example.shapes;

public class Shape {
    private Double area;
    private Color color;

    public Shape(Double area, Color color) {
        this.area = area;
        this.color = color;
    }

    public Shape (int area, Color color){
        this.area = (double) area;
        this.color = color;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
