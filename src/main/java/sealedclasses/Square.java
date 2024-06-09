package sealedclasses;

public final class Square extends Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

}
