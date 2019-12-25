package shapes;

public class Square extends Rectangle {

    public Square(){
        super(1,1);
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        width = length = side;
    }

    public double getSide() {
        return length;
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Color: " + color + ". Filled: " + filled + ". Side: " + length;
    }
}
