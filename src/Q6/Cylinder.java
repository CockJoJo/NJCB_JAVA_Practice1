package Q6;

public class Cylinder extends Circle {
    private float height;
    private static final double PI = Math.PI;
    public Cylinder(double radius,double h){
        super(radius);
        this.height = (float) h;
    }

    public double getVolume() {
        return Math.pow(this.radius,2)*this.height*PI;
    }

    public String showVolume() {
        return "Cylinder{" +
                " height=" + this.height +
                " radius=" + this.radius +
                " volume=" + this.getVolume()+'}';
    }
}
