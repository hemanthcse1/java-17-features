package sealedclasses;

public final class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
