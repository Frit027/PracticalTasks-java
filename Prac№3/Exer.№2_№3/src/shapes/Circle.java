package shapes;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        this(1);
    }

    public  Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Color: " + color + ". Filled: " + filled + ". Radius: " + radius
                + ". Area: " + getArea() + ". Perimetr: " + getPerimeter();
    }
}
