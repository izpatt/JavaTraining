package abstraction;

import java.sql.SQLOutput;

public class Triangle extends Shapes {

    public Triangle(String name, int noOfSides, double base, double height, double lengthOfSide) {
        this.name = name;
        this.noOfSides = noOfSides;
        this.base = base;
        this.height = height;
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    double computeArea() {
        return (height * base) / 2.00;
    }

    @Override
    double computePerimeter() {
        return base + lengthOfSide + lengthOfSide;
    }


}
