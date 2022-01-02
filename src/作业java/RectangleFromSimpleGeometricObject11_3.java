package 作业java;

public class RectangleFromSimpleGeometricObject11_3 extends SimpleGeometricObject11_1 {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject11_3(){
    }

    public RectangleFromSimpleGeometricObject11_3(double width,double height){
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject11_3(double width,double height,String color,boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
