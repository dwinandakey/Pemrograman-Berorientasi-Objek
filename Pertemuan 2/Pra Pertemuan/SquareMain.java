public class SquareMain {
    public static void main(String[] args) {
        // Square
        System.out.println("Before Modification:");
        Square square = new Square(2.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        square.setColor("Blue");
        square.setFilled(false);
        System.out.println("\nAfter Modification:");
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
