package Q6;

import javax.swing.*;

public class Circle {
    public float radius;
    private final double PI = Math.PI;

    public Circle (double radius){
        this.radius=(float) radius;
    }

    public Circle(){
        this.radius=0;
    }

    public double getPerimeter(){
        return PI*2*this.radius;
    }

    public double getArea(){
        return PI*Math.pow(radius,2);
    }

    public String show() {
        return "Circle{" +
                " radius=" + radius +
                " perimeter="+this.getPerimeter()+
                " area="+this.getArea()+'}';
    }
}
