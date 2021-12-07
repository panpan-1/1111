package 作业java;

public class CircleFromSimpleGeometricObject11_2 extends SimpleGeometricObject11_1 {
    private double radius;
    public CircleFromSimpleGeometricObject11_2(){
    }

    public CircleFromSimpleGeometricObject11_2(double radius){
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject11_2(double radius,String color,boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}

