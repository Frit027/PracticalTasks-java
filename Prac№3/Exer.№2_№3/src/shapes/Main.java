package shapes;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle(5.0, "green", true);
	    Rectangle rectangle = new Rectangle(12.3, 10.5, "red", true);
	    Square square = new Square(6, "black", false);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        circle.setFilled(false);
        circle.setRadius(3.5);

        square.setSide(12.9);

        System.out.println(circle);
        System.out.println(square);

        /*************************************Exercise №3*******************************************/
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());        // метод getRadius() принадлежит Cicle, а не Shape

        Circle c1 = (Circle)s1;                    // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();                    // нельзя создать объект абстракного класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());        // метод getLength() принадлежит Rectangle, а не Shape

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());          // метод getSide() принадлежит Square, а не Shape

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());        // метод getSide() принадлежит Rectangle, а не Shape
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
