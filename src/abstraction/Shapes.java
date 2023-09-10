package abstraction;

public abstract class Shapes {

    protected String name;
    protected int noOfSides;
    protected double radius;
    protected double height;
    protected double width;
    protected double base;
    protected double lengthOfSide;

    abstract double computeArea();
    abstract double computePerimeter();

    void print() {
        System.out.println("\nComputation for " + name + " with sides equal to " + noOfSides +
                "\nArea: " + "\t\t\t" + String.format("%.2f", computeArea()) + "\nPerimeter: " +
                "\t\t" + String.format("%.2f", computePerimeter()));
    }

}
