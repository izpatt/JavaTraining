package abstraction;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n******** Shapes ********");
        Shapes square = new Square("Square", 4, 5);
        square.print();
        
        Shapes rectangle = new Rectangle("Rectangle", 4, 5, 3);
        rectangle.print();

        Shapes triangle = new Triangle("Triangle", 3, 5,5,5);
        triangle.print();

        Shapes circle = new Circle("Circle", 6);
        circle.print();

    }
}
