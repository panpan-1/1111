package 作业java;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class TestCircleRectangle11_4 {
    public static void main(String[] args) {
    	CircleFromSimpleGeometricObject11_2 circle = new CircleFromSimpleGeometricObject11_2();
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getColor());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromSimpleGeometricObject11_3 rectangle = new RectangleFromSimpleGeometricObject11_3(2,4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
