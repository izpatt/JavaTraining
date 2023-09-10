package abstraction;

import static java.lang.Math.*;


public class Circle extends Shapes {

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    double computeArea() {
        return Math.PI * (Math.pow(radius, radius));
    }

    @Override
    double computePerimeter() {
        return 2.00 * PI * radius;
    }




}
