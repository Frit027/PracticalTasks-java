package movables;

public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2,3);
        System.out.println(point);

        point.moveLeft();
        point.moveDown();
        System.out.println(point);

        MovableRectangle rectangle = new MovableRectangle(5,7,10,1,2,2);

        if(rectangle.isSpeedEqual())
            System.out.println("Одинаковая скорость точек.");
        else
            System.out.println("Скорость точек разная.");

        System.out.println(rectangle);

        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
