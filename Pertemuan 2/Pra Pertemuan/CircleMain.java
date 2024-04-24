public class CircleMain {
    public static void main(String[] args) {
        // Circle c1 = new Circle(10,"Black",false);
        // System.out.println("Circle:"+"radius = " + c1.getRadius()+"color = " +
        // c1.getColor()+"area = " + c1.getArea());
        // System.out.println(c1);

        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());

        Circle c2 = new Circle(7.0, "Black", false);
        // c2.setRadius(7.0);
        // c2.setColor("Black");
        // c2.setFilled(false);
        System.out.println("\n" + c2);
        System.out.println("Area = " + c2.getArea());
        System.out.println("Perimeter = " + c2.getPerimeter());

    }
}
