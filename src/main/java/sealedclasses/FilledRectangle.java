package sealedclasses;

public final class FilledRectangle extends Rectangle{
    private double transparency;


    public FilledRectangle(double height, double width, double transparency){
        super(height,width);
        this.transparency =transparency;
    }

    public double getTransparency(){
        return transparency;
    }

}
