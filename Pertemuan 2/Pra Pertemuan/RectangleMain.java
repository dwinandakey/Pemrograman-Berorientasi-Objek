public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1");
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(5.0, 3.0);
        System.out.println("\nRectangle 2");
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        Rectangle r3 = new Rectangle(3.0, 5.0, "Yellow", false);
        System.out.println("\nRectangle 3");
        System.out.println(r3);
        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());

    }
}
