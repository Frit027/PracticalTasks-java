public class Ball{
    private String color;
    private int radius;

    public Ball(String color, int radius){
        this.color = color;
        this.radius = radius;
    }

    public Ball(String color){
        this(color, 7);
    }

    public Ball(){
        this("", 0);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return "Color: " + color + ". Radius: " + radius;
    }
}