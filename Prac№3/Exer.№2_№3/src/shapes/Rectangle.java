package shapes;

public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle(){
        this(1,1);
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Color: " + color + ". Filled: " + filled + ". Length: " + length + " Width: " + width
                + ". Area: " + getArea() + ". Perimetr: " + getPerimeter();
    }
}
