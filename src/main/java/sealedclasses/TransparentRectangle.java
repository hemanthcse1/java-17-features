package sealedclasses;

public non-sealed class TransparentRectangle extends Rectangle{
   private String color;

    public TransparentRectangle(double height, double width, String color){
        super(height,width);
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
