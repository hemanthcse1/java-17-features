package sealedclasses;

public sealed class Rectangle extends Shape permits FilledRectangle, TransparentRectangle{
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }
}
