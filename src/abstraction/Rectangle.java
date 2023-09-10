package abstraction;

public class Rectangle extends Shapes {

    public Rectangle(String name, int noOfSides, double height, double width) {
        this.name = name;
        this.noOfSides = noOfSides;
        this.height = height;
        this.width = width;
    }

    @Override
    double computeArea() {
        return width * height;
    }

    @Override
    double computePerimeter() {
        return 2.00 * (height + width);
    }



}
