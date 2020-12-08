package Q6;

public class test {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5);
        Circle circle2 = new Circle();
        Cylinder cylinder = new Cylinder(2.5,10);

        System.out.println(circle1.show());
        System.out.println(circle2.show());
        System.out.println(cylinder.showVolume());

    }

}
