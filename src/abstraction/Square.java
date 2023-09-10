package abstraction;

public class Square extends Shapes {

    public Square(String name, int noOfSides, double lengthOfSide) {
        this.name = name;
        this.noOfSides = noOfSides;
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    double computeArea() {
        return Math.pow(lengthOfSide, 2);
    }

    @Override
    double computePerimeter() {
        return 4 * lengthOfSide;
    }




}
