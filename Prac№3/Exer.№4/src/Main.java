public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3, 5, 4,2);
        MovableCircle circle = new MovableCircle(4,4,3,3,5);

        System.out.println(point);
        System.out.println(circle);

        point.moveDown();
        point.moveRight();
        System.out.println(point);

        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);
    }
}
