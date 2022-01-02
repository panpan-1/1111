package 作业java;

import 作业java.CircleFromSimpleGeometricObject11_2;
import 作业java.RectangleFromSimpleGeometricObject11_3;
import 作业java.SimpleGeometricObject11_1;

public class PolymorphismDemo11_5 {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject11_2(1,"red",false));
        displayObject(new RectangleFromSimpleGeometricObject11_3(1,1,"black",true));
    }
    public static void displayObject(SimpleGeometricObject11_1 object){
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
