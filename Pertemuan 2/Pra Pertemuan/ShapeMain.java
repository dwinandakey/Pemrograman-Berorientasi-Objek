public class ShapeMain {
    public static void main(String[] args) {
        // Shape
        Shape s1 = new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("Blue", false);
        System.out.println(s2);
        // System.out.println(s2.getColor());
        // System.out.println(s2.isFilled());

        s2.setColor("yellow");
        System.out.println(s2);
        s2.setFilled(true);
        System.out.println(s2);

        Shape sh1 = new Shape();
        System.out.println(sh1);
        Shape sh2 = new Shape("blue", false);
        System.out.println(sh2);
        sh2.setColor("pink");
        System.out.println(sh2.isFilled());
        sh2.setFilled(true);
        System.out.println(sh2);
    }
}
